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
 * EventSummary
 */

public class EventSummary {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE_U_R_I = "resourceURI";
  private String resourceURI;


  public EventSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the event.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the event.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public EventSummary resourceURI(String resourceURI) {
    
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * The path to the individual event resource.
   * @return resourceURI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path to the individual event resource.")
  @JsonProperty(JSON_PROPERTY_RESOURCE_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceURI() {
    return resourceURI;
  }



  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSummary eventSummary = (EventSummary) o;
    return Objects.equals(this.name, eventSummary.name) &&
        Objects.equals(this.resourceURI, eventSummary.resourceURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourceURI);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
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

