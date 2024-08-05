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
 * GSSAPI represents a SASL GSSAPI config
 */
@ApiModel(description = "GSSAPI represents a SASL GSSAPI config")
@JsonPropertyOrder({
  GSSAPI.JSON_PROPERTY_AUTH_TYPE,
  GSSAPI.JSON_PROPERTY_KERBEROS_CONFIG_SECRET,
  GSSAPI.JSON_PROPERTY_KEYTAB_SECRET,
  GSSAPI.JSON_PROPERTY_PASSWORD_SECRET,
  GSSAPI.JSON_PROPERTY_REALM,
  GSSAPI.JSON_PROPERTY_SERVICE_NAME,
  GSSAPI.JSON_PROPERTY_USERNAME_SECRET
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GSSAPI {
  /**
   * valid inputs - KRB5_USER_AUTH, KRB5_KEYTAB_AUTH  Possible enum values:  - &#x60;\&quot;KRB5_KEYTAB_AUTH\&quot;&#x60; represents the password method KRB5KeytabAuth &#x3D; \&quot;KRB5_KEYTAB_AUTH\&quot; &#x3D; 2  - &#x60;\&quot;KRB5_USER_AUTH\&quot;&#x60; represents the password method KRB5UserAuth &#x3D; \&quot;KRB5_USER_AUTH\&quot; &#x3D; 1
   */
  public enum AuthTypeEnum {
    KEYTAB_AUTH("KRB5_KEYTAB_AUTH"),
    
    USER_AUTH("KRB5_USER_AUTH");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private AuthTypeEnum authType;

  public static final String JSON_PROPERTY_KERBEROS_CONFIG_SECRET = "kerberosConfigSecret";
  private V1SecretKeySelector kerberosConfigSecret = null;

  public static final String JSON_PROPERTY_KEYTAB_SECRET = "keytabSecret";
  private V1SecretKeySelector keytabSecret = null;

  public static final String JSON_PROPERTY_PASSWORD_SECRET = "passwordSecret";
  private V1SecretKeySelector passwordSecret = null;

  public static final String JSON_PROPERTY_REALM = "realm";
  private String realm;

  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  private String serviceName;

  public static final String JSON_PROPERTY_USERNAME_SECRET = "usernameSecret";
  private V1SecretKeySelector usernameSecret = null;


  public GSSAPI authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * valid inputs - KRB5_USER_AUTH, KRB5_KEYTAB_AUTH  Possible enum values:  - &#x60;\&quot;KRB5_KEYTAB_AUTH\&quot;&#x60; represents the password method KRB5KeytabAuth &#x3D; \&quot;KRB5_KEYTAB_AUTH\&quot; &#x3D; 2  - &#x60;\&quot;KRB5_USER_AUTH\&quot;&#x60; represents the password method KRB5UserAuth &#x3D; \&quot;KRB5_USER_AUTH\&quot; &#x3D; 1
   * @return authType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "valid inputs - KRB5_USER_AUTH, KRB5_KEYTAB_AUTH  Possible enum values:  - `\"KRB5_KEYTAB_AUTH\"` represents the password method KRB5KeytabAuth = \"KRB5_KEYTAB_AUTH\" = 2  - `\"KRB5_USER_AUTH\"` represents the password method KRB5UserAuth = \"KRB5_USER_AUTH\" = 1")
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }


  public GSSAPI kerberosConfigSecret(V1SecretKeySelector kerberosConfigSecret) {
    this.kerberosConfigSecret = kerberosConfigSecret;
    return this;
  }

   /**
   * Get kerberosConfigSecret
   * @return kerberosConfigSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KERBEROS_CONFIG_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getKerberosConfigSecret() {
    return kerberosConfigSecret;
  }


  @JsonProperty(JSON_PROPERTY_KERBEROS_CONFIG_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKerberosConfigSecret(V1SecretKeySelector kerberosConfigSecret) {
    this.kerberosConfigSecret = kerberosConfigSecret;
  }


  public GSSAPI keytabSecret(V1SecretKeySelector keytabSecret) {
    this.keytabSecret = keytabSecret;
    return this;
  }

   /**
   * Get keytabSecret
   * @return keytabSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYTAB_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getKeytabSecret() {
    return keytabSecret;
  }


  @JsonProperty(JSON_PROPERTY_KEYTAB_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeytabSecret(V1SecretKeySelector keytabSecret) {
    this.keytabSecret = keytabSecret;
  }


  public GSSAPI passwordSecret(V1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
    return this;
  }

   /**
   * Get passwordSecret
   * @return passwordSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1SecretKeySelector getPasswordSecret() {
    return passwordSecret;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordSecret(V1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
  }


  public GSSAPI realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REALM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRealm() {
    return realm;
  }


  @JsonProperty(JSON_PROPERTY_REALM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealm(String realm) {
    this.realm = realm;
  }


  public GSSAPI serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public GSSAPI usernameSecret(V1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
    return this;
  }

   /**
   * Get usernameSecret
   * @return usernameSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USERNAME_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public V1SecretKeySelector getUsernameSecret() {
    return usernameSecret;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsernameSecret(V1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
  }


  /**
   * Return true if this GSSAPI object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GSSAPI GSSAPI = (GSSAPI) o;
    return Objects.equals(this.authType, GSSAPI.authType) &&
        Objects.equals(this.kerberosConfigSecret, GSSAPI.kerberosConfigSecret) &&
        Objects.equals(this.keytabSecret, GSSAPI.keytabSecret) &&
        Objects.equals(this.passwordSecret, GSSAPI.passwordSecret) &&
        Objects.equals(this.realm, GSSAPI.realm) &&
        Objects.equals(this.serviceName, GSSAPI.serviceName) &&
        Objects.equals(this.usernameSecret, GSSAPI.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, kerberosConfigSecret, keytabSecret, passwordSecret, realm, serviceName, usernameSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GSSAPI {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    kerberosConfigSecret: ").append(toIndentedString(kerberosConfigSecret)).append("\n");
    sb.append("    keytabSecret: ").append(toIndentedString(keytabSecret)).append("\n");
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
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

