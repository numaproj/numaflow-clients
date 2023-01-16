/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.numaproj.numaflow.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.kubernetes.client.openapi.models.V1ContainerPort;
import io.kubernetes.client.openapi.models.V1EnvFromSource;
import io.kubernetes.client.openapi.models.V1EnvVar;
import io.kubernetes.client.openapi.models.V1Lifecycle;
import io.kubernetes.client.openapi.models.V1Probe;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.openapi.models.V1SecurityContext;
import io.kubernetes.client.openapi.models.V1VolumeDevice;
import io.kubernetes.client.openapi.models.V1VolumeMount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContainerBuilder
 */
@JsonPropertyOrder({
  ContainerBuilder.JSON_PROPERTY_ARGS,
  ContainerBuilder.JSON_PROPERTY_COMMAND,
  ContainerBuilder.JSON_PROPERTY_ENV,
  ContainerBuilder.JSON_PROPERTY_ENV_FROM,
  ContainerBuilder.JSON_PROPERTY_IMAGE,
  ContainerBuilder.JSON_PROPERTY_IMAGE_PULL_POLICY,
  ContainerBuilder.JSON_PROPERTY_LIFECYCLE,
  ContainerBuilder.JSON_PROPERTY_LIVENESS_PROBE,
  ContainerBuilder.JSON_PROPERTY_NAME,
  ContainerBuilder.JSON_PROPERTY_PORTS,
  ContainerBuilder.JSON_PROPERTY_READINESS_PROBE,
  ContainerBuilder.JSON_PROPERTY_RESOURCES,
  ContainerBuilder.JSON_PROPERTY_SECURITY_CONTEXT,
  ContainerBuilder.JSON_PROPERTY_STARTUP_PROBE,
  ContainerBuilder.JSON_PROPERTY_STDIN,
  ContainerBuilder.JSON_PROPERTY_STDIN_ONCE,
  ContainerBuilder.JSON_PROPERTY_TERMINATION_MESSAGE_PATH,
  ContainerBuilder.JSON_PROPERTY_TERMINATION_MESSAGE_POLICY,
  ContainerBuilder.JSON_PROPERTY_TTY,
  ContainerBuilder.JSON_PROPERTY_VOLUME_DEVICES,
  ContainerBuilder.JSON_PROPERTY_VOLUME_MOUNTS,
  ContainerBuilder.JSON_PROPERTY_WORKING_DIR
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContainerBuilder {
  public static final String JSON_PROPERTY_ARGS = "args";
  private List<String> args = null;

  public static final String JSON_PROPERTY_COMMAND = "command";
  private List<String> command = null;

  public static final String JSON_PROPERTY_ENV = "env";
  private List<V1EnvVar> env = null;

  public static final String JSON_PROPERTY_ENV_FROM = "envFrom";
  private List<V1EnvFromSource> envFrom = null;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private String image;

  public static final String JSON_PROPERTY_IMAGE_PULL_POLICY = "imagePullPolicy";
  private String imagePullPolicy;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private V1Lifecycle lifecycle = null;

  public static final String JSON_PROPERTY_LIVENESS_PROBE = "livenessProbe";
  private V1Probe livenessProbe = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PORTS = "ports";
  private List<V1ContainerPort> ports = null;

  public static final String JSON_PROPERTY_READINESS_PROBE = "readinessProbe";
  private V1Probe readinessProbe = null;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private V1ResourceRequirements resources = null;

  public static final String JSON_PROPERTY_SECURITY_CONTEXT = "securityContext";
  private V1SecurityContext securityContext = null;

  public static final String JSON_PROPERTY_STARTUP_PROBE = "startupProbe";
  private V1Probe startupProbe = null;

  public static final String JSON_PROPERTY_STDIN = "stdin";
  private Boolean stdin;

  public static final String JSON_PROPERTY_STDIN_ONCE = "stdinOnce";
  private Boolean stdinOnce;

  public static final String JSON_PROPERTY_TERMINATION_MESSAGE_PATH = "terminationMessagePath";
  private String terminationMessagePath;

  public static final String JSON_PROPERTY_TERMINATION_MESSAGE_POLICY = "terminationMessagePolicy";
  private String terminationMessagePolicy;

  public static final String JSON_PROPERTY_TTY = "tty";
  private Boolean tty;

  public static final String JSON_PROPERTY_VOLUME_DEVICES = "volumeDevices";
  private List<V1VolumeDevice> volumeDevices = null;

  public static final String JSON_PROPERTY_VOLUME_MOUNTS = "volumeMounts";
  private List<V1VolumeMount> volumeMounts = null;

  public static final String JSON_PROPERTY_WORKING_DIR = "workingDir";
  private String workingDir;


  public ContainerBuilder args(List<String> args) {
    this.args = args;
    return this;
  }

  public ContainerBuilder addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getArgs() {
    return args;
  }


  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArgs(List<String> args) {
    this.args = args;
  }


  public ContainerBuilder command(List<String> command) {
    this.command = command;
    return this;
  }

  public ContainerBuilder addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCommand() {
    return command;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommand(List<String> command) {
    this.command = command;
  }


  public ContainerBuilder env(List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public ContainerBuilder addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * List of environment variables to set in the container. Cannot be updated.
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of environment variables to set in the container. Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1EnvVar> getEnv() {
    return env;
  }


  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnv(List<V1EnvVar> env) {
    this.env = env;
  }


  public ContainerBuilder envFrom(List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  public ContainerBuilder addEnvFromItem(V1EnvFromSource envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

   /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   * @return envFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_ENV_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1EnvFromSource> getEnvFrom() {
    return envFrom;
  }


  @JsonProperty(JSON_PROPERTY_ENV_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvFrom(List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
  }


  public ContainerBuilder image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(String image) {
    this.image = image;
  }


  public ContainerBuilder imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
  @JsonProperty(JSON_PROPERTY_IMAGE_PULL_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_PULL_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public ContainerBuilder lifecycle(V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIFECYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1Lifecycle getLifecycle() {
    return lifecycle;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycle(V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }


  public ContainerBuilder livenessProbe(V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

   /**
   * Get livenessProbe
   * @return livenessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIVENESS_PROBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1Probe getLivenessProbe() {
    return livenessProbe;
  }


  @JsonProperty(JSON_PROPERTY_LIVENESS_PROBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLivenessProbe(V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }


  public ContainerBuilder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ContainerBuilder ports(List<V1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public ContainerBuilder addPortsItem(V1ContainerPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \&quot;0.0.0.0\&quot; address inside a container will be accessible from the network. Cannot be updated.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1ContainerPort> getPorts() {
    return ports;
  }


  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPorts(List<V1ContainerPort> ports) {
    this.ports = ports;
  }


  public ContainerBuilder readinessProbe(V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

   /**
   * Get readinessProbe
   * @return readinessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_READINESS_PROBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1Probe getReadinessProbe() {
    return readinessProbe;
  }


  @JsonProperty(JSON_PROPERTY_READINESS_PROBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadinessProbe(V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }


  public ContainerBuilder resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1ResourceRequirements getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public ContainerBuilder securityContext(V1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecurityContext getSecurityContext() {
    return securityContext;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityContext(V1SecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public ContainerBuilder startupProbe(V1Probe startupProbe) {
    this.startupProbe = startupProbe;
    return this;
  }

   /**
   * Get startupProbe
   * @return startupProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STARTUP_PROBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1Probe getStartupProbe() {
    return startupProbe;
  }


  @JsonProperty(JSON_PROPERTY_STARTUP_PROBE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartupProbe(V1Probe startupProbe) {
    this.startupProbe = startupProbe;
  }


  public ContainerBuilder stdin(Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

   /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   * @return stdin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
  @JsonProperty(JSON_PROPERTY_STDIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStdin() {
    return stdin;
  }


  @JsonProperty(JSON_PROPERTY_STDIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }


  public ContainerBuilder stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

   /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   * @return stdinOnce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
  @JsonProperty(JSON_PROPERTY_STDIN_ONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStdinOnce() {
    return stdinOnce;
  }


  @JsonProperty(JSON_PROPERTY_STDIN_ONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }


  public ContainerBuilder terminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

   /**
   * Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   * @return terminationMessagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_TERMINATION_MESSAGE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATION_MESSAGE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }


  public ContainerBuilder terminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

   /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   * @return terminationMessagePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_TERMINATION_MESSAGE_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATION_MESSAGE_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }


  public ContainerBuilder tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

   /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
   * @return tty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
  @JsonProperty(JSON_PROPERTY_TTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTty() {
    return tty;
  }


  @JsonProperty(JSON_PROPERTY_TTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTty(Boolean tty) {
    this.tty = tty;
  }


  public ContainerBuilder volumeDevices(List<V1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  public ContainerBuilder addVolumeDevicesItem(V1VolumeDevice volumeDevicesItem) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList<>();
    }
    this.volumeDevices.add(volumeDevicesItem);
    return this;
  }

   /**
   * volumeDevices is the list of block devices to be used by the container.
   * @return volumeDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeDevices is the list of block devices to be used by the container.")
  @JsonProperty(JSON_PROPERTY_VOLUME_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1VolumeDevice> getVolumeDevices() {
    return volumeDevices;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeDevices(List<V1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }


  public ContainerBuilder volumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public ContainerBuilder addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Pod volumes to mount into the container&#39;s filesystem. Cannot be updated.
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pod volumes to mount into the container's filesystem. Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_VOLUME_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public ContainerBuilder workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
   * @return workingDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
  @JsonProperty(JSON_PROPERTY_WORKING_DIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorkingDir() {
    return workingDir;
  }


  @JsonProperty(JSON_PROPERTY_WORKING_DIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  /**
   * Return true if this containerBuilder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerBuilder containerBuilder = (ContainerBuilder) o;
    return Objects.equals(this.args, containerBuilder.args) &&
        Objects.equals(this.command, containerBuilder.command) &&
        Objects.equals(this.env, containerBuilder.env) &&
        Objects.equals(this.envFrom, containerBuilder.envFrom) &&
        Objects.equals(this.image, containerBuilder.image) &&
        Objects.equals(this.imagePullPolicy, containerBuilder.imagePullPolicy) &&
        Objects.equals(this.lifecycle, containerBuilder.lifecycle) &&
        Objects.equals(this.livenessProbe, containerBuilder.livenessProbe) &&
        Objects.equals(this.name, containerBuilder.name) &&
        Objects.equals(this.ports, containerBuilder.ports) &&
        Objects.equals(this.readinessProbe, containerBuilder.readinessProbe) &&
        Objects.equals(this.resources, containerBuilder.resources) &&
        Objects.equals(this.securityContext, containerBuilder.securityContext) &&
        Objects.equals(this.startupProbe, containerBuilder.startupProbe) &&
        Objects.equals(this.stdin, containerBuilder.stdin) &&
        Objects.equals(this.stdinOnce, containerBuilder.stdinOnce) &&
        Objects.equals(this.terminationMessagePath, containerBuilder.terminationMessagePath) &&
        Objects.equals(this.terminationMessagePolicy, containerBuilder.terminationMessagePolicy) &&
        Objects.equals(this.tty, containerBuilder.tty) &&
        Objects.equals(this.volumeDevices, containerBuilder.volumeDevices) &&
        Objects.equals(this.volumeMounts, containerBuilder.volumeMounts) &&
        Objects.equals(this.workingDir, containerBuilder.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, stdin, stdinOnce, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerBuilder {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

