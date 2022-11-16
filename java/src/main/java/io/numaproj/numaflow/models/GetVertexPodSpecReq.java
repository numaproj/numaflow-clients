/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetVertexPodSpecReq
 */
@JsonPropertyOrder({
  GetVertexPodSpecReq.JSON_PROPERTY_ENV,
  GetVertexPodSpecReq.JSON_PROPERTY_IS_B_SVC_TYPE,
  GetVertexPodSpecReq.JSON_PROPERTY_IMAGE,
  GetVertexPodSpecReq.JSON_PROPERTY_PULL_POLICY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetVertexPodSpecReq {
  public static final String JSON_PROPERTY_ENV = "Env";
  private List<V1EnvVar> env = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_B_SVC_TYPE = "ISBSvcType";
  private String isBSvcType;

  public static final String JSON_PROPERTY_IMAGE = "Image";
  private String image;

  public static final String JSON_PROPERTY_PULL_POLICY = "PullPolicy";
  private String pullPolicy;


  public GetVertexPodSpecReq env(List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public GetVertexPodSpecReq addEnvItem(V1EnvVar envItem) {
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


  public GetVertexPodSpecReq isBSvcType(String isBSvcType) {
    this.isBSvcType = isBSvcType;
    return this;
  }

   /**
   * Get isBSvcType
   * @return isBSvcType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_B_SVC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIsBSvcType() {
    return isBSvcType;
  }


  @JsonProperty(JSON_PROPERTY_IS_B_SVC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsBSvcType(String isBSvcType) {
    this.isBSvcType = isBSvcType;
  }


  public GetVertexPodSpecReq image(String image) {
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


  public GetVertexPodSpecReq pullPolicy(String pullPolicy) {
    this.pullPolicy = pullPolicy;
    return this;
  }

   /**
   * Get pullPolicy
   * @return pullPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PULL_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPullPolicy() {
    return pullPolicy;
  }


  @JsonProperty(JSON_PROPERTY_PULL_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPullPolicy(String pullPolicy) {
    this.pullPolicy = pullPolicy;
  }


  /**
   * Return true if this GetVertexPodSpecReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetVertexPodSpecReq getVertexPodSpecReq = (GetVertexPodSpecReq) o;
    return Objects.equals(this.env, getVertexPodSpecReq.env) &&
        Objects.equals(this.isBSvcType, getVertexPodSpecReq.isBSvcType) &&
        Objects.equals(this.image, getVertexPodSpecReq.image) &&
        Objects.equals(this.pullPolicy, getVertexPodSpecReq.pullPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, isBSvcType, image, pullPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVertexPodSpecReq {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    isBSvcType: ").append(toIndentedString(isBSvcType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    pullPolicy: ").append(toIndentedString(pullPolicy)).append("\n");
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

