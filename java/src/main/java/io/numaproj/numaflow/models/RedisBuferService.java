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
import io.numaproj.numaflow.models.NativeRedis;
import io.numaproj.numaflow.models.RedisConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RedisBuferService
 */
@JsonPropertyOrder({
  RedisBuferService.JSON_PROPERTY_EXTERNAL,
  RedisBuferService.JSON_PROPERTY_NATIVE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RedisBuferService {
  public static final String JSON_PROPERTY_EXTERNAL = "external";
  private RedisConfig external;

  public static final String JSON_PROPERTY_NATIVE = "native";
  private NativeRedis _native;


  public RedisBuferService external(RedisConfig external) {
    this.external = external;
    return this;
  }

   /**
   * Get external
   * @return external
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedisConfig getExternal() {
    return external;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternal(RedisConfig external) {
    this.external = external;
  }


  public RedisBuferService _native(NativeRedis _native) {
    this._native = _native;
    return this;
  }

   /**
   * Get _native
   * @return _native
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NativeRedis getNative() {
    return _native;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNative(NativeRedis _native) {
    this._native = _native;
  }


  /**
   * Return true if this RedisBuferService object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedisBuferService redisBuferService = (RedisBuferService) o;
    return Objects.equals(this.external, redisBuferService.external) &&
        Objects.equals(this._native, redisBuferService._native);
  }

  @Override
  public int hashCode() {
    return Objects.hash(external, _native);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedisBuferService {\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    _native: ").append(toIndentedString(_native)).append("\n");
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

