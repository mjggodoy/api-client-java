/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 1.0.7
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
import io.swagger.client.model.FlagsprojectKeyfeatureFlagKeyPatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PatchComment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:19:46.511-08:00")
public class PatchComment {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("patch")
  private List<FlagsprojectKeyfeatureFlagKeyPatch> patch = null;

  public PatchComment comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(example = "This is a comment string", value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PatchComment patch(List<FlagsprojectKeyfeatureFlagKeyPatch> patch) {
    this.patch = patch;
    return this;
  }

  public PatchComment addPatchItem(FlagsprojectKeyfeatureFlagKeyPatch patchItem) {
    if (this.patch == null) {
      this.patch = new ArrayList<FlagsprojectKeyfeatureFlagKeyPatch>();
    }
    this.patch.add(patchItem);
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @ApiModelProperty(value = "")
  public List<FlagsprojectKeyfeatureFlagKeyPatch> getPatch() {
    return patch;
  }

  public void setPatch(List<FlagsprojectKeyfeatureFlagKeyPatch> patch) {
    this.patch = patch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchComment patchComment = (PatchComment) o;
    return Objects.equals(this.comment, patchComment.comment) &&
        Objects.equals(this.patch, patchComment.patch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, patch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchComment {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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
