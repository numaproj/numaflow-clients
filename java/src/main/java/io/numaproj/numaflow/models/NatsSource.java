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
import io.numaproj.numaflow.models.NatsAuth;
import io.numaproj.numaflow.models.TLS;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * NatsSource
 */
@JsonPropertyOrder({
  NatsSource.JSON_PROPERTY_AUTH,
  NatsSource.JSON_PROPERTY_QUEUE,
  NatsSource.JSON_PROPERTY_SUBJECT,
  NatsSource.JSON_PROPERTY_TLS,
  NatsSource.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class NatsSource {
  public static final String JSON_PROPERTY_AUTH = "auth";
  private NatsAuth auth;

  public static final String JSON_PROPERTY_QUEUE = "queue";
  private String queue;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_TLS = "tls";
  private TLS tls;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public NatsSource() { 
  }

  public NatsSource auth(NatsAuth auth) {
    this.auth = auth;
    return this;
  }

  /**
   * Get auth
   * @return auth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NatsAuth getAuth() {
    return auth;
  }


  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuth(NatsAuth auth) {
    this.auth = auth;
  }


  public NatsSource queue(String queue) {
    this.queue = queue;
    return this;
  }

  /**
   * Queue is used for queue subscription.
   * @return queue
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueue() {
    return queue;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueue(String queue) {
    this.queue = queue;
  }


  public NatsSource subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject holds the name of the subject onto which messages are published.
   * @return subject
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public NatsSource tls(TLS tls) {
    this.tls = tls;
    return this;
  }

  /**
   * Get tls
   * @return tls
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TLS getTls() {
    return tls;
  }


  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTls(TLS tls) {
    this.tls = tls;
  }


  public NatsSource url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to connect to NATS cluster, multiple urls could be separated by comma.
   * @return url
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this NatsSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatsSource natsSource = (NatsSource) o;
    return Objects.equals(this.auth, natsSource.auth) &&
        Objects.equals(this.queue, natsSource.queue) &&
        Objects.equals(this.subject, natsSource.subject) &&
        Objects.equals(this.tls, natsSource.tls) &&
        Objects.equals(this.url, natsSource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, queue, subject, tls, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatsSource {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    // add `auth` to the URL query string
    if (getAuth() != null) {
      joiner.add(getAuth().toUrlQueryString(prefix + "auth" + suffix));
    }

    // add `queue` to the URL query string
    if (getQueue() != null) {
      joiner.add(String.format("%squeue%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getQueue()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tls` to the URL query string
    if (getTls() != null) {
      joiner.add(getTls().toUrlQueryString(prefix + "tls" + suffix));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

