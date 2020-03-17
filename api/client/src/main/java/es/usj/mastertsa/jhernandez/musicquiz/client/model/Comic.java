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
import es.usj.mastertsa.jhernandez.musicquiz.client.model.CharacterList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.ComicDate;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.ComicPrice;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.ComicSummary;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.CreatorList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.EventList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Image;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.SeriesSummary;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.StoryList;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.TextObject;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Url;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Comic
 */

public class Comic implements Serializable {
  public static final String JSON_PROPERTY_CHARACTERS = "characters";
  private CharacterList characters;

  public static final String JSON_PROPERTY_COLLECTED_ISSUES = "collectedIssues";
  private List<ComicSummary> collectedIssues = null;

  public static final String JSON_PROPERTY_COLLECTIONS = "collections";
  private List<ComicSummary> collections = null;

  public static final String JSON_PROPERTY_CREATORS = "creators";
  private CreatorList creators;

  public static final String JSON_PROPERTY_DATES = "dates";
  private List<ComicDate> dates = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DIAMOND_CODE = "diamondCode";
  private String diamondCode;

  public static final String JSON_PROPERTY_DIGITAL_ID = "digitalId";
  private Integer digitalId;

  public static final String JSON_PROPERTY_EAN = "ean";
  private String ean;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private EventList events;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_IMAGES = "images";
  private List<Image> images = null;

  public static final String JSON_PROPERTY_ISBN = "isbn";
  private String isbn;

  public static final String JSON_PROPERTY_ISSN = "issn";
  private String issn;

  public static final String JSON_PROPERTY_ISSUE_NUMBER = "issueNumber";
  private Double issueNumber;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_PAGE_COUNT = "pageCount";
  private Integer pageCount;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private List<ComicPrice> prices = null;

  public static final String JSON_PROPERTY_RESOURCE_U_R_I = "resourceURI";
  private String resourceURI;

  public static final String JSON_PROPERTY_SERIES = "series";
  private SeriesSummary series;

  public static final String JSON_PROPERTY_STORIES = "stories";
  private StoryList stories;

  public static final String JSON_PROPERTY_TEXT_OBJECTS = "textObjects";
  private List<TextObject> textObjects = null;

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  private Image thumbnail;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_UPC = "upc";
  private String upc;

  public static final String JSON_PROPERTY_URLS = "urls";
  private List<Url> urls = null;

  public static final String JSON_PROPERTY_VARIANT_DESCRIPTION = "variantDescription";
  private String variantDescription;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ComicSummary> variants = null;


  public Comic characters(CharacterList characters) {
    
    this.characters = characters;
    return this;
  }

