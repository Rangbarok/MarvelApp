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
import es.usj.mastertsa.jhernandez.musicquiz.client.model.ComicSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ComicList
 */

public class ComicList {
  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Integer available;

  public static final String JSON_PROPERTY_COLLECTION_U_R_I = "collectionURI";
  private String collectionURI;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ComicSummary> items = null;

  public static final String JSON_PROPERTY_RETURNED = "returned";
  private Integer returned;


  public ComicList available(Integer available) {
    
    this.available = available;
    return this;
  }

   /**
   * The number of total available issues in this list. Will always be greater than or equal to the \&quot;returned\&quot; value.
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of total available issues in this list. Will always be greater than or equal to the \"returned\" value.")
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvailable() {
    return available;
  }



  public void setAvailable(Integer available) {
    this.available = available;
  }


  public ComicList collectionURI(String collectionURI) {
    
    this.collectionURI = collectionURI;
    return this;
  }

   /**
   * The path to the full list of issues in this collection.
   * @return collectionURI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path to the full list of issues in this collection.")
  @JsonProperty(JSON_PROPERTY_COLLECTION_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectionURI() {
    return collectionURI;
  }



  public void setCollectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
  }


  public ComicList items(List<ComicSummary> items) {
    
    this.items = items;
    return this;
  }

  public ComicList addItemsItem(ComicSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ComicSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of returned issues in this collection.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of returned issues in this collection.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComicSummary> getItems() {
    return items;
  }



  public void setItems(List<ComicSummary> items) {
    this.items = items;
  }


  public ComicList returned(Integer returned) {
    
    this.returned = returned;
    return this;
  }

   /**
   * The number of issues returned in this collection (up to 20).
   * @return returned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of issues returned in this collection (up to 20).")
  @JsonProperty(JSON_PROPERTY_RETURNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReturned() {
    return returned;
  }



  public void setReturned(Integer returned) {
    this.returned = returned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComicList comicList = (ComicList) o;
    return Objects.equals(this.available, comicList.available) &&
        Objects.equals(this.collectionURI, comicList.collectionURI) &&
        Objects.equals(this.items, comicList.items) &&
        Objects.equals(this.returned, comicList.returned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, collectionURI, items, returned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComicList {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    collectionURI: ").append(toIndentedString(collectionURI)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
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
