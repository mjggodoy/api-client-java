/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Links;
import java.io.IOException;

/**
 * UserFlagSetting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-25T12:47:59.743-07:00")
public class UserFlagSetting {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_value")
  private Boolean value = null;

  @SerializedName("setting")
  private Boolean setting = null;

  public UserFlagSetting links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public UserFlagSetting value(Boolean value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  public UserFlagSetting setting(Boolean setting) {
    this.setting = setting;
    return this;
  }

   /**
   * Get setting
   * @return setting
  **/
  @ApiModelProperty(value = "")
  public Boolean getSetting() {
    return setting;
  }

  public void setSetting(Boolean setting) {
    this.setting = setting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFlagSetting userFlagSetting = (UserFlagSetting) o;
    return Objects.equals(this.links, userFlagSetting.links) &&
        Objects.equals(this.value, userFlagSetting.value) &&
        Objects.equals(this.setting, userFlagSetting.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, value, setting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFlagSetting {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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

