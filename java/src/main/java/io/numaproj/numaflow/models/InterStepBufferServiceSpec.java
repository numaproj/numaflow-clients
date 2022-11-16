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
import io.numaproj.numaflow.models.JetStreamBufferService;
import io.numaproj.numaflow.models.RedisBufferService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InterStepBufferServiceSpec
 */
@JsonPropertyOrder({
  InterStepBufferServiceSpec.JSON_PROPERTY_JETSTREAM,
  InterStepBufferServiceSpec.JSON_PROPERTY_REDIS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InterStepBufferServiceSpec {
  public static final String JSON_PROPERTY_JETSTREAM = "jetstream";
  private JetStreamBufferService jetstream;

  public static final String JSON_PROPERTY_REDIS = "redis";
  private RedisBufferService redis;


  public InterStepBufferServiceSpec jetstream(JetStreamBufferService jetstream) {
    this.jetstream = jetstream;
    return this;
  }

   /**
   * Get jetstream
   * @return jetstream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JETSTREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JetStreamBufferService getJetstream() {
    return jetstream;
  }


  @JsonProperty(JSON_PROPERTY_JETSTREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJetstream(JetStreamBufferService jetstream) {
    this.jetstream = jetstream;
  }


  public InterStepBufferServiceSpec redis(RedisBufferService redis) {
    this.redis = redis;
    return this;
  }

   /**
   * Get redis
   * @return redis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REDIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedisBufferService getRedis() {
    return redis;
  }


  @JsonProperty(JSON_PROPERTY_REDIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedis(RedisBufferService redis) {
    this.redis = redis;
  }


  /**
   * Return true if this InterStepBufferServiceSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterStepBufferServiceSpec interStepBufferServiceSpec = (InterStepBufferServiceSpec) o;
    return Objects.equals(this.jetstream, interStepBufferServiceSpec.jetstream) &&
        Objects.equals(this.redis, interStepBufferServiceSpec.redis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jetstream, redis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterStepBufferServiceSpec {\n");
    sb.append("    jetstream: ").append(toIndentedString(jetstream)).append("\n");
    sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
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

