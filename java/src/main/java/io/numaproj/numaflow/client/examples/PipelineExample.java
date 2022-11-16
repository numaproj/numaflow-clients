package io.numaproj.numaflow.client.examples;

import io.kubernetes.client.openapi.ApiClient;
import io.numaproj.numaflow.models.*;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Yaml;

public class PipelineExample {

        public static void main(String[] args) throws Exception {
                ApiClient client = Config.defaultClient();
                Configuration.setDefaultApiClient(client);
                GenericKubernetesApi<InterStepBufferService, InterStepBufferServiceList> isbsvcApi = new GenericKubernetesApi<>(
                                InterStepBufferService.class,
                                InterStepBufferServiceList.class,
                                "numaflow.numaproj.io",
                                "v1alpha1",
                                "interstepbufferservices",
                                ClientBuilder.defaultClient());

                GenericKubernetesApi<Pipeline, PipelineList> pipelineApi = new GenericKubernetesApi<>(
                                Pipeline.class,
                                PipelineList.class,
                                "numaflow.numaproj.io",
                                "v1alpha1",
                                "pipelines",
                                ClientBuilder.defaultClient());

                String namespace = "numaflow-system";

                InterStepBufferService isbSvc = new InterStepBufferService()
                                .metadata(new V1ObjectMeta().namespace(namespace)
                                                .name("default"))
                                .kind("InterStepBufferService")
                                .apiVersion("numaflow.numaproj.io/v1alpha1")
                                .spec(new InterStepBufferServiceSpec()
                                                .jetstream(new JetStreamBufferService()
                                                                .version("latest")));
                // Print out the ISB Service as YAML
                System.out.println(Yaml.dump(isbSvc));

                // Create the ISB Service
                KubernetesApiResponse<InterStepBufferService> isbSvcResponse = isbsvcApi.create(isbSvc);
                if (isbSvcResponse.isSuccess()) {
                        System.out.println("Succeeded to create an ISB Service.");
                } else {
                        System.out.println("Failed to create an ISB Service.");
                        System.out.println(isbSvcResponse.getStatus());
                }
                System.out.println(isbSvcResponse.isSuccess());

                Pipeline pipeline = new Pipeline().metadata(
                                new V1ObjectMeta().namespace(namespace).name("simple-pipeline"))
                                .kind("Pipeline").apiVersion("numaflow.numaproj.io/v1alpha1")
                                .spec(new PipelineSpec()
                                                .limits(new PipelineLimits().readTimeout("5s")
                                                                .readBatchSize(30l))
                                                .addVerticesItem(new AbstractVertex().name("in")
                                                                .source(new Source().http(new HTTPSource())))
                                                .addVerticesItem(new AbstractVertex().name("cat")
                                                                .udf(new UDF().builtin(new Function()
                                                                                .name("cat"))))
                                                .addVerticesItem(new AbstractVertex().name("out")
                                                                .sink(new Sink().log(new Object())))
                                                .addEdgesItem(new Edge().from("in").to("cat"))
                                                .addEdgesItem(new Edge().from("cat").to("out")));
                // Print out the pipeline as YAML
                System.out.println(Yaml.dump(pipeline));

                // Create the Pipeline
                KubernetesApiResponse<Pipeline> pipelineResponse = pipelineApi.create(pipeline);
                if (!pipelineResponse.isSuccess()) {
                        System.out.println("Failed to create a pipeline.");
                        System.out.println(pipelineResponse.getStatus());
                } else {
                        System.out.println("Succeeded to create a pipeline.");
                }

                // Delete the pipeline
                pipelineApi.delete(namespace, "simple-pipeline");
        }
}