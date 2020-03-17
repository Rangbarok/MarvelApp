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

import java.io.Serializable;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.CharacterSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CharacterList
 */

public class CharacterList implements Serializable {
  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Integer available;

  public static final String JSON_PROPERTY_COLLECTION_U_R_I = "collectionURI";
  private String collectionURI;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CharacterSummary> items = null;

  public static final String JSON_PROPERTY_RETURNED = "returned";
  private Integer returned;


  public CharacterList available(Integer available) {
    
    this.available = available;
    return this;
  }

   /**
   * The number of total available characters in this list. Will always be greater than or equal to the \&quot;returned\&quot; value.
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of total available characters in this list. Will always be greater than or equal to the \"returned\" value.")
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvailable() {
    return available;
  }



  public void setAvailable(Integer available) {
    this.available = available;
  }


  public CharacterList collectionURI(String collectionURI) {
    
    this.collectionURI = collectionURI;
    return this;
  }

   /**
   * The path to the full list of characters in this collection.
   * @return collectionURI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path to the full list of characters in this collection.")
  @JsonProperty(JSON_PROPERTY_COLLECTION_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectionURI() {
    return collectionURI;
  }



  public void setCollectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
  }


  public CharacterList items(List<CharacterSummary> items) {
    
    this.items = items;
    return this;
  }

  public CharacterList addItemsItem(CharacterSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<CharacterSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of returned characters in this collection.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of returned characters in this collection.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CharacterSummary> getItems() {
    return items;
  }



  public void setItems(List<CharacterSummary> items) {
    this.items = items;
  }


  public CharacterList returned(Integer returned) {
    
    this.returned = returned;
    return this;
  }

   /**
   * The number of characters returned in this collection (up to 20).
   * @return returned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of characters returned in this collection (up to 20).")
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
    CharacterList characterList = (CharacterList) o;
    return Objects.equals(this.available, characterList.available) &&
        Objects.equals(this.collectionURI, characterList.collectionURI) &&
        Objects.equals(this.items, characterList.items) &&
        Objects.equals(this.returned, characterList.returned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, collectionURI, items, returned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterList {\n");
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

