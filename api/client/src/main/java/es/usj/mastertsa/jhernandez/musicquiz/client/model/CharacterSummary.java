/*
 * gateway.marvel.com
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: Cable
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package es.usj.mastertsa.jhernandez.musicquiz.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CharacterSummary
 */

public class CharacterSummary {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE_U_R_I = "resourceURI";
  private String resourceURI;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;


  public CharacterSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full name of the character.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full name of the character.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public CharacterSummary resourceURI(String resourceURI) {
    
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * The path to the individual character resource.
   * @return resourceURI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path to the individual character resource.")
  @JsonProperty(JSON_PROPERTY_RESOURCE_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceURI() {
    return resourceURI;
  }



  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }


  public CharacterSummary role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * The role of the creator in the parent entity.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The role of the creator in the parent entity.")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }



  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterSummary characterSummary = (CharacterSummary) o;
    return Objects.equals(this.name, characterSummary.name) &&
        Objects.equals(this.resourceURI, characterSummary.resourceURI) &&
        Objects.equals(this.role, characterSummary.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourceURI, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
