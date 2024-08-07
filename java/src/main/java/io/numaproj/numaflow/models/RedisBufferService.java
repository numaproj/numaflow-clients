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
import io.numaproj.numaflow.models.NativeRedis;
import io.numaproj.numaflow.models.RedisConfig;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * RedisBufferService
 */
@JsonPropertyOrder({
  RedisBufferService.JSON_PROPERTY_EXTERNAL,
  RedisBufferService.JSON_PROPERTY_NATIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class RedisBufferService {
  public static final String JSON_PROPERTY_EXTERNAL = "external";
  private RedisConfig external;

  public static final String JSON_PROPERTY_NATIVE = "native";
  private NativeRedis _native;

  public RedisBufferService() { 
  }

  public RedisBufferService external(RedisConfig external) {
    this.external = external;
    return this;
  }

  /**
   * Get external
   * @return external
   */
  @javax.annotation.Nullable
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


  public RedisBufferService _native(NativeRedis _native) {
    this._native = _native;
    return this;
  }

  /**
   * Get _native
   * @return _native
   */
  @javax.annotation.Nullable
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
   * Return true if this RedisBufferService object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedisBufferService redisBufferService = (RedisBufferService) o;
    return Objects.equals(this.external, redisBufferService.external) &&
        Objects.equals(this._native, redisBufferService._native);
  }

  @Override
  public int hashCode() {
    return Objects.hash(external, _native);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedisBufferService {\n");
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

    // add `external` to the URL query string
    if (getExternal() != null) {
      joiner.add(getExternal().toUrlQueryString(prefix + "external" + suffix));
    }

    // add `native` to the URL query string
    if (getNative() != null) {
      joiner.add(getNative().toUrlQueryString(prefix + "native" + suffix));
    }

    return joiner.toString();
  }
}

