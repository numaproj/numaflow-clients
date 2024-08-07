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
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.numaproj.numaflow.models.VertexSpec;
import io.numaproj.numaflow.models.VertexStatus;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * Vertex
 */
@JsonPropertyOrder({
  Vertex.JSON_PROPERTY_API_VERSION,
  Vertex.JSON_PROPERTY_KIND,
  Vertex.JSON_PROPERTY_METADATA,
  Vertex.JSON_PROPERTY_SPEC,
  Vertex.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Vertex implements io.kubernetes.client.common.KubernetesObject {
  public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
  private String apiVersion;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private V1ObjectMeta metadata = null;

  public static final String JSON_PROPERTY_SPEC = "spec";
  private VertexSpec spec;

  public static final String JSON_PROPERTY_STATUS = "status";
  private VertexStatus status;

  public Vertex() { 
  }

  public Vertex apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiVersion() {
    return apiVersion;
  }


  @JsonProperty(JSON_PROPERTY_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public Vertex kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public Vertex metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public Vertex spec(VertexSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SPEC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public VertexSpec getSpec() {
    return spec;
  }


  @JsonProperty(JSON_PROPERTY_SPEC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpec(VertexSpec spec) {
    this.spec = spec;
  }


  public Vertex status(VertexStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public VertexStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(VertexStatus status) {
    this.status = status;
  }


  /**
   * Return true if this Vertex object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vertex vertex = (Vertex) o;
    return Objects.equals(this.apiVersion, vertex.apiVersion) &&
        Objects.equals(this.kind, vertex.kind) &&
        Objects.equals(this.metadata, vertex.metadata) &&
        Objects.equals(this.spec, vertex.spec) &&
        Objects.equals(this.status, vertex.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vertex {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `apiVersion` to the URL query string
    if (getApiVersion() != null) {
      joiner.add(String.format("%sapiVersion%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getApiVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `kind` to the URL query string
    if (getKind() != null) {
      joiner.add(String.format("%skind%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getKind()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMetadata()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `spec` to the URL query string
    if (getSpec() != null) {
      joiner.add(getSpec().toUrlQueryString(prefix + "spec" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(getStatus().toUrlQueryString(prefix + "status" + suffix));
    }

    return joiner.toString();
  }
}

