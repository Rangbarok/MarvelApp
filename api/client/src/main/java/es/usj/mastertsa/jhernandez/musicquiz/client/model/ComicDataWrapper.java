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
import es.usj.mastertsa.jhernandez.musicquiz.client.model.ComicDataContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ComicDataWrapper
 */

public class ComicDataWrapper {
  public static final String JSON_PROPERTY_ATTRIBUTION_H_T_M_L = "attributionHTML";
  private String attributionHTML;

  public static final String JSON_PROPERTY_ATTRIBUTION_TEXT = "attributionText";
  private String attributionText;

  public static final String JSON_PROPERTY_CODE = "code";
  private Integer code;

  public static final String JSON_PROPERTY_COPYRIGHT = "copyright";
  private String copyright;

  public static final String JSON_PROPERTY_DATA = "data";
  private ComicDataContainer data;

  public static final String JSON_PROPERTY_ETAG = "etag";
  private String etag;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;


  public ComicDataWrapper attributionHTML(String attributionHTML) {
    
    this.attributionHTML = attributionHTML;
    return this;
  }

   /**
   * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
   * @return attributionHTML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTION_H_T_M_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttributionHTML() {
    return attributionHTML;
  }



  public void setAttributionHTML(String attributionHTML) {
    this.attributionHTML = attributionHTML;
  }


  public ComicDataWrapper attributionText(String attributionText) {
    
    this.attributionText = attributionText;
    return this;
  }

   /**
   * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
   * @return attributionText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTION_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttributionText() {
    return attributionText;
  }



  public void setAttributionText(String attributionText) {
    this.attributionText = attributionText;
  }


  public ComicDataWrapper code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * The HTTP status code of the returned result.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP status code of the returned result.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCode() {
    return code;
  }



  public void setCode(Integer code) {
    this.code = code;
  }


  public ComicDataWrapper copyright(String copyright) {
    
    this.copyright = copyright;
    return this;
  }

   /**
   * The copyright notice for the returned result.
   * @return copyright
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The copyright notice for the returned result.")
  @JsonProperty(JSON_PROPERTY_COPYRIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCopyright() {
    return copyright;
  }



  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }


  public ComicDataWrapper data(ComicDataContainer data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComicDataContainer getData() {
    return data;
  }



  public void setData(ComicDataContainer data) {
    this.data = data;
  }


  public ComicDataWrapper etag(String etag) {
    
    this.etag = etag;
    return this;
  }

   /**
   * A digest value of the content returned by the call.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A digest value of the content returned by the call.")
  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEtag() {
    return etag;
  }



  public void setEtag(String etag) {
    this.etag = etag;
  }


  public ComicDataWrapper status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * A string description of the call status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string description of the call status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }



  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComicDataWrapper comicDataWrapper = (ComicDataWrapper) o;
    return Objects.equals(this.attributionHTML, comicDataWrapper.attributionHTML) &&
        Objects.equals(this.attributionText, comicDataWrapper.attributionText) &&
        Objects.equals(this.code, comicDataWrapper.code) &&
        Objects.equals(this.copyright, comicDataWrapper.copyright) &&
        Objects.equals(this.data, comicDataWrapper.data) &&
        Objects.equals(this.etag, comicDataWrapper.etag) &&
        Objects.equals(this.status, comicDataWrapper.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionHTML, attributionText, code, copyright, data, etag, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComicDataWrapper {\n");
    sb.append("    attributionHTML: ").append(toIndentedString(attributionHTML)).append("\n");
    sb.append("    attributionText: ").append(toIndentedString(attributionText)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

