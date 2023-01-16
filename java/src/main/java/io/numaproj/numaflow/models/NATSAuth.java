/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0
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
import io.numaproj.numaflow.models.BasicAuth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NatsAuth defines how to authenticate the nats access
 */
@ApiModel(description = "NatsAuth defines how to authenticate the nats access")
@JsonPropertyOrder({
  NatsAuth.JSON_PROPERTY_BASIC,
  NatsAuth.JSON_PROPERTY_NKEY,
  NatsAuth.JSON_PROPERTY_TOKEN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NatsAuth {
  public static final String JSON_PROPERTY_BASIC = "basic";
  private BasicAuth basic;

  public static final String JSON_PROPERTY_NKEY = "nkey";
  private V1SecretKeySelector nkey = null;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private V1SecretKeySelector token = null;


  public NatsAuth basic(BasicAuth basic) {
    this.basic = basic;
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BasicAuth getBasic() {
    return basic;
  }


  @JsonProperty(JSON_PROPERTY_BASIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasic(BasicAuth basic) {
    this.basic = basic;
  }


  public NatsAuth nkey(V1SecretKeySelector nkey) {
    this.nkey = nkey;
    return this;
  }

   /**
   * Get nkey
   * @return nkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getNkey() {
    return nkey;
  }


  @JsonProperty(JSON_PROPERTY_NKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNkey(V1SecretKeySelector nkey) {
    this.nkey = nkey;
  }


  public NatsAuth token(V1SecretKeySelector token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(V1SecretKeySelector token) {
    this.token = token;
  }


  /**
   * Return true if this NatsAuth object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatsAuth natsAuth = (NatsAuth) o;
    return Objects.equals(this.basic, natsAuth.basic) &&
        Objects.equals(this.nkey, natsAuth.nkey) &&
        Objects.equals(this.token, natsAuth.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basic, nkey, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatsAuth {\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    nkey: ").append(toIndentedString(nkey)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

