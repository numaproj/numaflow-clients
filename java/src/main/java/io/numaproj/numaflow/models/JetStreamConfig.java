/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.5
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
import io.numaproj.numaflow.models.NATSAuth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JetStreamConfig
 */
@JsonPropertyOrder({
  JetStreamConfig.JSON_PROPERTY_AUTH,
  JetStreamConfig.JSON_PROPERTY_BUFFER_CONFIG,
  JetStreamConfig.JSON_PROPERTY_TLS_ENABLED,
  JetStreamConfig.JSON_PROPERTY_URL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JetStreamConfig {
  public static final String JSON_PROPERTY_AUTH = "auth";
  private NATSAuth auth;

  public static final String JSON_PROPERTY_BUFFER_CONFIG = "bufferConfig";
  private String bufferConfig;

  public static final String JSON_PROPERTY_TLS_ENABLED = "tlsEnabled";
  private Boolean tlsEnabled;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public JetStreamConfig auth(NATSAuth auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NATSAuth getAuth() {
    return auth;
  }


  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuth(NATSAuth auth) {
    this.auth = auth;
  }


  public JetStreamConfig bufferConfig(String bufferConfig) {
    this.bufferConfig = bufferConfig;
    return this;
  }

   /**
   * Get bufferConfig
   * @return bufferConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUFFER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBufferConfig() {
    return bufferConfig;
  }


  @JsonProperty(JSON_PROPERTY_BUFFER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBufferConfig(String bufferConfig) {
    this.bufferConfig = bufferConfig;
  }


  public JetStreamConfig tlsEnabled(Boolean tlsEnabled) {
    this.tlsEnabled = tlsEnabled;
    return this;
  }

   /**
   * TLS enabled or not
   * @return tlsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TLS enabled or not")
  @JsonProperty(JSON_PROPERTY_TLS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTlsEnabled() {
    return tlsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_TLS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTlsEnabled(Boolean tlsEnabled) {
    this.tlsEnabled = tlsEnabled;
  }


  public JetStreamConfig url(String url) {
    this.url = url;
    return this;
  }

   /**
   * JetStream (NATS) URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JetStream (NATS) URL")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this JetStreamConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JetStreamConfig jetStreamConfig = (JetStreamConfig) o;
    return Objects.equals(this.auth, jetStreamConfig.auth) &&
        Objects.equals(this.bufferConfig, jetStreamConfig.bufferConfig) &&
        Objects.equals(this.tlsEnabled, jetStreamConfig.tlsEnabled) &&
        Objects.equals(this.url, jetStreamConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, bufferConfig, tlsEnabled, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JetStreamConfig {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    bufferConfig: ").append(toIndentedString(bufferConfig)).append("\n");
    sb.append("    tlsEnabled: ").append(toIndentedString(tlsEnabled)).append("\n");
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

}

