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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Transformer
 */
@JsonPropertyOrder({
  Transformer.JSON_PROPERTY_ARGS,
  Transformer.JSON_PROPERTY_KWARGS,
  Transformer.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Transformer {
  public static final String JSON_PROPERTY_ARGS = "args";
  private List<String> args = null;

  public static final String JSON_PROPERTY_KWARGS = "kwargs";
  private Map<String, String> kwargs = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public Transformer args(List<String> args) {
    this.args = args;
    return this;
  }

  public Transformer addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getArgs() {
    return args;
  }


  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArgs(List<String> args) {
    this.args = args;
  }


  public Transformer kwargs(Map<String, String> kwargs) {
    this.kwargs = kwargs;
    return this;
  }

  public Transformer putKwargsItem(String key, String kwargsItem) {
    if (this.kwargs == null) {
      this.kwargs = new HashMap<>();
    }
    this.kwargs.put(key, kwargsItem);
    return this;
  }

   /**
   * Get kwargs
   * @return kwargs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KWARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getKwargs() {
    return kwargs;
  }


  @JsonProperty(JSON_PROPERTY_KWARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKwargs(Map<String, String> kwargs) {
    this.kwargs = kwargs;
  }


  public Transformer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this Transformer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transformer transformer = (Transformer) o;
    return Objects.equals(this.args, transformer.args) &&
        Objects.equals(this.kwargs, transformer.kwargs) &&
        Objects.equals(this.name, transformer.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, kwargs, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transformer {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    kwargs: ").append(toIndentedString(kwargs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
