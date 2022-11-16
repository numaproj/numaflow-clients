/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.2
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
import io.numaproj.numaflow.models.PBQStorage;
import io.numaproj.numaflow.models.Window;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GroupBy indicates it is a reducer UDF
 */
@ApiModel(description = "GroupBy indicates it is a reducer UDF")
@JsonPropertyOrder({
  GroupBy.JSON_PROPERTY_KEYED,
  GroupBy.JSON_PROPERTY_STORAGE,
  GroupBy.JSON_PROPERTY_WINDOW
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupBy {
  public static final String JSON_PROPERTY_KEYED = "keyed";
  private Boolean keyed;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private PBQStorage storage;

  public static final String JSON_PROPERTY_WINDOW = "window";
  private Window window;


  public GroupBy keyed(Boolean keyed) {
    this.keyed = keyed;
    return this;
  }

   /**
   * Get keyed
   * @return keyed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKeyed() {
    return keyed;
  }


  @JsonProperty(JSON_PROPERTY_KEYED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyed(Boolean keyed) {
    this.keyed = keyed;
  }


  public GroupBy storage(PBQStorage storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PBQStorage getStorage() {
    return storage;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorage(PBQStorage storage) {
    this.storage = storage;
  }


  public GroupBy window(Window window) {
    this.window = window;
    return this;
  }

   /**
   * Get window
   * @return window
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Window getWindow() {
    return window;
  }


  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWindow(Window window) {
    this.window = window;
  }


  /**
   * Return true if this GroupBy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupBy groupBy = (GroupBy) o;
    return Objects.equals(this.keyed, groupBy.keyed) &&
        Objects.equals(this.storage, groupBy.storage) &&
        Objects.equals(this.window, groupBy.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyed, storage, window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBy {\n");
    sb.append("    keyed: ").append(toIndentedString(keyed)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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

