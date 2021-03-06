/*
 * rokka.io
 * digital image processing done right. [Documentation](https://rokka.io/documentation). [Changelog](https://api.rokka.io/changelog.md).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.rokka.client.codegen.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.rokka.client.codegen.model.StackExpression;
import io.rokka.client.codegen.model.StackOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StackDefinition
 */

public class StackDefinition {
  @SerializedName("stack_operations")
  private List<StackOperation> stackOperations = new ArrayList<StackOperation>();

  @SerializedName("stack_options")
  private Object stackOptions = null;

  @SerializedName("stack_expressions")
  private List<StackExpression> stackExpressions = null;

  public StackDefinition stackOperations(List<StackOperation> stackOperations) {
    this.stackOperations = stackOperations;
    return this;
  }

  public StackDefinition addStackOperationsItem(StackOperation stackOperationsItem) {
    this.stackOperations.add(stackOperationsItem);
    return this;
  }

   /**
   * Collection of stack operations
   * @return stackOperations
  **/
  @ApiModelProperty(required = true, value = "Collection of stack operations")
  public List<StackOperation> getStackOperations() {
    return stackOperations;
  }

  public void setStackOperations(List<StackOperation> stackOperations) {
    this.stackOperations = stackOperations;
  }

  public StackDefinition stackOptions(Object stackOptions) {
    this.stackOptions = stackOptions;
    return this;
  }

   /**
   * Get stackOptions
   * @return stackOptions
  **/
  @ApiModelProperty(example = "", value = "")
  public Object getStackOptions() {
    return stackOptions;
  }

  public void setStackOptions(Object stackOptions) {
    this.stackOptions = stackOptions;
  }

  public StackDefinition stackExpressions(List<StackExpression> stackExpressions) {
    this.stackExpressions = stackExpressions;
    return this;
  }

  public StackDefinition addStackExpressionsItem(StackExpression stackExpressionsItem) {
    if (this.stackExpressions == null) {
      this.stackExpressions = new ArrayList<StackExpression>();
    }
    this.stackExpressions.add(stackExpressionsItem);
    return this;
  }

   /**
   * Collection of stack expressions
   * @return stackExpressions
  **/
  @ApiModelProperty(value = "Collection of stack expressions")
  public List<StackExpression> getStackExpressions() {
    return stackExpressions;
  }

  public void setStackExpressions(List<StackExpression> stackExpressions) {
    this.stackExpressions = stackExpressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackDefinition stackDefinition = (StackDefinition) o;
    return Objects.equals(this.stackOperations, stackDefinition.stackOperations) &&
        Objects.equals(this.stackOptions, stackDefinition.stackOptions) &&
        Objects.equals(this.stackExpressions, stackDefinition.stackExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackOperations, stackOptions, stackExpressions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackDefinition {\n");
    
    sb.append("    stackOperations: ").append(toIndentedString(stackOperations)).append("\n");
    sb.append("    stackOptions: ").append(toIndentedString(stackOptions)).append("\n");
    sb.append("    stackExpressions: ").append(toIndentedString(stackExpressions)).append("\n");
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

