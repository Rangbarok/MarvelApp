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
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ComicDataContainer
 */

public class ComicDataContainer {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Integer offset;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Comic> results = null;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;


  public ComicDataContainer count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The total number of results returned by this call.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of results returned by this call.")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }



  public void setCount(Integer count) {
    this.count = count;
  }


  public ComicDataContainer limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The requested result limit.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The requested result limit.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }



  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ComicDataContainer offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The requested offset (number of skipped results) of the call.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The requested offset (number of skipped results) of the call.")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }



  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public ComicDataContainer results(List<Comic> results) {
    
    this.results = results;
    return this;
  }

  public ComicDataContainer addResultsItem(Comic resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Comic>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The list of comics returned by the call
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of comics returned by the call")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Comic> getResults() {
    return results;
  }



  public void setResults(List<Comic> results) {
    this.results = results;
  }


  public ComicDataContainer total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of resources available given the current filter set.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of resources available given the current filter set.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }



  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComicDataContainer comicDataContainer = (ComicDataContainer) o;
    return Objects.equals(this.count, comicDataContainer.count) &&
        Objects.equals(this.limit, comicDataContainer.limit) &&
        Objects.equals(this.offset, comicDataContainer.offset) &&
        Objects.equals(this.results, comicDataContainer.results) &&
        Objects.equals(this.total, comicDataContainer.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, limit, offset, results, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComicDataContainer {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

