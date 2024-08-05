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
import io.numaproj.numaflow.models.FixedWindow;
import io.numaproj.numaflow.models.SessionWindow;
import io.numaproj.numaflow.models.SlidingWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Window describes windowing strategy
 */
@ApiModel(description = "Window describes windowing strategy")
@JsonPropertyOrder({
  Window.JSON_PROPERTY_FIXED,
  Window.JSON_PROPERTY_SESSION,
  Window.JSON_PROPERTY_SLIDING
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Window {
  public static final String JSON_PROPERTY_FIXED = "fixed";
  private FixedWindow fixed;

  public static final String JSON_PROPERTY_SESSION = "session";
  private SessionWindow session;

  public static final String JSON_PROPERTY_SLIDING = "sliding";
  private SlidingWindow sliding;


  public Window fixed(FixedWindow fixed) {
    this.fixed = fixed;
    return this;
  }

   /**
   * Get fixed
   * @return fixed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FixedWindow getFixed() {
    return fixed;
  }


  @JsonProperty(JSON_PROPERTY_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixed(FixedWindow fixed) {
    this.fixed = fixed;
  }


  public Window session(SessionWindow session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SessionWindow getSession() {
    return session;
  }


  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSession(SessionWindow session) {
    this.session = session;
  }


  public Window sliding(SlidingWindow sliding) {
    this.sliding = sliding;
    return this;
  }

   /**
   * Get sliding
   * @return sliding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLIDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SlidingWindow getSliding() {
    return sliding;
  }


  @JsonProperty(JSON_PROPERTY_SLIDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSliding(SlidingWindow sliding) {
    this.sliding = sliding;
  }


  /**
   * Return true if this Window object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Window window = (Window) o;
    return Objects.equals(this.fixed, window.fixed) &&
        Objects.equals(this.session, window.session) &&
        Objects.equals(this.sliding, window.sliding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixed, session, sliding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Window {\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    sliding: ").append(toIndentedString(sliding)).append("\n");
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

