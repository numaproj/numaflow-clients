/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.1
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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PersistenceStrategy defines the strategy of persistence
 */
@ApiModel(description = "PersistenceStrategy defines the strategy of persistence")
@JsonPropertyOrder({
  PersistenceStrategy.JSON_PROPERTY_ACCESS_MODE,
  PersistenceStrategy.JSON_PROPERTY_STORAGE_CLASS_NAME,
  PersistenceStrategy.JSON_PROPERTY_VOLUME_SIZE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PersistenceStrategy {
  public static final String JSON_PROPERTY_ACCESS_MODE = "accessMode";
  private String accessMode;

  public static final String JSON_PROPERTY_STORAGE_CLASS_NAME = "storageClassName";
  private String storageClassName;

  public static final String JSON_PROPERTY_VOLUME_SIZE = "volumeSize";
  private io.kubernetes.client.custom.Quantity volumeSize = null;


  public PersistenceStrategy accessMode(String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Available access modes such as ReadWriteOnce, ReadWriteMany https://kubernetes.io/docs/concepts/storage/persistent-volumes/#access-modes
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Available access modes such as ReadWriteOnce, ReadWriteMany https://kubernetes.io/docs/concepts/storage/persistent-volumes/#access-modes")
  @JsonProperty(JSON_PROPERTY_ACCESS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessMode() {
    return accessMode;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }


  public PersistenceStrategy storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
  @JsonProperty(JSON_PROPERTY_STORAGE_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStorageClassName() {
    return storageClassName;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public PersistenceStrategy volumeSize(io.kubernetes.client.custom.Quantity volumeSize) {
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLUME_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public io.kubernetes.client.custom.Quantity getVolumeSize() {
    return volumeSize;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeSize(io.kubernetes.client.custom.Quantity volumeSize) {
    this.volumeSize = volumeSize;
  }


  /**
   * Return true if this PersistenceStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistenceStrategy persistenceStrategy = (PersistenceStrategy) o;
    return Objects.equals(this.accessMode, persistenceStrategy.accessMode) &&
        Objects.equals(this.storageClassName, persistenceStrategy.storageClassName) &&
        Objects.equals(this.volumeSize, persistenceStrategy.volumeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, storageClassName, volumeSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistenceStrategy {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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

