/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: latest
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
import io.kubernetes.client.openapi.models.V1VolumeMount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetContainerReq
 */
@JsonPropertyOrder({
  GetContainerReq.JSON_PROPERTY_ENV,
  GetContainerReq.JSON_PROPERTY_IMAGE,
  GetContainerReq.JSON_PROPERTY_IMAGE_PULL_POLICY,
  GetContainerReq.JSON_PROPERTY_ISB_SVC_TYPE,
  GetContainerReq.JSON_PROPERTY_RESOURCES,
  GetContainerReq.JSON_PROPERTY_VOLUME_MOUNTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetContainerReq {
  public static final String JSON_PROPERTY_ENV = "env";
  private List<V1EnvVar> env = new ArrayList<>();

  public static final String JSON_PROPERTY_IMAGE = "image";
  private String image;

  public static final String JSON_PROPERTY_IMAGE_PULL_POLICY = "imagePullPolicy";
  private String imagePullPolicy;

  public static final String JSON_PROPERTY_ISB_SVC_TYPE = "isbSvcType";
  private String isbSvcType;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private V1ResourceRequirements resources = null;

  public static final String JSON_PROPERTY_VOLUME_MOUNTS = "volumeMounts";
  private List<V1VolumeMount> volumeMounts = new ArrayList<>();


  public GetContainerReq env(List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public GetContainerReq addEnvItem(V1EnvVar envItem) {
    this.env.add(envItem);
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<V1EnvVar> getEnv() {
    return env;
  }


  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnv(List<V1EnvVar> env) {
    this.env = env;
  }


  public GetContainerReq image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImage(String image) {
    this.image = image;
  }


  public GetContainerReq imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Get imagePullPolicy
   * @return imagePullPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_PULL_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_PULL_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public GetContainerReq isbSvcType(String isbSvcType) {
    this.isbSvcType = isbSvcType;
    return this;
  }

   /**
   * Get isbSvcType
   * @return isbSvcType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ISB_SVC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIsbSvcType() {
    return isbSvcType;
  }


  @JsonProperty(JSON_PROPERTY_ISB_SVC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsbSvcType(String isbSvcType) {
    this.isbSvcType = isbSvcType;
  }


  public GetContainerReq resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public V1ResourceRequirements getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public GetContainerReq volumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public GetContainerReq addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VOLUME_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVolumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  /**
   * Return true if this getContainerReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContainerReq getContainerReq = (GetContainerReq) o;
    return Objects.equals(this.env, getContainerReq.env) &&
        Objects.equals(this.image, getContainerReq.image) &&
        Objects.equals(this.imagePullPolicy, getContainerReq.imagePullPolicy) &&
        Objects.equals(this.isbSvcType, getContainerReq.isbSvcType) &&
        Objects.equals(this.resources, getContainerReq.resources) &&
        Objects.equals(this.volumeMounts, getContainerReq.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, image, imagePullPolicy, isbSvcType, resources, volumeMounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContainerReq {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    isbSvcType: ").append(toIndentedString(isbSvcType)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

}
