package es.usj.mastertsa.pluengo.marvelcollection.client.api;

import es.usj.mastertsa.pluengo.marvelcollection.client.ApiClient;
import es.usj.mastertsa.pluengo.marvelcollection.client.EncodingUtils;

import org.threeten.bp.LocalDate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.usj.mastertsa.pluengo.marvelcollection.client.model.CharacterDataWrapper;
import es.usj.mastertsa.pluengo.marvelcollection.client.model.ComicDataWrapper;
import es.usj.mastertsa.pluengo.marvelcollection.client.model.CreatorDataWrapper;
import es.usj.mastertsa.pluengo.marvelcollection.client.model.EventDataWrapper;
import es.usj.mastertsa.pluengo.marvelcollection.client.model.SeriesDataWrapper;
import es.usj.mastertsa.pluengo.marvelcollection.client.model.StoryDataWrapper;
import feign.*;


public interface DefaultApi extends ApiClient.Api {


  /**
   * Fetches lists of creators.
   * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
   * @param firstName Filter by creator first name (e.g. Brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CreatorDataWrapper getAllCreatorCollection(@Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("suffix") String suffix, @Param("nameStartsWith") String nameStartsWith, @Param("firstNameStartsWith") String firstNameStartsWith, @Param("middleNameStartsWith") String middleNameStartsWith, @Param("lastNameStartsWith") String lastNameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of creators.
   * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getAllCreatorCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllCreatorCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstName - Filter by creator first name (e.g. Brian). (optional)</li>
   *   <li>middleName - Filter by creator middle name (e.g. Michael). (optional)</li>
   *   <li>lastName - Filter by creator last name (e.g. Bendis). (optional)</li>
   *   <li>suffix - Filter by suffix or honorific (e.g. Jr., Sr.). (optional)</li>
   *   <li>nameStartsWith - Filter by creator names that match critera (e.g. B, St L). (optional)</li>
   *   <li>firstNameStartsWith - Filter by creator first names that match critera (e.g. B, St L). (optional)</li>
   *   <li>middleNameStartsWith - Filter by creator middle names that match critera (e.g. Mi). (optional)</li>
   *   <li>lastNameStartsWith - Filter by creator last names that match critera (e.g. Ben). (optional)</li>
   *   <li>modifiedSince - Return only creators which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CreatorDataWrapper getAllCreatorCollection(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllCreatorCollection</code> method in a fluent style.
   */
  public static class GetAllCreatorCollectionQueryParams extends HashMap<String, Object> {
    public GetAllCreatorCollectionQueryParams firstName(final String value) {
      put("firstName", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams middleName(final String value) {
      put("middleName", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams lastName(final String value) {
      put("lastName", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams suffix(final String value) {
      put("suffix", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams firstNameStartsWith(final String value) {
      put("firstNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams middleNameStartsWith(final String value) {
      put("middleNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams lastNameStartsWith(final String value) {
      put("lastNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllCreatorCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllCreatorCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllCreatorCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllCreatorCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllCreatorCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetAllCreatorCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of events filtered by a character id.
   * Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.
   * @param characterId The character ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&series={series}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  EventDataWrapper getCharacterEventsCollection(@Param("characterId") Integer characterId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("series") List<Integer> series, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of events filtered by a character id.
   * Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCharacterEventsCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCharacterEventsCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param characterId The character ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Filter the event list by name. (optional)</li>
   *   <li>nameStartsWith - Return events with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only events which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>comics - Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&series={series}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  EventDataWrapper getCharacterEventsCollection(@Param("characterId") Integer characterId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCharacterEventsCollection</code> method in a fluent style.
   */
  public static class GetCharacterEventsCollectionQueryParams extends HashMap<String, Object> {
    public GetCharacterEventsCollectionQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterEventsCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches a single character by id.
   * This method fetches a single character resource.  It is the canonical URI for any character resource provided by the API.
   * @param characterId A single character id. (required)
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}")
  @Headers({
    "Accept: */*",
  })
  CharacterDataWrapper getCharacterIndividual(@Param("characterId") Integer characterId);

  /**
   * Fetches lists of series filtered by a character id.
   * Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.
   * @param characterId The character ID (required)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&events={events}&creators={creators}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  SeriesDataWrapper getCharacterSeriesCollection(@Param("characterId") Integer characterId, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("events") List<Integer> events, @Param("creators") List<Integer> creators, @Param("seriesType") String seriesType, @Param("contains") List<String> contains, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of series filtered by a character id.
   * Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCharacterSeriesCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCharacterSeriesCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param characterId The character ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>title - Filter by series title. (optional)</li>
   *   <li>titleStartsWith - Return series with titles that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>startYear - Return only series matching the specified start year. (optional)</li>
   *   <li>modifiedSince - Return only series which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>seriesType - Filter the series by publication frequency type. (optional)</li>
   *   <li>contains - Return only series containing one or more comics with the specified format. (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&events={events}&creators={creators}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  SeriesDataWrapper getCharacterSeriesCollection(@Param("characterId") Integer characterId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCharacterSeriesCollection</code> method in a fluent style.
   */
  public static class GetCharacterSeriesCollectionQueryParams extends HashMap<String, Object> {
    public GetCharacterSeriesCollectionQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams seriesType(final String value) {
      put("seriesType", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams contains(final List<String> value) {
      put("contains", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterSeriesCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of stories filtered by a character id.
   * Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.
   * @param characterId The character ID. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&creators={creators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  StoryDataWrapper getCharacterStoryCollection(@Param("characterId") Integer characterId, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("creators") List<Integer> creators, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of stories filtered by a character id.
   * Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCharacterStoryCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCharacterStoryCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param characterId The character ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>modifiedSince - Return only stories which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&creators={creators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  StoryDataWrapper getCharacterStoryCollection(@Param("characterId") Integer characterId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCharacterStoryCollection</code> method in a fluent style.
   */
  public static class GetCharacterStoryCollectionQueryParams extends HashMap<String, Object> {
    public GetCharacterStoryCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterStoryCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterStoryCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterStoryCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterStoryCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterStoryCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCharacterStoryCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCharacterStoryCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of characters filtered by a comic id.
   * Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.
   * @param comicId The comic id. (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&series={series}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CharacterDataWrapper getComicCharacterCollection(@Param("comicId") Integer comicId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of characters filtered by a comic id.
   * Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicCharacterCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicCharacterCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param comicId The comic id. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Return only characters matching the specified full character name (e.g. Spider-Man). (optional)</li>
   *   <li>nameStartsWith - Return characters with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only characters which have been modified since the specified date. (optional)</li>
   *   <li>series - Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&series={series}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CharacterDataWrapper getComicCharacterCollection(@Param("comicId") Integer comicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicCharacterCollection</code> method in a fluent style.
   */
  public static class GetComicCharacterCollectionQueryParams extends HashMap<String, Object> {
    public GetComicCharacterCollectionQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetComicCharacterCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetComicCharacterCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicCharacterCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicCharacterCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicCharacterCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicCharacterCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicCharacterCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicCharacterCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches a single comic by id.
   * This method fetches a single comic resource.  It is the canonical URI for any comic resource provided by the API.
   * @param comicId A single comic. (required)
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}")
  @Headers({
    "Accept: */*",
  })
  ComicDataWrapper getComicIndividual(@Param("comicId") Integer comicId);

  /**
   * Fetches lists of stories filtered by a comic id.
   * Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.
   * @param comicId The comic ID. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources. (optional)
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/stories?modifiedSince={modifiedSince}&series={series}&events={events}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  StoryDataWrapper getComicStoryCollection(@Param("comicId") Integer comicId, @Param("modifiedSince") LocalDate modifiedSince, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of stories filtered by a comic id.
   * Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicStoryCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicStoryCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param comicId The comic ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>modifiedSince - Return only stories which have been modified since the specified date. (optional)</li>
   *   <li>series - Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources. (optional)</li>
   *   </ul>
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/stories?modifiedSince={modifiedSince}&series={series}&events={events}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  StoryDataWrapper getComicStoryCollection(@Param("comicId") Integer comicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicStoryCollection</code> method in a fluent style.
   */
  public static class GetComicStoryCollectionQueryParams extends HashMap<String, Object> {
    public GetComicStoryCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicStoryCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicStoryCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicStoryCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicStoryCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicStoryCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicStoryCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicStoryCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of comics filtered by a character id.
   * Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.
   * @param characterId The character id. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  ComicDataWrapper getComicsCharacterCollection(@Param("characterId") Integer characterId, @Param("format") String format, @Param("formatType") String formatType, @Param("noVariants") Boolean noVariants, @Param("dateDescriptor") String dateDescriptor, @Param("dateRange") List<Integer> dateRange, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("issueNumber") Integer issueNumber, @Param("diamondCode") String diamondCode, @Param("digitalId") Integer digitalId, @Param("upc") String upc, @Param("isbn") String isbn, @Param("ean") String ean, @Param("issn") String issn, @Param("hasDigitalIssue") Boolean hasDigitalIssue, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("sharedAppearances") List<Integer> sharedAppearances, @Param("collaborators") List<Integer> collaborators, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of comics filtered by a character id.
   * Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicsCharacterCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicsCharacterCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param characterId The character id. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)</li>
   *   <li>formatType - Filter by the issue format type (comic or collection). (optional)</li>
   *   <li>noVariants - Exclude variant comics from the result set. (optional)</li>
   *   <li>dateDescriptor - Return comics within a predefined date range. (optional)</li>
   *   <li>dateRange - Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)</li>
   *   <li>title - Return only issues in series whose title matches the input. (optional)</li>
   *   <li>titleStartsWith - Return only issues in series whose title starts with the input. (optional)</li>
   *   <li>startYear - Return only issues in series whose start year matches the input. (optional)</li>
   *   <li>issueNumber - Return only issues in series whose issue number matches the input. (optional)</li>
   *   <li>diamondCode - Filter by diamond code. (optional)</li>
   *   <li>digitalId - Filter by digital comic id. (optional)</li>
   *   <li>upc - Filter by UPC. (optional)</li>
   *   <li>isbn - Filter by ISBN. (optional)</li>
   *   <li>ean - Filter by EAN. (optional)</li>
   *   <li>issn - Filter by ISSN. (optional)</li>
   *   <li>hasDigitalIssue - Include only results which are available digitally. (optional)</li>
   *   <li>modifiedSince - Return only comics which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>sharedAppearances - Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)</li>
   *   <li>collaborators - Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/characters/{characterId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  ComicDataWrapper getComicsCharacterCollection(@Param("characterId") Integer characterId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicsCharacterCollection</code> method in a fluent style.
   */
  public static class GetComicsCharacterCollectionQueryParams extends HashMap<String, Object> {
    public GetComicsCharacterCollectionQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams formatType(final String value) {
      put("formatType", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams noVariants(final Boolean value) {
      put("noVariants", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams dateDescriptor(final String value) {
      put("dateDescriptor", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams dateRange(final List<Integer> value) {
      put("dateRange", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams issueNumber(final Integer value) {
      put("issueNumber", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams diamondCode(final String value) {
      put("diamondCode", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams digitalId(final Integer value) {
      put("digitalId", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams upc(final String value) {
      put("upc", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams isbn(final String value) {
      put("isbn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams ean(final String value) {
      put("ean", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams issn(final String value) {
      put("issn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams hasDigitalIssue(final Boolean value) {
      put("hasDigitalIssue", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams sharedAppearances(final List<Integer> value) {
      put("sharedAppearances", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams collaborators(final List<Integer> value) {
      put("collaborators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCharacterCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of comics.
   * Fetches lists of comics with optional filters. See notes on individual parameters below.
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variants (alternate covers, secondary printings, director&#39;s cuts, etc.) from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids. (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  ComicDataWrapper getComicsCollection(@Param("format") String format, @Param("formatType") String formatType, @Param("noVariants") Boolean noVariants, @Param("dateDescriptor") String dateDescriptor, @Param("dateRange") List<Integer> dateRange, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("issueNumber") Integer issueNumber, @Param("diamondCode") String diamondCode, @Param("digitalId") Integer digitalId, @Param("upc") String upc, @Param("isbn") String isbn, @Param("ean") String ean, @Param("issn") String issn, @Param("hasDigitalIssue") Boolean hasDigitalIssue, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("sharedAppearances") List<Integer> sharedAppearances, @Param("collaborators") List<Integer> collaborators, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of comics.
   * Fetches lists of comics with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicsCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicsCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)</li>
   *   <li>formatType - Filter by the issue format type (comic or collection). (optional)</li>
   *   <li>noVariants - Exclude variants (alternate covers, secondary printings, director&#39;s cuts, etc.) from the result set. (optional)</li>
   *   <li>dateDescriptor - Return comics within a predefined date range. (optional)</li>
   *   <li>dateRange - Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)</li>
   *   <li>title - Return only issues in series whose title matches the input. (optional)</li>
   *   <li>titleStartsWith - Return only issues in series whose title starts with the input. (optional)</li>
   *   <li>startYear - Return only issues in series whose start year matches the input. (optional)</li>
   *   <li>issueNumber - Return only issues in series whose issue number matches the input. (optional)</li>
   *   <li>diamondCode - Filter by diamond code. (optional)</li>
   *   <li>digitalId - Filter by digital comic id. (optional)</li>
   *   <li>upc - Filter by UPC. (optional)</li>
   *   <li>isbn - Filter by ISBN. (optional)</li>
   *   <li>ean - Filter by EAN. (optional)</li>
   *   <li>issn - Filter by ISSN. (optional)</li>
   *   <li>hasDigitalIssue - Include only results which are available digitally. (optional)</li>
   *   <li>modifiedSince - Return only comics which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>sharedAppearances - Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids. (optional)</li>
   *   <li>collaborators - Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids. (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  ComicDataWrapper getComicsCollection(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicsCollection</code> method in a fluent style.
   */
  public static class GetComicsCollectionQueryParams extends HashMap<String, Object> {
    public GetComicsCollectionQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams formatType(final String value) {
      put("formatType", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams noVariants(final Boolean value) {
      put("noVariants", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams dateDescriptor(final String value) {
      put("dateDescriptor", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams dateRange(final List<Integer> value) {
      put("dateRange", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams issueNumber(final Integer value) {
      put("issueNumber", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams diamondCode(final String value) {
      put("diamondCode", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams digitalId(final Integer value) {
      put("digitalId", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams upc(final String value) {
      put("upc", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams isbn(final String value) {
      put("isbn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams ean(final String value) {
      put("ean", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams issn(final String value) {
      put("issn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams hasDigitalIssue(final Boolean value) {
      put("hasDigitalIssue", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams sharedAppearances(final List<Integer> value) {
      put("sharedAppearances", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams collaborators(final List<Integer> value) {
      put("collaborators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of comics filtered by a creator id.
   * Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.
   * @param creatorId The creator ID. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&characters={characters}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionByCreatorId(@Param("creatorId") Integer creatorId, @Param("format") String format, @Param("formatType") String formatType, @Param("noVariants") Boolean noVariants, @Param("dateDescriptor") String dateDescriptor, @Param("dateRange") List<Integer> dateRange, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("issueNumber") Integer issueNumber, @Param("diamondCode") String diamondCode, @Param("digitalId") Integer digitalId, @Param("upc") String upc, @Param("isbn") String isbn, @Param("ean") String ean, @Param("issn") String issn, @Param("hasDigitalIssue") List<Boolean> hasDigitalIssue, @Param("modifiedSince") LocalDate modifiedSince, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("sharedAppearances") List<Integer> sharedAppearances, @Param("collaborators") List<Integer> collaborators, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of comics filtered by a creator id.
   * Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicsCollectionByCreatorId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicsCollectionByCreatorIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param creatorId The creator ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)</li>
   *   <li>formatType - Filter by the issue format type (comic or collection). (optional)</li>
   *   <li>noVariants - Exclude variant comics from the result set. (optional)</li>
   *   <li>dateDescriptor - Return comics within a predefined date range. (optional)</li>
   *   <li>dateRange - Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)</li>
   *   <li>title - Return only issues in series whose title matches the input. (optional)</li>
   *   <li>titleStartsWith - Return only issues in series whose title starts with the input. (optional)</li>
   *   <li>startYear - Return only issues in series whose start year matches the input. (optional)</li>
   *   <li>issueNumber - Return only issues in series whose issue number matches the input. (optional)</li>
   *   <li>diamondCode - Filter by diamond code. (optional)</li>
   *   <li>digitalId - Filter by digital comic id. (optional)</li>
   *   <li>upc - Filter by UPC. (optional)</li>
   *   <li>isbn - Filter by ISBN. (optional)</li>
   *   <li>ean - Filter by EAN. (optional)</li>
   *   <li>issn - Filter by ISSN. (optional)</li>
   *   <li>hasDigitalIssue - Include only results which are available digitally. (optional)</li>
   *   <li>modifiedSince - Return only comics which have been modified since the specified date. (optional)</li>
   *   <li>characters - Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>sharedAppearances - Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)</li>
   *   <li>collaborators - Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&characters={characters}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionByCreatorId(@Param("creatorId") Integer creatorId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicsCollectionByCreatorId</code> method in a fluent style.
   */
  public static class GetComicsCollectionByCreatorIdQueryParams extends HashMap<String, Object> {
    public GetComicsCollectionByCreatorIdQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams formatType(final String value) {
      put("formatType", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams noVariants(final Boolean value) {
      put("noVariants", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams dateDescriptor(final String value) {
      put("dateDescriptor", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams dateRange(final List<Integer> value) {
      put("dateRange", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams issueNumber(final Integer value) {
      put("issueNumber", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams diamondCode(final String value) {
      put("diamondCode", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams digitalId(final Integer value) {
      put("digitalId", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams upc(final String value) {
      put("upc", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams isbn(final String value) {
      put("isbn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams ean(final String value) {
      put("ean", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams issn(final String value) {
      put("issn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams hasDigitalIssue(final List<Boolean> value) {
      put("hasDigitalIssue", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams sharedAppearances(final List<Integer> value) {
      put("sharedAppearances", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams collaborators(final List<Integer> value) {
      put("collaborators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByCreatorIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of comics filtered by an event id.
   * Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The event id. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionByEventId(@Param("eventId") Integer eventId, @Param("format") String format, @Param("formatType") String formatType, @Param("noVariants") List<Boolean> noVariants, @Param("dateDescriptor") List<String> dateDescriptor, @Param("dateRange") List<Integer> dateRange, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("issueNumber") Integer issueNumber, @Param("diamondCode") String diamondCode, @Param("digitalId") Integer digitalId, @Param("upc") String upc, @Param("isbn") String isbn, @Param("ean") String ean, @Param("issn") String issn, @Param("hasDigitalIssue") List<Boolean> hasDigitalIssue, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("sharedAppearances") List<Integer> sharedAppearances, @Param("collaborators") List<Integer> collaborators, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of comics filtered by an event id.
   * Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicsCollectionByEventId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicsCollectionByEventIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param eventId The event id. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)</li>
   *   <li>formatType - Filter by the issue format type (comic or collection). (optional)</li>
   *   <li>noVariants - Exclude variant comics from the result set. (optional)</li>
   *   <li>dateDescriptor - Return comics within a predefined date range. (optional)</li>
   *   <li>dateRange - Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)</li>
   *   <li>title - Return only issues in series whose title matches the input. (optional)</li>
   *   <li>titleStartsWith - Return only issues in series whose title starts with the input. (optional)</li>
   *   <li>startYear - Return only issues in series whose start year matches the input. (optional)</li>
   *   <li>issueNumber - Return only issues in series whose issue number matches the input. (optional)</li>
   *   <li>diamondCode - Filter by diamond code. (optional)</li>
   *   <li>digitalId - Filter by digital comic id. (optional)</li>
   *   <li>upc - Filter by UPC. (optional)</li>
   *   <li>isbn - Filter by ISBN. (optional)</li>
   *   <li>ean - Filter by EAN. (optional)</li>
   *   <li>issn - Filter by ISSN. (optional)</li>
   *   <li>hasDigitalIssue - Include only results which are available digitally. (optional)</li>
   *   <li>modifiedSince - Return only comics which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>sharedAppearances - Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)</li>
   *   <li>collaborators - Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionByEventId(@Param("eventId") Integer eventId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicsCollectionByEventId</code> method in a fluent style.
   */
  public static class GetComicsCollectionByEventIdQueryParams extends HashMap<String, Object> {
    public GetComicsCollectionByEventIdQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams formatType(final String value) {
      put("formatType", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams noVariants(final List<Boolean> value) {
      put("noVariants", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams dateDescriptor(final List<String> value) {
      put("dateDescriptor", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams dateRange(final List<Integer> value) {
      put("dateRange", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams issueNumber(final Integer value) {
      put("issueNumber", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams diamondCode(final String value) {
      put("diamondCode", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams digitalId(final Integer value) {
      put("digitalId", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams upc(final String value) {
      put("upc", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams isbn(final String value) {
      put("isbn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams ean(final String value) {
      put("ean", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams issn(final String value) {
      put("issn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams hasDigitalIssue(final List<Boolean> value) {
      put("hasDigitalIssue", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams sharedAppearances(final List<Integer> value) {
      put("sharedAppearances", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams collaborators(final List<Integer> value) {
      put("collaborators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByEventIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of comics filtered by a series id.
   * Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionBySeriesId(@Param("seriesId") Integer seriesId, @Param("format") String format, @Param("formatType") String formatType, @Param("noVariants") List<Boolean> noVariants, @Param("dateDescriptor") List<String> dateDescriptor, @Param("dateRange") List<Integer> dateRange, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("issueNumber") Integer issueNumber, @Param("diamondCode") String diamondCode, @Param("digitalId") Integer digitalId, @Param("upc") String upc, @Param("isbn") String isbn, @Param("ean") String ean, @Param("issn") String issn, @Param("hasDigitalIssue") List<Boolean> hasDigitalIssue, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("sharedAppearances") List<Integer> sharedAppearances, @Param("collaborators") List<Integer> collaborators, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of comics filtered by a series id.
   * Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicsCollectionBySeriesId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicsCollectionBySeriesIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param seriesId The series ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)</li>
   *   <li>formatType - Filter by the issue format type (comic or collection). (optional)</li>
   *   <li>noVariants - Exclude variant comics from the result set. (optional)</li>
   *   <li>dateDescriptor - Return comics within a predefined date range. (optional)</li>
   *   <li>dateRange - Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)</li>
   *   <li>title - Return only issues in series whose title matches the input. (optional)</li>
   *   <li>titleStartsWith - Return only issues in series whose title starts with the input. (optional)</li>
   *   <li>startYear - Return only issues in series whose start year matches the input. (optional)</li>
   *   <li>issueNumber - Return only issues in series whose issue number matches the input. (optional)</li>
   *   <li>diamondCode - Filter by diamond code. (optional)</li>
   *   <li>digitalId - Filter by digital comic id. (optional)</li>
   *   <li>upc - Filter by UPC. (optional)</li>
   *   <li>isbn - Filter by ISBN. (optional)</li>
   *   <li>ean - Filter by EAN. (optional)</li>
   *   <li>issn - Filter by ISSN. (optional)</li>
   *   <li>hasDigitalIssue - Include only results which are available digitally. (optional)</li>
   *   <li>modifiedSince - Return only comics which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>sharedAppearances - Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)</li>
   *   <li>collaborators - Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&events={events}&stories={stories}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionBySeriesId(@Param("seriesId") Integer seriesId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicsCollectionBySeriesId</code> method in a fluent style.
   */
  public static class GetComicsCollectionBySeriesIdQueryParams extends HashMap<String, Object> {
    public GetComicsCollectionBySeriesIdQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams formatType(final String value) {
      put("formatType", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams noVariants(final List<Boolean> value) {
      put("noVariants", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams dateDescriptor(final List<String> value) {
      put("dateDescriptor", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams dateRange(final List<Integer> value) {
      put("dateRange", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams issueNumber(final Integer value) {
      put("issueNumber", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams diamondCode(final String value) {
      put("diamondCode", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams digitalId(final Integer value) {
      put("digitalId", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams upc(final String value) {
      put("upc", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams isbn(final String value) {
      put("isbn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams ean(final String value) {
      put("ean", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams issn(final String value) {
      put("issn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams hasDigitalIssue(final List<Boolean> value) {
      put("hasDigitalIssue", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams sharedAppearances(final List<Integer> value) {
      put("sharedAppearances", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams collaborators(final List<Integer> value) {
      put("collaborators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionBySeriesIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of comics filtered by a story id.
   * Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&events={events}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionByStoryId(@Param("storyId") Integer storyId, @Param("format") String format, @Param("formatType") String formatType, @Param("noVariants") List<Boolean> noVariants, @Param("dateDescriptor") List<String> dateDescriptor, @Param("dateRange") List<Integer> dateRange, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("issueNumber") Integer issueNumber, @Param("diamondCode") String diamondCode, @Param("digitalId") Integer digitalId, @Param("upc") String upc, @Param("isbn") String isbn, @Param("ean") String ean, @Param("issn") String issn, @Param("hasDigitalIssue") List<Boolean> hasDigitalIssue, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("sharedAppearances") List<Integer> sharedAppearances, @Param("collaborators") List<Integer> collaborators, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of comics filtered by a story id.
   * Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getComicsCollectionByStoryId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetComicsCollectionByStoryIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param storyId The story ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)</li>
   *   <li>formatType - Filter by the issue format type (comic or collection). (optional)</li>
   *   <li>noVariants - Exclude variant comics from the result set. (optional)</li>
   *   <li>dateDescriptor - Return comics within a predefined date range. (optional)</li>
   *   <li>dateRange - Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)</li>
   *   <li>title - Return only issues in series whose title matches the input. (optional)</li>
   *   <li>titleStartsWith - Return only issues in series whose title starts with the input. (optional)</li>
   *   <li>startYear - Return only issues in series whose start year matches the input. (optional)</li>
   *   <li>issueNumber - Return only issues in series whose issue number matches the input. (optional)</li>
   *   <li>diamondCode - Filter by diamond code. (optional)</li>
   *   <li>digitalId - Filter by digital comic id. (optional)</li>
   *   <li>upc - Filter by UPC. (optional)</li>
   *   <li>isbn - Filter by ISBN. (optional)</li>
   *   <li>ean - Filter by EAN. (optional)</li>
   *   <li>issn - Filter by ISSN. (optional)</li>
   *   <li>hasDigitalIssue - Include only results which are available digitally. (optional)</li>
   *   <li>modifiedSince - Return only comics which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>sharedAppearances - Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)</li>
   *   <li>collaborators - Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return ComicDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/comics?format={format}&formatType={formatType}&noVariants={noVariants}&dateDescriptor={dateDescriptor}&dateRange={dateRange}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&issueNumber={issueNumber}&diamondCode={diamondCode}&digitalId={digitalId}&upc={upc}&isbn={isbn}&ean={ean}&issn={issn}&hasDigitalIssue={hasDigitalIssue}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&events={events}&sharedAppearances={sharedAppearances}&collaborators={collaborators}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  ComicDataWrapper getComicsCollectionByStoryId(@Param("storyId") Integer storyId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getComicsCollectionByStoryId</code> method in a fluent style.
   */
  public static class GetComicsCollectionByStoryIdQueryParams extends HashMap<String, Object> {
    public GetComicsCollectionByStoryIdQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams formatType(final String value) {
      put("formatType", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams noVariants(final List<Boolean> value) {
      put("noVariants", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams dateDescriptor(final List<String> value) {
      put("dateDescriptor", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams dateRange(final List<Integer> value) {
      put("dateRange", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams issueNumber(final Integer value) {
      put("issueNumber", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams diamondCode(final String value) {
      put("diamondCode", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams digitalId(final Integer value) {
      put("digitalId", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams upc(final String value) {
      put("upc", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams isbn(final String value) {
      put("isbn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams ean(final String value) {
      put("ean", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams issn(final String value) {
      put("issn", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams hasDigitalIssue(final List<Boolean> value) {
      put("hasDigitalIssue", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams sharedAppearances(final List<Integer> value) {
      put("sharedAppearances", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams collaborators(final List<Integer> value) {
      put("collaborators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetComicsCollectionByStoryIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of characters.
   * Fetches lists of comic characters with optional filters. See notes on individual parameters below.
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CharacterDataWrapper getCreatorCollection(@Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of characters.
   * Fetches lists of comic characters with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Return only characters matching the specified full character name (e.g. Spider-Man). (optional)</li>
   *   <li>nameStartsWith - Return characters with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only characters which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only characters which appear in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CharacterDataWrapper getCreatorCollection(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorCollection</code> method in a fluent style.
   */
  public static class GetCreatorCollectionQueryParams extends HashMap<String, Object> {
    public GetCreatorCollectionQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of creators filtered by a comic id.
   * Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.
   * @param comicId The comic id. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionByComicId(@Param("comicId") Integer comicId, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("suffix") String suffix, @Param("nameStartsWith") String nameStartsWith, @Param("firstNameStartsWith") String firstNameStartsWith, @Param("middleNameStartsWith") String middleNameStartsWith, @Param("lastNameStartsWith") String lastNameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of creators filtered by a comic id.
   * Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorCollectionByComicId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorCollectionByComicIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param comicId The comic id. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstName - Filter by creator first name (e.g. brian). (optional)</li>
   *   <li>middleName - Filter by creator middle name (e.g. Michael). (optional)</li>
   *   <li>lastName - Filter by creator last name (e.g. Bendis). (optional)</li>
   *   <li>suffix - Filter by suffix or honorific (e.g. Jr., Sr.). (optional)</li>
   *   <li>nameStartsWith - Filter by creator names that match critera (e.g. B, St L). (optional)</li>
   *   <li>firstNameStartsWith - Filter by creator first names that match critera (e.g. B, St L). (optional)</li>
   *   <li>middleNameStartsWith - Filter by creator middle names that match critera (e.g. Mi). (optional)</li>
   *   <li>lastNameStartsWith - Filter by creator last names that match critera (e.g. Ben). (optional)</li>
   *   <li>modifiedSince - Return only creators which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionByComicId(@Param("comicId") Integer comicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorCollectionByComicId</code> method in a fluent style.
   */
  public static class GetCreatorCollectionByComicIdQueryParams extends HashMap<String, Object> {
    public GetCreatorCollectionByComicIdQueryParams firstName(final String value) {
      put("firstName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams middleName(final String value) {
      put("middleName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams lastName(final String value) {
      put("lastName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams suffix(final String value) {
      put("suffix", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams firstNameStartsWith(final String value) {
      put("firstNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams middleNameStartsWith(final String value) {
      put("middleNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams lastNameStartsWith(final String value) {
      put("lastNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByComicIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of creators filtered by an event id.
   * Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The event ID. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionByEventId(@Param("eventId") Integer eventId, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("suffix") String suffix, @Param("nameStartsWith") String nameStartsWith, @Param("firstNameStartsWith") String firstNameStartsWith, @Param("middleNameStartsWith") String middleNameStartsWith, @Param("lastNameStartsWith") String lastNameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of creators filtered by an event id.
   * Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorCollectionByEventId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorCollectionByEventIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param eventId The event ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstName - Filter by creator first name (e.g. brian). (optional)</li>
   *   <li>middleName - Filter by creator middle name (e.g. Michael). (optional)</li>
   *   <li>lastName - Filter by creator last name (e.g. Bendis). (optional)</li>
   *   <li>suffix - Filter by suffix or honorific (e.g. Jr., Sr.). (optional)</li>
   *   <li>nameStartsWith - Filter by creator names that match critera (e.g. B, St L). (optional)</li>
   *   <li>firstNameStartsWith - Filter by creator first names that match critera (e.g. B, St L). (optional)</li>
   *   <li>middleNameStartsWith - Filter by creator middle names that match critera (e.g. Mi). (optional)</li>
   *   <li>lastNameStartsWith - Filter by creator last names that match critera (e.g. Ben). (optional)</li>
   *   <li>modifiedSince - Return only creators which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionByEventId(@Param("eventId") Integer eventId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorCollectionByEventId</code> method in a fluent style.
   */
  public static class GetCreatorCollectionByEventIdQueryParams extends HashMap<String, Object> {
    public GetCreatorCollectionByEventIdQueryParams firstName(final String value) {
      put("firstName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams middleName(final String value) {
      put("middleName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams lastName(final String value) {
      put("lastName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams suffix(final String value) {
      put("suffix", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams firstNameStartsWith(final String value) {
      put("firstNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams middleNameStartsWith(final String value) {
      put("middleNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams lastNameStartsWith(final String value) {
      put("lastNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByEventIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of creators filtered by a series id.
   * Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionBySeriesId(@Param("seriesId") Integer seriesId, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("suffix") String suffix, @Param("nameStartsWith") String nameStartsWith, @Param("firstNameStartsWith") String firstNameStartsWith, @Param("middleNameStartsWith") String middleNameStartsWith, @Param("lastNameStartsWith") String lastNameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of creators filtered by a series id.
   * Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorCollectionBySeriesId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorCollectionBySeriesIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param seriesId The series ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstName - Filter by creator first name (e.g. brian). (optional)</li>
   *   <li>middleName - Filter by creator middle name (e.g. Michael). (optional)</li>
   *   <li>lastName - Filter by creator last name (e.g. Bendis). (optional)</li>
   *   <li>suffix - Filter by suffix or honorific (e.g. Jr., Sr.). (optional)</li>
   *   <li>nameStartsWith - Filter by creator names that match critera (e.g. B, St L). (optional)</li>
   *   <li>firstNameStartsWith - Filter by creator first names that match critera (e.g. B, St L). (optional)</li>
   *   <li>middleNameStartsWith - Filter by creator middle names that match critera (e.g. Mi). (optional)</li>
   *   <li>lastNameStartsWith - Filter by creator last names that match critera (e.g. Ben). (optional)</li>
   *   <li>modifiedSince - Return only creators which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionBySeriesId(@Param("seriesId") Integer seriesId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorCollectionBySeriesId</code> method in a fluent style.
   */
  public static class GetCreatorCollectionBySeriesIdQueryParams extends HashMap<String, Object> {
    public GetCreatorCollectionBySeriesIdQueryParams firstName(final String value) {
      put("firstName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams middleName(final String value) {
      put("middleName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams lastName(final String value) {
      put("lastName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams suffix(final String value) {
      put("suffix", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams firstNameStartsWith(final String value) {
      put("firstNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams middleNameStartsWith(final String value) {
      put("middleNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams lastNameStartsWith(final String value) {
      put("lastNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionBySeriesIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of creators filtered by a story id.
   * Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionByStory(@Param("storyId") Integer storyId, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("suffix") String suffix, @Param("nameStartsWith") String nameStartsWith, @Param("firstNameStartsWith") String firstNameStartsWith, @Param("middleNameStartsWith") String middleNameStartsWith, @Param("lastNameStartsWith") String lastNameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of creators filtered by a story id.
   * Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorCollectionByStory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorCollectionByStoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param storyId The story ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstName - Filter by creator first name (e.g. brian). (optional)</li>
   *   <li>middleName - Filter by creator middle name (e.g. Michael). (optional)</li>
   *   <li>lastName - Filter by creator last name (e.g. Bendis). (optional)</li>
   *   <li>suffix - Filter by suffix or honorific (e.g. Jr., Sr.). (optional)</li>
   *   <li>nameStartsWith - Filter by creator names that match critera (e.g. B, St L). (optional)</li>
   *   <li>firstNameStartsWith - Filter by creator first names that match critera (e.g. B, St L). (optional)</li>
   *   <li>middleNameStartsWith - Filter by creator middle names that match critera (e.g. Mi). (optional)</li>
   *   <li>lastNameStartsWith - Filter by creator last names that match critera (e.g. Ben). (optional)</li>
   *   <li>modifiedSince - Return only creators which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/creators?firstName={firstName}&middleName={middleName}&lastName={lastName}&suffix={suffix}&nameStartsWith={nameStartsWith}&firstNameStartsWith={firstNameStartsWith}&middleNameStartsWith={middleNameStartsWith}&lastNameStartsWith={lastNameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CreatorDataWrapper getCreatorCollectionByStory(@Param("storyId") Integer storyId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorCollectionByStory</code> method in a fluent style.
   */
  public static class GetCreatorCollectionByStoryQueryParams extends HashMap<String, Object> {
    public GetCreatorCollectionByStoryQueryParams firstName(final String value) {
      put("firstName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams middleName(final String value) {
      put("middleName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams lastName(final String value) {
      put("lastName", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams suffix(final String value) {
      put("suffix", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams firstNameStartsWith(final String value) {
      put("firstNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams middleNameStartsWith(final String value) {
      put("middleNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams lastNameStartsWith(final String value) {
      put("lastNameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of characters filtered by a story id.
   * Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CharacterDataWrapper getCreatorCollectionByStoryId(@Param("storyId") Integer storyId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of characters filtered by a story id.
   * Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorCollectionByStoryId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorCollectionByStoryIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param storyId The story ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Return only characters matching the specified full character name (e.g. Spider-Man). (optional)</li>
   *   <li>nameStartsWith - Return characters with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only characters which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CharacterDataWrapper getCreatorCollectionByStoryId(@Param("storyId") Integer storyId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorCollectionByStoryId</code> method in a fluent style.
   */
  public static class GetCreatorCollectionByStoryIdQueryParams extends HashMap<String, Object> {
    public GetCreatorCollectionByStoryIdQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorCollectionByStoryIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of events filtered by a creator id.
   * Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.
   * @param creatorId The creator ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&characters={characters}&series={series}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  EventDataWrapper getCreatorEventsCollection(@Param("creatorId") Integer creatorId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of events filtered by a creator id.
   * Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorEventsCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorEventsCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param creatorId The creator ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Filter the event list by name. (optional)</li>
   *   <li>nameStartsWith - Return events with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only events which have been modified since the specified date. (optional)</li>
   *   <li>characters - Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>comics - Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&characters={characters}&series={series}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  EventDataWrapper getCreatorEventsCollection(@Param("creatorId") Integer creatorId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorEventsCollection</code> method in a fluent style.
   */
  public static class GetCreatorEventsCollectionQueryParams extends HashMap<String, Object> {
    public GetCreatorEventsCollectionQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorEventsCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches a single creator by id.
   * This method fetches a single creator resource.  It is the canonical URI for any creator resource provided by the API.
   * @param creatorId A single creator id. (required)
   * @return CreatorDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}")
  @Headers({
    "Accept: */*",
  })
  CreatorDataWrapper getCreatorIndividual(@Param("creatorId") Integer creatorId);

  /**
   * Fetches lists of series filtered by a creator id.
   * Fetches lists of comic series in which a specific creator&#39;s work appears, with optional filters. See notes on individual parameters below.
   * @param creatorId The creator ID. (required)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&events={events}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  SeriesDataWrapper getCreatorSeriesCollection(@Param("creatorId") Integer creatorId, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("events") List<Integer> events, @Param("characters") List<Integer> characters, @Param("seriesType") String seriesType, @Param("contains") List<String> contains, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of series filtered by a creator id.
   * Fetches lists of comic series in which a specific creator&#39;s work appears, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorSeriesCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorSeriesCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param creatorId The creator ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>title - Filter by series title. (optional)</li>
   *   <li>titleStartsWith - Return series with titles that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>startYear - Return only series matching the specified start year. (optional)</li>
   *   <li>modifiedSince - Return only series which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>seriesType - Filter the series by publication frequency type. (optional)</li>
   *   <li>contains - Return only series containing one or more comics with the specified format. (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&events={events}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  SeriesDataWrapper getCreatorSeriesCollection(@Param("creatorId") Integer creatorId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorSeriesCollection</code> method in a fluent style.
   */
  public static class GetCreatorSeriesCollectionQueryParams extends HashMap<String, Object> {
    public GetCreatorSeriesCollectionQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams seriesType(final String value) {
      put("seriesType", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams contains(final List<String> value) {
      put("contains", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorSeriesCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of stories filtered by a creator id.
   * Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.
   * @param creatorId The ID of the creator. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  StoryDataWrapper getCreatorStoryCollection(@Param("creatorId") Integer creatorId, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("characters") List<Integer> characters, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of stories filtered by a creator id.
   * Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getCreatorStoryCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCreatorStoryCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param creatorId The ID of the creator. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>modifiedSince - Return only stories which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only stories contained in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/creators/{creatorId}/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  StoryDataWrapper getCreatorStoryCollection(@Param("creatorId") Integer creatorId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCreatorStoryCollection</code> method in a fluent style.
   */
  public static class GetCreatorStoryCollectionQueryParams extends HashMap<String, Object> {
    public GetCreatorStoryCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorStoryCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorStoryCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorStoryCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorStoryCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorStoryCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetCreatorStoryCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetCreatorStoryCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of characters filtered by an event id.
   * Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The event ID (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CharacterDataWrapper getEventCharacterCollection(@Param("eventId") Integer eventId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of characters filtered by an event id.
   * Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getEventCharacterCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventCharacterCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param eventId The event ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Return only characters matching the specified full character name (e.g. Spider-Man). (optional)</li>
   *   <li>nameStartsWith - Return characters with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only characters which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CharacterDataWrapper getEventCharacterCollection(@Param("eventId") Integer eventId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventCharacterCollection</code> method in a fluent style.
   */
  public static class GetEventCharacterCollectionQueryParams extends HashMap<String, Object> {
    public GetEventCharacterCollectionQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetEventCharacterCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetEventCharacterCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetEventCharacterCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventCharacterCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventCharacterCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventCharacterCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventCharacterCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetEventCharacterCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches a single event by id.
   * This method fetches a single event resource.  It is the canonical URI for any event resource provided by the API.
   * @param eventId A single event. (required)
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}")
  @Headers({
    "Accept: */*",
  })
  EventDataWrapper getEventIndividual(@Param("eventId") Integer eventId);

  /**
   * Fetches lists of series filtered by an event id.
   * Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.
   * @param eventId The event ID. (required)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&creators={creators}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  SeriesDataWrapper getEventSeriesCollection(@Param("eventId") Integer eventId, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("seriesType") String seriesType, @Param("contains") List<String> contains, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of series filtered by an event id.
   * Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getEventSeriesCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventSeriesCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param eventId The event ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>title - Filter by series title. (optional)</li>
   *   <li>titleStartsWith - Return series with titles that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>startYear - Return only series matching the specified start year. (optional)</li>
   *   <li>modifiedSince - Return only series which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>seriesType - Filter the series by publication frequency type. (optional)</li>
   *   <li>contains - Return only series containing one or more comics with the specified format. (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&creators={creators}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  SeriesDataWrapper getEventSeriesCollection(@Param("eventId") Integer eventId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventSeriesCollection</code> method in a fluent style.
   */
  public static class GetEventSeriesCollectionQueryParams extends HashMap<String, Object> {
    public GetEventSeriesCollectionQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetEventSeriesCollectionQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetEventSeriesCollectionQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetEventSeriesCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetEventSeriesCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventSeriesCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventSeriesCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventSeriesCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventSeriesCollectionQueryParams seriesType(final String value) {
      put("seriesType", EncodingUtils.encode(value));
      return this;
    }
    public GetEventSeriesCollectionQueryParams contains(final List<String> value) {
      put("contains", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventSeriesCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventSeriesCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetEventSeriesCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of stories filtered by an event id.
   * Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The ID of the event. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  StoryDataWrapper getEventStoryCollection(@Param("eventId") Integer eventId, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of stories filtered by an event id.
   * Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getEventStoryCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventStoryCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param eventId The ID of the event. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>modifiedSince - Return only stories which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/events/{eventId}/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  StoryDataWrapper getEventStoryCollection(@Param("eventId") Integer eventId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventStoryCollection</code> method in a fluent style.
   */
  public static class GetEventStoryCollectionQueryParams extends HashMap<String, Object> {
    public GetEventStoryCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetEventStoryCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventStoryCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventStoryCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventStoryCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventStoryCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventStoryCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetEventStoryCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of events.
   * Fetches lists of events with optional filters. See notes on individual parameters below.
   * @param name Return only events which match the specified name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which take place in the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  EventDataWrapper getEventsCollection(@Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of events.
   * Fetches lists of events with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getEventsCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventsCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Return only events which match the specified name. (optional)</li>
   *   <li>nameStartsWith - Return events with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only events which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>comics - Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only events which take place in the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  EventDataWrapper getEventsCollection(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventsCollection</code> method in a fluent style.
   */
  public static class GetEventsCollectionQueryParams extends HashMap<String, Object> {
    public GetEventsCollectionQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of events filtered by a series id.
   * Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  EventDataWrapper getEventsCollectionBySeriesId(@Param("seriesId") Integer seriesId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of events filtered by a series id.
   * Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getEventsCollectionBySeriesId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventsCollectionBySeriesIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param seriesId The series ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Filter the event list by name. (optional)</li>
   *   <li>nameStartsWith - Return events with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only events which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>comics - Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&comics={comics}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  EventDataWrapper getEventsCollectionBySeriesId(@Param("seriesId") Integer seriesId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventsCollectionBySeriesId</code> method in a fluent style.
   */
  public static class GetEventsCollectionBySeriesIdQueryParams extends HashMap<String, Object> {
    public GetEventsCollectionBySeriesIdQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionBySeriesIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of events filtered by a story id.
   * Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&comics={comics}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  EventDataWrapper getEventsCollectionByStoryId(@Param("storyId") Integer storyId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("comics") List<Integer> comics, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of events filtered by a story id.
   * Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getEventsCollectionByStoryId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventsCollectionByStoryIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param storyId The story ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Filter the event list by name. (optional)</li>
   *   <li>nameStartsWith - Return events with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only events which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>comics - Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&comics={comics}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  EventDataWrapper getEventsCollectionByStoryId(@Param("storyId") Integer storyId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventsCollectionByStoryId</code> method in a fluent style.
   */
  public static class GetEventsCollectionByStoryIdQueryParams extends HashMap<String, Object> {
    public GetEventsCollectionByStoryIdQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetEventsCollectionByStoryIdQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of events filtered by a comic id.
   * Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.
   * @param comicId The comic ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  EventDataWrapper getIssueEventsCollection(@Param("comicId") Integer comicId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("series") List<Integer> series, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of events filtered by a comic id.
   * Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getIssueEventsCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetIssueEventsCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param comicId The comic ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Filter the event list by name. (optional)</li>
   *   <li>nameStartsWith - Return events with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only events which have been modified since the specified date. (optional)</li>
   *   <li>creators - Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return EventDataWrapper
   */
  @RequestLine("GET /v1/public/comics/{comicId}/events?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&creators={creators}&characters={characters}&series={series}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  EventDataWrapper getIssueEventsCollection(@Param("comicId") Integer comicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getIssueEventsCollection</code> method in a fluent style.
   */
  public static class GetIssueEventsCollectionQueryParams extends HashMap<String, Object> {
    public GetIssueEventsCollectionQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetIssueEventsCollectionQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetIssueEventsCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetIssueEventsCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetIssueEventsCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetIssueEventsCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetIssueEventsCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetIssueEventsCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetIssueEventsCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetIssueEventsCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of characters filtered by a series id.
   * Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series id. (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  CharacterDataWrapper getSeriesCharacterWrapper(@Param("seriesId") Integer seriesId, @Param("name") String name, @Param("nameStartsWith") String nameStartsWith, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("events") List<Integer> events, @Param("stories") List<Integer> stories, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of characters filtered by a series id.
   * Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getSeriesCharacterWrapper</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSeriesCharacterWrapperQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param seriesId The series id. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>name - Return only characters matching the specified full character name (e.g. Spider-Man). (optional)</li>
   *   <li>nameStartsWith - Return characters with names that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>modifiedSince - Return only characters which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return CharacterDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/characters?name={name}&nameStartsWith={nameStartsWith}&modifiedSince={modifiedSince}&comics={comics}&events={events}&stories={stories}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  CharacterDataWrapper getSeriesCharacterWrapper(@Param("seriesId") Integer seriesId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSeriesCharacterWrapper</code> method in a fluent style.
   */
  public static class GetSeriesCharacterWrapperQueryParams extends HashMap<String, Object> {
    public GetSeriesCharacterWrapperQueryParams name(final String value) {
      put("name", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams nameStartsWith(final String value) {
      put("nameStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCharacterWrapperQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of series.
   * Fetches lists of comic series with optional filters. See notes on individual parameters below.
   * @param title Return only series matching the specified title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&events={events}&creators={creators}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  SeriesDataWrapper getSeriesCollection(@Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("stories") List<Integer> stories, @Param("events") List<Integer> events, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("seriesType") String seriesType, @Param("contains") List<String> contains, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of series.
   * Fetches lists of comic series with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getSeriesCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSeriesCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>title - Return only series matching the specified title. (optional)</li>
   *   <li>titleStartsWith - Return series with titles that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>startYear - Return only series matching the specified start year. (optional)</li>
   *   <li>modifiedSince - Return only series which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>stories - Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>seriesType - Filter the series by publication frequency type. (optional)</li>
   *   <li>contains - Return only series containing one or more comics with the specified format. (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/series?title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&stories={stories}&events={events}&creators={creators}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  SeriesDataWrapper getSeriesCollection(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSeriesCollection</code> method in a fluent style.
   */
  public static class GetSeriesCollectionQueryParams extends HashMap<String, Object> {
    public GetSeriesCollectionQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCollectionQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCollectionQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCollectionQueryParams stories(final List<Integer> value) {
      put("stories", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCollectionQueryParams seriesType(final String value) {
      put("seriesType", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCollectionQueryParams contains(final List<String> value) {
      put("contains", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches a single comic series by id.
   * This method fetches a single comic series resource.  It is the canonical URI for any comic series resource provided by the API.
   * @param seriesId Filter by series title. (required)
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}")
  @Headers({
    "Accept: */*",
  })
  SeriesDataWrapper getSeriesIndividual(@Param("seriesId") Integer seriesId);

  /**
   * Fetches lists of stories filtered by a series id.
   * Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/stories?modifiedSince={modifiedSince}&comics={comics}&events={events}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  StoryDataWrapper getSeriesStoryCollection(@Param("seriesId") Integer seriesId, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("events") List<Integer> events, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of stories filtered by a series id.
   * Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getSeriesStoryCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSeriesStoryCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param seriesId The series ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>modifiedSince - Return only stories which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/series/{seriesId}/stories?modifiedSince={modifiedSince}&comics={comics}&events={events}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  StoryDataWrapper getSeriesStoryCollection(@Param("seriesId") Integer seriesId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSeriesStoryCollection</code> method in a fluent style.
   */
  public static class GetSeriesStoryCollectionQueryParams extends HashMap<String, Object> {
    public GetSeriesStoryCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesStoryCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesStoryCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesStoryCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesStoryCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesStoryCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSeriesStoryCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetSeriesStoryCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches lists of stories.
   * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  StoryDataWrapper getStoryCollection(@Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("series") List<Integer> series, @Param("events") List<Integer> events, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of stories.
   * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getStoryCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStoryCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>modifiedSince - Return only stories which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)</li>
   *   <li>series - Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)</li>
   *   <li>events - Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/stories?modifiedSince={modifiedSince}&comics={comics}&series={series}&events={events}&creators={creators}&characters={characters}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  StoryDataWrapper getStoryCollection(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getStoryCollection</code> method in a fluent style.
   */
  public static class GetStoryCollectionQueryParams extends HashMap<String, Object> {
    public GetStoryCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetStoryCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStoryCollectionQueryParams series(final List<Integer> value) {
      put("series", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStoryCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStoryCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStoryCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStoryCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStoryCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetStoryCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetches a single comic story by id.
   * This method fetches a single comic story resource.  It is the canonical URI for any comic story resource provided by the API.
   * @param storyId Filter by story id. (required)
   * @return StoryDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}")
  @Headers({
    "Accept: */*",
  })
  StoryDataWrapper getStoryIndividual(@Param("storyId") Integer storyId);

  /**
   * Fetches lists of series filtered by a story id.
   * Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/series?events={events}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&creators={creators}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: */*",
  })
  SeriesDataWrapper getStorySeriesCollection(@Param("storyId") Integer storyId, @Param("events") List<Integer> events, @Param("title") String title, @Param("titleStartsWith") String titleStartsWith, @Param("startYear") Integer startYear, @Param("modifiedSince") LocalDate modifiedSince, @Param("comics") List<Integer> comics, @Param("creators") List<Integer> creators, @Param("characters") List<Integer> characters, @Param("seriesType") String seriesType, @Param("contains") List<String> contains, @Param("orderBy") List<String> orderBy, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Fetches lists of series filtered by a story id.
   * Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.
   * Note, this is equivalent to the other <code>getStorySeriesCollection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetStorySeriesCollectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param storyId The story ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>events - Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)</li>
   *   <li>title - Filter by series title. (optional)</li>
   *   <li>titleStartsWith - Return series with titles that begin with the specified string (e.g. Sp). (optional)</li>
   *   <li>startYear - Return only series matching the specified start year. (optional)</li>
   *   <li>modifiedSince - Return only series which have been modified since the specified date. (optional)</li>
   *   <li>comics - Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)</li>
   *   <li>creators - Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)</li>
   *   <li>characters - Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)</li>
   *   <li>seriesType - Filter the series by publication frequency type. (optional)</li>
   *   <li>contains - Return only series containing one or more comics with the specified format. (optional)</li>
   *   <li>orderBy - Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)</li>
   *   <li>limit - Limit the result set to the specified number of resources. (optional)</li>
   *   <li>offset - Skip the specified number of resources in the result set. (optional)</li>
   *   </ul>
   * @return SeriesDataWrapper
   */
  @RequestLine("GET /v1/public/stories/{storyId}/series?events={events}&title={title}&titleStartsWith={titleStartsWith}&startYear={startYear}&modifiedSince={modifiedSince}&comics={comics}&creators={creators}&characters={characters}&seriesType={seriesType}&contains={contains}&orderBy={orderBy}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: */*",
  })
  SeriesDataWrapper getStorySeriesCollection(@Param("storyId") Integer storyId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getStorySeriesCollection</code> method in a fluent style.
   */
  public static class GetStorySeriesCollectionQueryParams extends HashMap<String, Object> {
    public GetStorySeriesCollectionQueryParams events(final List<Integer> value) {
      put("events", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStorySeriesCollectionQueryParams title(final String value) {
      put("title", EncodingUtils.encode(value));
      return this;
    }
    public GetStorySeriesCollectionQueryParams titleStartsWith(final String value) {
      put("titleStartsWith", EncodingUtils.encode(value));
      return this;
    }
    public GetStorySeriesCollectionQueryParams startYear(final Integer value) {
      put("startYear", EncodingUtils.encode(value));
      return this;
    }
    public GetStorySeriesCollectionQueryParams modifiedSince(final LocalDate value) {
      put("modifiedSince", EncodingUtils.encode(value));
      return this;
    }
    public GetStorySeriesCollectionQueryParams comics(final List<Integer> value) {
      put("comics", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStorySeriesCollectionQueryParams creators(final List<Integer> value) {
      put("creators", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStorySeriesCollectionQueryParams characters(final List<Integer> value) {
      put("characters", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStorySeriesCollectionQueryParams seriesType(final String value) {
      put("seriesType", EncodingUtils.encode(value));
      return this;
    }
    public GetStorySeriesCollectionQueryParams contains(final List<String> value) {
      put("contains", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStorySeriesCollectionQueryParams orderBy(final List<String> value) {
      put("orderBy", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetStorySeriesCollectionQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetStorySeriesCollectionQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }
}
