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
 * ComicDate
 */

public class ComicDate {
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;


  public ComicDate date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * The date.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }



  public void setDate(String date) {
    this.date = date;
  }


  public ComicDate type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A description of the date (e.g. onsale date, FOC date).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the date (e.g. onsale date, FOC date).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }



  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComicDate comicDate = (ComicDate) o;
    return Objects.equals(this.date, comicDate.date) &&
        Objects.equals(this.type, comicDate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComicDate {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

