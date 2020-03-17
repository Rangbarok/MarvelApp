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
 * Character
 */

public class Character implements Serializable {
  public static final String JSON_PROPERTY_COMICS = "comics";
  private ComicList comics;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private EventList events;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE_U_R_I = "resourceURI";
  private String resourceURI;

  public static final String JSON_PROPERTY_SERIES = "series";
  private SeriesList series;

  public static final String JSON_PROPERTY_STORIES = "stories";
  private StoryList stories;

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  private Image thumbnail;

  public static final String JSON_PROPERTY_URLS = "urls";
  private List<Url> urls = null;


  public Character comics(ComicList comics) {
    
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


  public Character description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short bio or description of the character.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short bio or description of the character.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }



  public void setDescription(String description) {
    this.description = description;
  }


  public Character events(EventList events) {
    
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


  public Character id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the character resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the character resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }



  public void setId(Integer id) {
    this.id = id;
  }


  public Character modified(String modified) {
    
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


  public Character name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the character.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the character.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public Character resourceURI(String resourceURI) {
    
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


  public Character series(SeriesList series) {
    
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


  public Character stories(StoryList stories) {
    
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


  public Character thumbnail(Image thumbnail) {
    
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


  public Character urls(List<Url> urls) {
    
    this.urls = urls;
    return this;
  }

  public Character addUrlsItem(Url urlsItem) {
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
    Character character = (Character) o;
    return Objects.equals(this.comics, character.comics) &&
        Objects.equals(this.description, character.description) &&
        Objects.equals(this.events, character.events) &&
        Objects.equals(this.id, character.id) &&
        Objects.equals(this.modified, character.modified) &&
        Objects.equals(this.name, character.name) &&
        Objects.equals(this.resourceURI, character.resourceURI) &&
        Objects.equals(this.series, character.series) &&
        Objects.equals(this.stories, character.stories) &&
        Objects.equals(this.thumbnail, character.thumbnail) &&
        Objects.equals(this.urls, character.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comics, description, events, id, modified, name, resourceURI, series, stories, thumbnail, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Character {\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
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

