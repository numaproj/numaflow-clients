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
import io.numaproj.numaflow.models.AbstractVertex;
import io.numaproj.numaflow.models.Edge;
import io.numaproj.numaflow.models.Lifecycle;
import io.numaproj.numaflow.models.PipelineLimits;
import io.numaproj.numaflow.models.Templates;
import io.numaproj.numaflow.models.Watermark;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PipelineSpec
 */
@JsonPropertyOrder({
  PipelineSpec.JSON_PROPERTY_EDGES,
  PipelineSpec.JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME,
  PipelineSpec.JSON_PROPERTY_LIFECYCLE,
  PipelineSpec.JSON_PROPERTY_LIMITS,
  PipelineSpec.JSON_PROPERTY_TEMPLATES,
  PipelineSpec.JSON_PROPERTY_VERTICES,
  PipelineSpec.JSON_PROPERTY_WATERMARK
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PipelineSpec {
  public static final String JSON_PROPERTY_EDGES = "edges";
  private List<Edge> edges = null;

  public static final String JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME = "interStepBufferServiceName";
  private String interStepBufferServiceName;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private Lifecycle lifecycle;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private PipelineLimits limits;

  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  private Templates templates;

  public static final String JSON_PROPERTY_VERTICES = "vertices";
  private List<AbstractVertex> vertices = null;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  private Watermark watermark;


  public PipelineSpec edges(List<Edge> edges) {
    this.edges = edges;
    return this;
  }

  public PipelineSpec addEdgesItem(Edge edgesItem) {
    if (this.edges == null) {
      this.edges = new ArrayList<>();
    }
    this.edges.add(edgesItem);
    return this;
  }

   /**
   * Edges define the relationships between vertices
   * @return edges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Edges define the relationships between vertices")
  @JsonProperty(JSON_PROPERTY_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Edge> getEdges() {
    return edges;
  }


  @JsonProperty(JSON_PROPERTY_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdges(List<Edge> edges) {
    this.edges = edges;
  }


  public PipelineSpec interStepBufferServiceName(String interStepBufferServiceName) {
    this.interStepBufferServiceName = interStepBufferServiceName;
    return this;
  }

   /**
   * Get interStepBufferServiceName
   * @return interStepBufferServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterStepBufferServiceName() {
    return interStepBufferServiceName;
  }


  @JsonProperty(JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterStepBufferServiceName(String interStepBufferServiceName) {
    this.interStepBufferServiceName = interStepBufferServiceName;
  }


  public PipelineSpec lifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIFECYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Lifecycle getLifecycle() {
    return lifecycle;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }


  public PipelineSpec limits(PipelineLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PipelineLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimits(PipelineLimits limits) {
    this.limits = limits;
  }


  public PipelineSpec templates(Templates templates) {
    this.templates = templates;
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Templates getTemplates() {
    return templates;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplates(Templates templates) {
    this.templates = templates;
  }


  public PipelineSpec vertices(List<AbstractVertex> vertices) {
    this.vertices = vertices;
    return this;
  }

  public PipelineSpec addVerticesItem(AbstractVertex verticesItem) {
    if (this.vertices == null) {
      this.vertices = new ArrayList<>();
    }
    this.vertices.add(verticesItem);
    return this;
  }

   /**
   * Get vertices
   * @return vertices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERTICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AbstractVertex> getVertices() {
    return vertices;
  }


  @JsonProperty(JSON_PROPERTY_VERTICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVertices(List<AbstractVertex> vertices) {
    this.vertices = vertices;
  }


  public PipelineSpec watermark(Watermark watermark) {
    this.watermark = watermark;
    return this;
  }

   /**
   * Get watermark
   * @return watermark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WATERMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Watermark getWatermark() {
    return watermark;
  }


  @JsonProperty(JSON_PROPERTY_WATERMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(Watermark watermark) {
    this.watermark = watermark;
  }


  /**
   * Return true if this PipelineSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineSpec pipelineSpec = (PipelineSpec) o;
    return Objects.equals(this.edges, pipelineSpec.edges) &&
        Objects.equals(this.interStepBufferServiceName, pipelineSpec.interStepBufferServiceName) &&
        Objects.equals(this.lifecycle, pipelineSpec.lifecycle) &&
        Objects.equals(this.limits, pipelineSpec.limits) &&
        Objects.equals(this.templates, pipelineSpec.templates) &&
        Objects.equals(this.vertices, pipelineSpec.vertices) &&
        Objects.equals(this.watermark, pipelineSpec.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edges, interStepBufferServiceName, lifecycle, limits, templates, vertices, watermark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineSpec {\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
    sb.append("    interStepBufferServiceName: ").append(toIndentedString(interStepBufferServiceName)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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

