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
import io.numaproj.numaflow.models.Container;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * UDSink
 */
@JsonPropertyOrder({
  UDSink.JSON_PROPERTY_CONTAINER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class UDSink {
  public static final String JSON_PROPERTY_CONTAINER = "container";
  private Container container;

  public UDSink() { 
  }

  public UDSink container(Container container) {
    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Container getContainer() {
    return container;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContainer(Container container) {
    this.container = container;
  }


  /**
   * Return true if this UDSink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UDSink udSink = (UDSink) o;
    return Objects.equals(this.container, udSink.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDSink {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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

    // add `container` to the URL query string
    if (getContainer() != null) {
      joiner.add(getContainer().toUrlQueryString(prefix + "container" + suffix));
    }

    return joiner.toString();
  }
}

