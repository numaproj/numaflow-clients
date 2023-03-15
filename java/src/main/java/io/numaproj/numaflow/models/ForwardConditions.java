/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ForwardConditions
 */
@JsonPropertyOrder({
  ForwardConditions.JSON_PROPERTY_KEY_IN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ForwardConditions {
  public static final String JSON_PROPERTY_KEY_IN = "keyIn";
  private List<String> keyIn = new ArrayList<>();


  public ForwardConditions keyIn(List<String> keyIn) {
    this.keyIn = keyIn;
    return this;
  }

  public ForwardConditions addKeyInItem(String keyInItem) {
    this.keyIn.add(keyInItem);
    return this;
  }

   /**
   * Get keyIn
   * @return keyIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KEY_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getKeyIn() {
    return keyIn;
  }


  @JsonProperty(JSON_PROPERTY_KEY_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyIn(List<String> keyIn) {
    this.keyIn = keyIn;
  }


  /**
   * Return true if this ForwardConditions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardConditions forwardConditions = (ForwardConditions) o;
    return Objects.equals(this.keyIn, forwardConditions.keyIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardConditions {\n");
    sb.append("    keyIn: ").append(toIndentedString(keyIn)).append("\n");
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

