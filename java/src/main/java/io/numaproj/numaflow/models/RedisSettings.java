/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RedisSettings
 */
@JsonPropertyOrder({
  RedisSettings.JSON_PROPERTY_MASTER,
  RedisSettings.JSON_PROPERTY_REDIS,
  RedisSettings.JSON_PROPERTY_REPLICA,
  RedisSettings.JSON_PROPERTY_SENTINEL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RedisSettings {
  public static final String JSON_PROPERTY_MASTER = "master";
  private String master;

  public static final String JSON_PROPERTY_REDIS = "redis";
  private String redis;

  public static final String JSON_PROPERTY_REPLICA = "replica";
  private String replica;

  public static final String JSON_PROPERTY_SENTINEL = "sentinel";
  private String sentinel;


  public RedisSettings master(String master) {
    this.master = master;
    return this;
  }

   /**
   * Special settings for Redis master node, will override the global settings from controller config
   * @return master
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Special settings for Redis master node, will override the global settings from controller config")
  @JsonProperty(JSON_PROPERTY_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaster() {
    return master;
  }


  @JsonProperty(JSON_PROPERTY_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaster(String master) {
    this.master = master;
  }


  public RedisSettings redis(String redis) {
    this.redis = redis;
    return this;
  }

   /**
   * Redis settings shared by both master and slaves, will override the global settings from controller config
   * @return redis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redis settings shared by both master and slaves, will override the global settings from controller config")
  @JsonProperty(JSON_PROPERTY_REDIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedis() {
    return redis;
  }


  @JsonProperty(JSON_PROPERTY_REDIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedis(String redis) {
    this.redis = redis;
  }


  public RedisSettings replica(String replica) {
    this.replica = replica;
    return this;
  }

   /**
   * Special settings for Redis replica nodes, will override the global settings from controller config
   * @return replica
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Special settings for Redis replica nodes, will override the global settings from controller config")
  @JsonProperty(JSON_PROPERTY_REPLICA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplica() {
    return replica;
  }


  @JsonProperty(JSON_PROPERTY_REPLICA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplica(String replica) {
    this.replica = replica;
  }


  public RedisSettings sentinel(String sentinel) {
    this.sentinel = sentinel;
    return this;
  }

   /**
   * Sentinel settings, will override the global settings from controller config
   * @return sentinel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sentinel settings, will override the global settings from controller config")
  @JsonProperty(JSON_PROPERTY_SENTINEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSentinel() {
    return sentinel;
  }


  @JsonProperty(JSON_PROPERTY_SENTINEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentinel(String sentinel) {
    this.sentinel = sentinel;
  }


  /**
   * Return true if this RedisSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedisSettings redisSettings = (RedisSettings) o;
    return Objects.equals(this.master, redisSettings.master) &&
        Objects.equals(this.redis, redisSettings.redis) &&
        Objects.equals(this.replica, redisSettings.replica) &&
        Objects.equals(this.sentinel, redisSettings.sentinel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(master, redis, replica, sentinel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedisSettings {\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
    sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
    sb.append("    sentinel: ").append(toIndentedString(sentinel)).append("\n");
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

