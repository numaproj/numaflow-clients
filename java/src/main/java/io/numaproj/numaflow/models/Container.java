/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.2.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.numaproj.numaflow.models;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.kubernetes.client.openapi.models.V1EnvFromSource;
import io.kubernetes.client.openapi.models.V1EnvVar;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.openapi.models.V1SecurityContext;
import io.kubernetes.client.openapi.models.V1VolumeMount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * Container is used to define the container properties for user-defined functions, sinks, etc.
 */
@JsonPropertyOrder({
  Container.JSON_PROPERTY_ARGS,
  Container.JSON_PROPERTY_COMMAND,
  Container.JSON_PROPERTY_ENV,
  Container.JSON_PROPERTY_ENV_FROM,
  Container.JSON_PROPERTY_IMAGE,
  Container.JSON_PROPERTY_IMAGE_PULL_POLICY,
  Container.JSON_PROPERTY_RESOURCES,
  Container.JSON_PROPERTY_SECURITY_CONTEXT,
  Container.JSON_PROPERTY_VOLUME_MOUNTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Container {
  public static final String JSON_PROPERTY_ARGS = "args";
  private List<String> args = new ArrayList<>();

  public static final String JSON_PROPERTY_COMMAND = "command";
  private List<String> command = new ArrayList<>();

  public static final String JSON_PROPERTY_ENV = "env";
  private List<V1EnvVar> env = new ArrayList<>();

  public static final String JSON_PROPERTY_ENV_FROM = "envFrom";
  private List<V1EnvFromSource> envFrom = new ArrayList<>();

  public static final String JSON_PROPERTY_IMAGE = "image";
  private String image;

  public static final String JSON_PROPERTY_IMAGE_PULL_POLICY = "imagePullPolicy";
  private String imagePullPolicy;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private V1ResourceRequirements resources = null;

  public static final String JSON_PROPERTY_SECURITY_CONTEXT = "securityContext";
  private V1SecurityContext securityContext = null;

  public static final String JSON_PROPERTY_VOLUME_MOUNTS = "volumeMounts";
  private List<V1VolumeMount> volumeMounts = new ArrayList<>();

  public Container() { 
  }

  public Container args(List<String> args) {
    this.args = args;
    return this;
  }

  public Container addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
   */
  @javax.annotation.Nullable
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


  public Container command(List<String> command) {
    this.command = command;
    return this;
  }

  public Container addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Get command
   * @return command
   */
  @javax.annotation.Nullable
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


  public Container env(List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public Container addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
   */
  @javax.annotation.Nullable
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


  public Container envFrom(List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  public Container addEnvFromItem(V1EnvFromSource envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

  /**
   * Get envFrom
   * @return envFrom
   */
  @javax.annotation.Nullable
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


  public Container image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
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


  public Container imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  /**
   * Get imagePullPolicy
   * @return imagePullPolicy
   */
  @javax.annotation.Nullable
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


  public Container resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
   */
  @javax.annotation.Nullable
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


  public Container securityContext(V1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  /**
   * Get securityContext
   * @return securityContext
   */
  @javax.annotation.Nullable
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


  public Container volumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public Container addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * Get volumeMounts
   * @return volumeMounts
   */
  @javax.annotation.Nullable
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


  /**
   * Return true if this Container object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(this.args, container.args) &&
        Objects.equals(this.command, container.command) &&
        Objects.equals(this.env, container.env) &&
        Objects.equals(this.envFrom, container.envFrom) &&
        Objects.equals(this.image, container.image) &&
        Objects.equals(this.imagePullPolicy, container.imagePullPolicy) &&
        Objects.equals(this.resources, container.resources) &&
        Objects.equals(this.securityContext, container.securityContext) &&
        Objects.equals(this.volumeMounts, container.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, resources, securityContext, volumeMounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `args` to the URL query string
    if (getArgs() != null) {
      for (int i = 0; i < getArgs().size(); i++) {
        joiner.add(String.format("%sargs%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getArgs().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `command` to the URL query string
    if (getCommand() != null) {
      for (int i = 0; i < getCommand().size(); i++) {
        joiner.add(String.format("%scommand%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getCommand().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `env` to the URL query string
    if (getEnv() != null) {
      for (int i = 0; i < getEnv().size(); i++) {
        if (getEnv().get(i) != null) {
          joiner.add(String.format("%senv%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getEnv().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `envFrom` to the URL query string
    if (getEnvFrom() != null) {
      for (int i = 0; i < getEnvFrom().size(); i++) {
        if (getEnvFrom().get(i) != null) {
          joiner.add(String.format("%senvFrom%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getEnvFrom().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(String.format("%simage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getImage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `imagePullPolicy` to the URL query string
    if (getImagePullPolicy() != null) {
      joiner.add(String.format("%simagePullPolicy%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getImagePullPolicy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `resources` to the URL query string
    if (getResources() != null) {
      joiner.add(String.format("%sresources%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getResources()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `securityContext` to the URL query string
    if (getSecurityContext() != null) {
      joiner.add(String.format("%ssecurityContext%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSecurityContext()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `volumeMounts` to the URL query string
    if (getVolumeMounts() != null) {
      for (int i = 0; i < getVolumeMounts().size(); i++) {
        if (getVolumeMounts().get(i) != null) {
          joiner.add(String.format("%svolumeMounts%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getVolumeMounts().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    return joiner.toString();
  }
}