   /**
   * Get characters
   * @return characters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARACTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CharacterList getCharacters() {
    return characters;
  }



  public void setCharacters(CharacterList characters) {
    this.characters = characters;
  }


  public Comic collectedIssues(List<ComicSummary> collectedIssues) {
    
    this.collectedIssues = collectedIssues;
    return this;
  }

  public Comic addCollectedIssuesItem(ComicSummary collectedIssuesItem) {
    if (this.collectedIssues == null) {
      this.collectedIssues = new ArrayList<ComicSummary>();
    }
    this.collectedIssues.add(collectedIssuesItem);
    return this;
  }

   /**
   * A list of issues collected in this comic (will generally be empty for periodical formats such as \&quot;comic\&quot; or \&quot;magazine\&quot;).
   * @return collectedIssues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of issues collected in this comic (will generally be empty for periodical formats such as \"comic\" or \"magazine\").")
  @JsonProperty(JSON_PROPERTY_COLLECTED_ISSUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComicSummary> getCollectedIssues() {
    return collectedIssues;
  }



  public void setCollectedIssues(List<ComicSummary> collectedIssues) {
    this.collectedIssues = collectedIssues;
  }


  public Comic collections(List<ComicSummary> collections) {
    
    this.collections = collections;
    return this;
  }

  public Comic addCollectionsItem(ComicSummary collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<ComicSummary>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * A list of collections which include this comic (will generally be empty if the comic&#39;s format is a collection).
   * @return collections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of collections which include this comic (will generally be empty if the comic's format is a collection).")
  @JsonProperty(JSON_PROPERTY_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComicSummary> getCollections() {
    return collections;
  }



  public void setCollections(List<ComicSummary> collections) {
    this.collections = collections;
  }


  public Comic creators(CreatorList creators) {
    
    this.creators = creators;
    return this;
  }

   /**
   * Get creators
   * @return creators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreatorList getCreators() {
    return creators;
  }



  public void setCreators(CreatorList creators) {
    this.creators = creators;
  }


  public Comic dates(List<ComicDate> dates) {
    
    this.dates = dates;
    return this;
  }

  public Comic addDatesItem(ComicDate datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<ComicDate>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * A list of key dates for this comic.
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of key dates for this comic.")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComicDate> getDates() {
    return dates;
  }



  public void setDates(List<ComicDate> dates) {
    this.dates = dates;
  }


  public Comic description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The preferred description of the comic.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The preferred description of the comic.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }



  public void setDescription(String description) {
    this.description = description;
  }


  public Comic diamondCode(String diamondCode) {
    
    this.diamondCode = diamondCode;
    return this;
  }

   /**
   * The Diamond code for the comic.
   * @return diamondCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Diamond code for the comic.")
  @JsonProperty(JSON_PROPERTY_DIAMOND_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiamondCode() {
    return diamondCode;
  }



  public void setDiamondCode(String diamondCode) {
    this.diamondCode = diamondCode;
  }


  public Comic digitalId(Integer digitalId) {
    
    this.digitalId = digitalId;
    return this;
  }

   /**
   * The ID of the digital comic representation of this comic. Will be 0 if the comic is not available digitally.
   * @return digitalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the digital comic representation of this comic. Will be 0 if the comic is not available digitally.")
  @JsonProperty(JSON_PROPERTY_DIGITAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDigitalId() {
    return digitalId;
  }



  public void setDigitalId(Integer digitalId) {
    this.digitalId = digitalId;
  }


  public Comic ean(String ean) {
    
    this.ean = ean;
    return this;
  }

   /**
   * The EAN barcode for the comic.
   * @return ean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EAN barcode for the comic.")
  @JsonProperty(JSON_PROPERTY_EAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEan() {
    return ean;
  }



  public void setEan(String ean) {
    this.ean = ean;
  }


  public Comic events(EventList events) {
    
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


  public Comic format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * The publication format of the comic e.g. comic, hardcover, trade paperback.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The publication format of the comic e.g. comic, hardcover, trade paperback.")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormat() {
    return format;
  }



  public void setFormat(String format) {
    this.format = format;
  }


  public Comic id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the comic resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the comic resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }



  public void setId(Integer id) {
    this.id = id;
  }


  public Comic images(List<Image> images) {
    
    this.images = images;
    return this;
  }

  public Comic addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<Image>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * A list of promotional images associated with this comic.
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of promotional images associated with this comic.")
  @JsonProperty(JSON_PROPERTY_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Image> getImages() {
    return images;
  }



  public void setImages(List<Image> images) {
    this.images = images;
  }


  public Comic isbn(String isbn) {
    
    this.isbn = isbn;
    return this;
  }

   /**
   * The ISBN for the comic (generally only populated for collection formats).
   * @return isbn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISBN for the comic (generally only populated for collection formats).")
  @JsonProperty(JSON_PROPERTY_ISBN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsbn() {
    return isbn;
  }



  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }


  public Comic issn(String issn) {
    
    this.issn = issn;
    return this;
  }

   /**
   * The ISSN barcode for the comic.
   * @return issn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISSN barcode for the comic.")
  @JsonProperty(JSON_PROPERTY_ISSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssn() {
    return issn;
  }



  public void setIssn(String issn) {
    this.issn = issn;
  }


  public Comic issueNumber(Double issueNumber) {
    
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * The number of the issue in the series (will generally be 0 for collection formats).
   * @return issueNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of the issue in the series (will generally be 0 for collection formats).")
  @JsonProperty(JSON_PROPERTY_ISSUE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getIssueNumber() {
    return issueNumber;
  }



  public void setIssueNumber(Double issueNumber) {
    this.issueNumber = issueNumber;
  }


  public Comic modified(String modified) {
    
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


  public Comic pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of story pages in the comic.
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of story pages in the comic.")
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageCount() {
    return pageCount;
  }



  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public Comic prices(List<ComicPrice> prices) {
    
    this.prices = prices;
    return this;
  }

  public Comic addPricesItem(ComicPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<ComicPrice>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * A list of prices for this comic.
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of prices for this comic.")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComicPrice> getPrices() {
    return prices;
  }



  public void setPrices(List<ComicPrice> prices) {
    this.prices = prices;
  }


  public Comic resourceURI(String resourceURI) {
    
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


  public Comic series(SeriesSummary series) {
    
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

  public SeriesSummary getSeries() {
    return series;
  }



  public void setSeries(SeriesSummary series) {
    this.series = series;
  }


  public Comic stories(StoryList stories) {
    
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


  public Comic textObjects(List<TextObject> textObjects) {
    
    this.textObjects = textObjects;
    return this;
  }

  public Comic addTextObjectsItem(TextObject textObjectsItem) {
    if (this.textObjects == null) {
      this.textObjects = new ArrayList<TextObject>();
    }
    this.textObjects.add(textObjectsItem);
    return this;
  }

   /**
   * A set of descriptive text blurbs for the comic.
   * @return textObjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of descriptive text blurbs for the comic.")
  @JsonProperty(JSON_PROPERTY_TEXT_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TextObject> getTextObjects() {
    return textObjects;
  }



  public void setTextObjects(List<TextObject> textObjects) {
    this.textObjects = textObjects;
  }


  public Comic thumbnail(Image thumbnail) {
    
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


  public Comic title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The canonical title of the comic.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The canonical title of the comic.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }



  public void setTitle(String title) {
    this.title = title;
  }


  public Comic upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * The UPC barcode number for the comic (generally only populated for periodical formats).
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UPC barcode number for the comic (generally only populated for periodical formats).")
  @JsonProperty(JSON_PROPERTY_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpc() {
    return upc;
  }



  public void setUpc(String upc) {
    this.upc = upc;
  }


  public Comic urls(List<Url> urls) {
    
    this.urls = urls;
    return this;
  }

  public Comic addUrlsItem(Url urlsItem) {
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


  public Comic variantDescription(String variantDescription) {
    
    this.variantDescription = variantDescription;
    return this;
  }

   /**
   * If the issue is a variant (e.g. an alternate cover, second printing, or director’s cut), a text description of the variant.
   * @return variantDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the issue is a variant (e.g. an alternate cover, second printing, or director’s cut), a text description of the variant.")
  @JsonProperty(JSON_PROPERTY_VARIANT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVariantDescription() {
    return variantDescription;
  }



  public void setVariantDescription(String variantDescription) {
    this.variantDescription = variantDescription;
  }


  public Comic variants(List<ComicSummary> variants) {
    
    this.variants = variants;
    return this;
  }

  public Comic addVariantsItem(ComicSummary variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<ComicSummary>();
    }
    this.variants.add(variantsItem);
    return this;
  }

   /**
   * A list of variant issues for this comic (includes the \&quot;original\&quot; issue if the current issue is a variant).
   * @return variants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of variant issues for this comic (includes the \"original\" issue if the current issue is a variant).")
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComicSummary> getVariants() {
    return variants;
  }



  public void setVariants(List<ComicSummary> variants) {
    this.variants = variants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comic comic = (Comic) o;
    return Objects.equals(this.characters, comic.characters) &&
        Objects.equals(this.collectedIssues, comic.collectedIssues) &&
        Objects.equals(this.collections, comic.collections) &&
        Objects.equals(this.creators, comic.creators) &&
        Objects.equals(this.dates, comic.dates) &&
        Objects.equals(this.description, comic.description) &&
        Objects.equals(this.diamondCode, comic.diamondCode) &&
        Objects.equals(this.digitalId, comic.digitalId) &&
        Objects.equals(this.ean, comic.ean) &&
        Objects.equals(this.events, comic.events) &&
        Objects.equals(this.format, comic.format) &&
        Objects.equals(this.id, comic.id) &&
        Objects.equals(this.images, comic.images) &&
        Objects.equals(this.isbn, comic.isbn) &&
        Objects.equals(this.issn, comic.issn) &&
        Objects.equals(this.issueNumber, comic.issueNumber) &&
        Objects.equals(this.modified, comic.modified) &&
        Objects.equals(this.pageCount, comic.pageCount) &&
        Objects.equals(this.prices, comic.prices) &&
        Objects.equals(this.resourceURI, comic.resourceURI) &&
        Objects.equals(this.series, comic.series) &&
        Objects.equals(this.stories, comic.stories) &&
        Objects.equals(this.textObjects, comic.textObjects) &&
        Objects.equals(this.thumbnail, comic.thumbnail) &&
        Objects.equals(this.title, comic.title) &&
        Objects.equals(this.upc, comic.upc) &&
        Objects.equals(this.urls, comic.urls) &&
        Objects.equals(this.variantDescription, comic.variantDescription) &&
        Objects.equals(this.variants, comic.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characters, collectedIssues, collections, creators, dates, description, diamondCode, digitalId, ean, events, format, id, images, isbn, issn, issueNumber, modified, pageCount, prices, resourceURI, series, stories, textObjects, thumbnail, title, upc, urls, variantDescription, variants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comic {\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    collectedIssues: ").append(toIndentedString(collectedIssues)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    diamondCode: ").append(toIndentedString(diamondCode)).append("\n");
    sb.append("    digitalId: ").append(toIndentedString(digitalId)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    issn: ").append(toIndentedString(issn)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
    sb.append("    textObjects: ").append(toIndentedString(textObjects)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    variantDescription: ").append(toIndentedString(variantDescription)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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

