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
import es.usj.mastertsa.jhernandez.musicquiz.client.model.ComicList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.EventList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Image;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.SeriesList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.StoryList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Url;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Creator
 */

public class Creator {
  public static final String JSON_PROPERTY_COMICS = "comics";
  private ComicList comics;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private EventList events;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private String middleName;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_RESOURCE_U_R_I = "resourceURI";
  private String resourceURI;

  public static final String JSON_PROPERTY_SERIES = "series";
  private SeriesList series;

  public static final String JSON_PROPERTY_STORIES = "stories";
  private StoryList stories;

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private String suffix;

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  private Image thumbnail;

  public static final String JSON_PROPERTY_URLS = "urls";
  private List<Url> urls = null;


  public Creator comics(ComicList comics) {
    
    this.comics = comics;
    return this;
  }

   /**
   * Get comics
   * @return comics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComicList getComics() {
    return comics;
  }



  public void setComics(ComicList comics) {
    this.comics = comics;
  }


  public Creator events(EventList events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventList getEvents() {
    return events;
  }



  public void setEvents(EventList events) {
    this.events = events;
  }


  public Creator firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the creator.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the creator.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }



  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Creator fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name of the creator (a space-separated concatenation of the above four fields).
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full name of the creator (a space-separated concatenation of the above four fields).")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }



  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public Creator id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the creator resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the creator resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }



  public void setId(Integer id) {
    this.id = id;
  }


  public Creator lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the creator.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the creator.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }



  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Creator middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the creator.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The middle name of the creator.")
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiddleName() {
    return middleName;
  }



  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public Creator modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * The date the resource was most recently modified.
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the resource was most recently modified.")
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModified() {
    return modified;
  }



  public void setModified(String modified) {
    this.modified = modified;
  }


  public Creator resourceURI(String resourceURI) {
    
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * The canonical URL identifier for this resource.
   * @return resourceURI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The canonical URL identifier for this resource.")
  @JsonProperty(JSON_PROPERTY_RESOURCE_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceURI() {
    return resourceURI;
  }



  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }


  public Creator series(SeriesList series) {
    
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SeriesList getSeries() {
    return series;
  }



  public void setSeries(SeriesList series) {
    this.series = series;
  }


  public Creator stories(StoryList stories) {
    
    this.stories = stories;
    return this;
  }

   /**
   * Get stories
   * @return stories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StoryList getStories() {
    return stories;
  }



  public void setStories(StoryList stories) {
    this.stories = stories;
  }


  public Creator suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * The suffix or honorific for the creator.
   * @return suffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suffix or honorific for the creator.")
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuffix() {
    return suffix;
  }



  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public Creator thumbnail(Image thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Image getThumbnail() {
    return thumbnail;
  }



  public void setThumbnail(Image thumbnail) {
    this.thumbnail = thumbnail;
  }


  public Creator urls(List<Url> urls) {
    
    this.urls = urls;
    return this;
  }

  public Creator addUrlsItem(Url urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<Url>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * A set of public web site URLs for the resource.
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of public web site URLs for the resource.")
  @JsonProperty(JSON_PROPERTY_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Url> getUrls() {
    return urls;
  }



  public void setUrls(List<Url> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Creator creator = (Creator) o;
    return Objects.equals(this.comics, creator.comics) &&
        Objects.equals(this.events, creator.events) &&
        Objects.equals(this.firstName, creator.firstName) &&
        Objects.equals(this.fullName, creator.fullName) &&
        Objects.equals(this.id, creator.id) &&
        Objects.equals(this.lastName, creator.lastName) &&
        Objects.equals(this.middleName, creator.middleName) &&
        Objects.equals(this.modified, creator.modified) &&
        Objects.equals(this.resourceURI, creator.resourceURI) &&
        Objects.equals(this.series, creator.series) &&
        Objects.equals(this.stories, creator.stories) &&
        Objects.equals(this.suffix, creator.suffix) &&
        Objects.equals(this.thumbnail, creator.thumbnail) &&
        Objects.equals(this.urls, creator.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comics, events, firstName, fullName, id, lastName, middleName, modified, resourceURI, series, stories, suffix, thumbnail, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Creator {\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

