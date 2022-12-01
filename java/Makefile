VERSION ?= main

ARTIFACT_VERSION := $(shell if [[ "$(VERSION)" =~ ^v[0-9]+\.[0-9]+\.[0-9]+.*  ]]; then echo ${VERSION} | cut -c2-; elif [[ "$(VERSION)" =~ ^main$$  ]]; then echo 0.0.0-SNAPSHOT; else echo $(VERSION); fi)

GENERATOR_VERSION := v5.2.1

DOCKER = docker run --rm -v `pwd -P`:/base --workdir /base
MVN = $(DOCKER) -v $(HOME)/.m2:/root/.m2 maven:3-openjdk-18 mvn -s settings.xml

publish: generate
	# https://help.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-apache-maven-for-use-with-github-packages
	@docker run -e JAVA_SDK_MAVEN_USER=$(JAVA_SDK_MAVEN_USER) -e JAVA_SDK_MAVEN_PASSWORD=$(JAVA_SDK_MAVEN_PASSWORD) --rm -v `pwd -P`:/base --workdir /base deploy -DskipTests -DaltDeploymentRepository=github::default::https://maven.pkg.github.com/numaproj/numaflow-clients

generate:
	rm -Rf ./docs ./src/test ./src/main/java/io/numaproj/numaflow/models/ pom.xml
	mkdir -p ./dist
	cat ../swagger.json | ../hack/swaggerfilter.py io.numaproj.numaflow | \
		sed 's/io.k8s.api.core.//' | \
		sed 's/io.k8s.apimachinery.pkg.apis.meta.//' | \
		sed 's/io.k8s.apimachinery.pkg.api.//' | \
		sed 's/io.numaproj.numaflow.v1alpha1.//' \
		> ./dist/swagger.json
	$(DOCKER) openapitools/openapi-generator-cli:$(GENERATOR_VERSION) \
		generate \
		-i /base/dist/swagger.json \
		-g java \
		-o /base \
		-p hideGenerationTimestamp=true \
		-p library=native \
		-p serializationLibrary=jsonb \
		-p dateLibrary=java8 \
		--api-package io.numaproj.numaflow.apis \
		--invoker-package io.numaproj.numaflow \
		--model-package io.numaproj.numaflow.models \
		--skip-validate-spec \
		--group-id io.numaproj.numaflow \
		--artifact-id numaflow-client-java \
		--artifact-version $(ARTIFACT_VERSION) \
		--import-mappings V1Time=java.time.Instant \
		--type-mappings V1Time=java.time.Instant \
		--import-mappings V1Duration=String \
		--type-mappings V1Duration=String \
		--import-mappings V1Affinity=io.kubernetes.client.openapi.models.V1Affinity \
		--import-mappings V1ConfigMapKeySelector=io.kubernetes.client.openapi.models.V1ConfigMapKeySelector \
		--import-mappings V1Container=io.kubernetes.client.openapi.models.V1Container \
		--import-mappings V1ContainerPort=io.kubernetes.client.openapi.models.V1ContainerPort \
		--import-mappings V1EnvFromSource=io.kubernetes.client.openapi.models.V1EnvFromSource \
		--import-mappings V1EnvVar=io.kubernetes.client.openapi.models.V1EnvVar \
		--import-mappings V1HostAlias=io.kubernetes.client.openapi.models.V1HostAlias \
		--import-mappings V1Lifecycle=io.kubernetes.client.openapi.models.V1Lifecycle \
		--import-mappings V1ListMeta=io.kubernetes.client.openapi.models.V1ListMeta \
		--import-mappings V1LocalObjectReference=io.kubernetes.client.openapi.models.V1LocalObjectReference \
		--import-mappings V1ObjectMeta=io.kubernetes.client.openapi.models.V1ObjectMeta \
		--import-mappings V1ObjectReference=io.kubernetes.client.openapi.models.V1ObjectReference \
		--import-mappings V1PersistentVolumeClaim=io.kubernetes.client.openapi.models.V1PersistentVolumeClaim \
		--import-mappings V1PodDisruptionBudgetSpec=io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec \
		--import-mappings V1PodDNSConfig=io.kubernetes.client.openapi.models.V1PodDNSConfig \
		--import-mappings V1PodSecurityContext=io.kubernetes.client.openapi.models.V1PodSecurityContext \
		--import-mappings V1Probe=io.kubernetes.client.openapi.models.V1Probe \
		--import-mappings V1ResourceRequirements=io.kubernetes.client.openapi.models.V1ResourceRequirements \
		--import-mappings V1SecretKeySelector=io.kubernetes.client.openapi.models.V1SecretKeySelector \
		--import-mappings V1SecurityContext=io.kubernetes.client.openapi.models.V1SecurityContext \
		--import-mappings V1Toleration=io.kubernetes.client.openapi.models.V1Toleration \
		--import-mappings V1Volume=io.kubernetes.client.openapi.models.V1Volume \
		--import-mappings V1VolumeDevice=io.kubernetes.client.openapi.models.V1VolumeDevice \
		--import-mappings V1VolumeMount=io.kubernetes.client.openapi.models.V1VolumeMount \
		--import-mappings V1Condition=io.kubernetes.client.openapi.models.V1Condition \
		--import-mappings ResourceQuantity=io.kubernetes.client.custom.Quantity \
		--type-mappings ResourceQuantity=io.kubernetes.client.custom.Quantity \
		--generate-alias-as-model

	sed 's/public class Pipeline/public class Pipeline implements io.kubernetes.client.common.KubernetesObject/g' src/main/java/io/numaproj/numaflow/models/Pipeline.java > tmp && mv tmp src/main/java/io/numaproj/numaflow/models/Pipeline.java
	sed 's/public class PipelineList/public class PipelineList implements io.kubernetes.client.common.KubernetesListObject/g' src/main/java/io/numaproj/numaflow/models/PipelineList.java > tmp && mv tmp src/main/java/io/numaproj/numaflow/models/PipelineList.java
	sed 's/public class Vertex/public class Vertex implements io.kubernetes.client.common.KubernetesObject/g' src/main/java/io/numaproj/numaflow/models/Vertex.java > tmp && mv tmp src/main/java/io/numaproj/numaflow/models/Vertex.java
	sed 's/public class VertexList/public class VertexList implements io.kubernetes.client.common.KubernetesListObject/g' src/main/java/io/numaproj/numaflow/models/VertexList.java > tmp && mv tmp src/main/java/io/numaproj/numaflow/models/VertexList.java
	sed 's/public class InterStepBufferService/public class InterStepBufferService implements io.kubernetes.client.common.KubernetesObject/g' src/main/java/io/numaproj/numaflow/models/InterStepBufferService.java > tmp && mv tmp src/main/java/io/numaproj/numaflow/models/InterStepBufferService.java
	sed 's/public class InterStepBufferServiceList/public class InterStepBufferServiceList implements io.kubernetes.client.common.KubernetesListObject/g' src/main/java/io/numaproj/numaflow/models/InterStepBufferServiceList.java > tmp && mv tmp src/main/java/io/numaproj/numaflow/models/InterStepBufferServiceList.java

	sed 's/<dependencies>/<dependencies><dependency><groupId>io.kubernetes<\/groupId><artifactId>client-java<\/artifactId><version>16.0.2<\/version><\/dependency>/g' pom.xml > tmp && mv tmp pom.xml

	$(DOCKER) maven:3-openjdk-18 \
		mvn install -DskipTests -Dmaven.javadoc.skip
pom.xml: generate

install: pom.xml
	mvn -f ./ install
