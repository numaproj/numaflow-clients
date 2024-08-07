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
import io.numaproj.numaflow.models.Function;
import io.numaproj.numaflow.models.GroupBy;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * UDF
 */
@JsonPropertyOrder({
  UDF.JSON_PROPERTY_BUILTIN,
  UDF.JSON_PROPERTY_CONTAINER,
  UDF.JSON_PROPERTY_GROUP_BY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class UDF {
  public static final String JSON_PROPERTY_BUILTIN = "builtin";
  private Function builtin;

  public static final String JSON_PROPERTY_CONTAINER = "container";
  private Container container;

  public static final String JSON_PROPERTY_GROUP_BY = "groupBy";
  private GroupBy groupBy;

  public UDF() { 
  }

  public UDF builtin(Function builtin) {
    this.builtin = builtin;
    return this;
  }

  /**
   * Get builtin
   * @return builtin
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Function getBuiltin() {
    return builtin;
  }


  @JsonProperty(JSON_PROPERTY_BUILTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuiltin(Function builtin) {
    this.builtin = builtin;
  }


  public UDF container(Container container) {
    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Container getContainer() {
    return container;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainer(Container container) {
    this.container = container;
  }


  public UDF groupBy(GroupBy groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  /**
   * Get groupBy
   * @return groupBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GroupBy getGroupBy() {
    return groupBy;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupBy(GroupBy groupBy) {
    this.groupBy = groupBy;
  }


  /**
   * Return true if this UDF object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UDF UDF = (UDF) o;
    return Objects.equals(this.builtin, UDF.builtin) &&
        Objects.equals(this.container, UDF.container) &&
        Objects.equals(this.groupBy, UDF.groupBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtin, container, groupBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDF {\n");
    sb.append("    builtin: ").append(toIndentedString(builtin)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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

    // add `builtin` to the URL query string
    if (getBuiltin() != null) {
      joiner.add(getBuiltin().toUrlQueryString(prefix + "builtin" + suffix));
    }

    // add `container` to the URL query string
    if (getContainer() != null) {
      joiner.add(getContainer().toUrlQueryString(prefix + "container" + suffix));
    }

    // add `groupBy` to the URL query string
    if (getGroupBy() != null) {
      joiner.add(getGroupBy().toUrlQueryString(prefix + "groupBy" + suffix));
    }

    return joiner.toString();
  }
}

