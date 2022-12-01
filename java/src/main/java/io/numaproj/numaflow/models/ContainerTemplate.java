/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.4
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
import io.kubernetes.client.openapi.models.V1EnvVar;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.openapi.models.V1SecurityContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContainerTemplate defines customized spec for a container
 */
@ApiModel(description = "ContainerTemplate defines customized spec for a container")
@JsonPropertyOrder({
  ContainerTemplate.JSON_PROPERTY_ENV,
  ContainerTemplate.JSON_PROPERTY_IMAGE_PULL_POLICY,
  ContainerTemplate.JSON_PROPERTY_RESOURCES,
  ContainerTemplate.JSON_PROPERTY_SECURITY_CONTEXT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContainerTemplate {
  public static final String JSON_PROPERTY_ENV = "env";
  private List<V1EnvVar> env = null;

  public static final String JSON_PROPERTY_IMAGE_PULL_POLICY = "imagePullPolicy";
  private String imagePullPolicy;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private V1ResourceRequirements resources = null;

  public static final String JSON_PROPERTY_SECURITY_CONTEXT = "securityContext";
  private V1SecurityContext securityContext = null;


  public ContainerTemplate env(List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public ContainerTemplate addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ContainerTemplate imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Get imagePullPolicy
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ContainerTemplate resources(V1ResourceRequirements resources) {
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


  public ContainerTemplate securityContext(V1SecurityContext securityContext) {
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


  /**
   * Return true if this ContainerTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerTemplate containerTemplate = (ContainerTemplate) o;
    return Objects.equals(this.env, containerTemplate.env) &&
        Objects.equals(this.imagePullPolicy, containerTemplate.imagePullPolicy) &&
        Objects.equals(this.resources, containerTemplate.resources) &&
        Objects.equals(this.securityContext, containerTemplate.securityContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, imagePullPolicy, resources, securityContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerTemplate {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
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

