/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.4
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EnvironmentBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-20T12:11:16.337-07:00")
public class EnvironmentBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("defaultTtl")
  private BigDecimal defaultTtl = null;

  public EnvironmentBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the new environment.
   * @return name
  **/
  @ApiModelProperty(example = "Development", required = true, value = "The name of the new environment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvironmentBody key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A project-unique key for the new environment.
   * @return key
  **/
  @ApiModelProperty(example = "dev", required = true, value = "A project-unique key for the new environment.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EnvironmentBody color(String color) {
    this.color = color;
    return this;
  }

   /**
   * A color swatch (as an RGB hex value with no leading &#39;#&#39;, e.g. C8C8C8).
   * @return color
  **/
  @ApiModelProperty(example = "417505", required = true, value = "A color swatch (as an RGB hex value with no leading '#', e.g. C8C8C8).")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public EnvironmentBody defaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
    return this;
  }

   /**
   * The default TTL for the new environment.
   * @return defaultTtl
  **/
  @ApiModelProperty(example = "0.0", value = "The default TTL for the new environment.")
  public BigDecimal getDefaultTtl() {
    return defaultTtl;
  }

  public void setDefaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentBody environmentBody = (EnvironmentBody) o;
    return Objects.equals(this.name, environmentBody.name) &&
        Objects.equals(this.key, environmentBody.key) &&
        Objects.equals(this.color, environmentBody.color) &&
        Objects.equals(this.defaultTtl, environmentBody.defaultTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, color, defaultTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    defaultTtl: ").append(toIndentedString(defaultTtl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

