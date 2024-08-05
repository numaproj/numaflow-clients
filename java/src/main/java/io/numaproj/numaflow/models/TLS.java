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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TLS
 */
@JsonPropertyOrder({
  TLS.JSON_PROPERTY_CA_CERT_SECRET,
  TLS.JSON_PROPERTY_CERT_SECRET,
  TLS.JSON_PROPERTY_INSECURE_SKIP_VERIFY,
  TLS.JSON_PROPERTY_KEY_SECRET
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TLS {
  public static final String JSON_PROPERTY_CA_CERT_SECRET = "caCertSecret";
  private V1SecretKeySelector caCertSecret = null;

  public static final String JSON_PROPERTY_CERT_SECRET = "certSecret";
  private V1SecretKeySelector certSecret = null;

  public static final String JSON_PROPERTY_INSECURE_SKIP_VERIFY = "insecureSkipVerify";
  private Boolean insecureSkipVerify;

  public static final String JSON_PROPERTY_KEY_SECRET = "keySecret";
  private V1SecretKeySelector keySecret = null;


  public TLS caCertSecret(V1SecretKeySelector caCertSecret) {
    this.caCertSecret = caCertSecret;
    return this;
  }

   /**
   * Get caCertSecret
   * @return caCertSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CA_CERT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getCaCertSecret() {
    return caCertSecret;
  }


  @JsonProperty(JSON_PROPERTY_CA_CERT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaCertSecret(V1SecretKeySelector caCertSecret) {
    this.caCertSecret = caCertSecret;
  }


  public TLS certSecret(V1SecretKeySelector certSecret) {
    this.certSecret = certSecret;
    return this;
  }

   /**
   * Get certSecret
   * @return certSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CERT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getCertSecret() {
    return certSecret;
  }


  @JsonProperty(JSON_PROPERTY_CERT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertSecret(V1SecretKeySelector certSecret) {
    this.certSecret = certSecret;
  }


  public TLS insecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
    return this;
  }

   /**
   * Get insecureSkipVerify
   * @return insecureSkipVerify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSECURE_SKIP_VERIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInsecureSkipVerify() {
    return insecureSkipVerify;
  }


  @JsonProperty(JSON_PROPERTY_INSECURE_SKIP_VERIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
  }


  public TLS keySecret(V1SecretKeySelector keySecret) {
    this.keySecret = keySecret;
    return this;
  }

   /**
   * Get keySecret
   * @return keySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getKeySecret() {
    return keySecret;
  }


  @JsonProperty(JSON_PROPERTY_KEY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeySecret(V1SecretKeySelector keySecret) {
    this.keySecret = keySecret;
  }


  /**
   * Return true if this TLS object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLS TLS = (TLS) o;
    return Objects.equals(this.caCertSecret, TLS.caCertSecret) &&
        Objects.equals(this.certSecret, TLS.certSecret) &&
        Objects.equals(this.insecureSkipVerify, TLS.insecureSkipVerify) &&
        Objects.equals(this.keySecret, TLS.keySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertSecret, certSecret, insecureSkipVerify, keySecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLS {\n");
    sb.append("    caCertSecret: ").append(toIndentedString(caCertSecret)).append("\n");
    sb.append("    certSecret: ").append(toIndentedString(certSecret)).append("\n");
    sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
    sb.append("    keySecret: ").append(toIndentedString(keySecret)).append("\n");
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

