/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.4
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
import io.numaproj.numaflow.models.GeneratorSource;
import io.numaproj.numaflow.models.HTTPSource;
import io.numaproj.numaflow.models.KafkaSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Source
 */
@JsonPropertyOrder({
  Source.JSON_PROPERTY_GENERATOR,
  Source.JSON_PROPERTY_HTTP,
  Source.JSON_PROPERTY_KAFKA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Source {
  public static final String JSON_PROPERTY_GENERATOR = "generator";
  private GeneratorSource generator;

  public static final String JSON_PROPERTY_HTTP = "http";
  private HTTPSource http;

  public static final String JSON_PROPERTY_KAFKA = "kafka";
  private KafkaSource kafka;


  public Source generator(GeneratorSource generator) {
    this.generator = generator;
    return this;
  }

   /**
   * Get generator
   * @return generator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GeneratorSource getGenerator() {
    return generator;
  }


  @JsonProperty(JSON_PROPERTY_GENERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenerator(GeneratorSource generator) {
    this.generator = generator;
  }


  public Source http(HTTPSource http) {
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HTTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HTTPSource getHttp() {
    return http;
  }


  @JsonProperty(JSON_PROPERTY_HTTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttp(HTTPSource http) {
    this.http = http;
  }


  public Source kafka(KafkaSource kafka) {
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KafkaSource getKafka() {
    return kafka;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafka(KafkaSource kafka) {
    this.kafka = kafka;
  }


  /**
   * Return true if this Source object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.generator, source.generator) &&
        Objects.equals(this.http, source.http) &&
        Objects.equals(this.kafka, source.kafka);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generator, http, kafka);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
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

