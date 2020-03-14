package es.usj.mastertsa.jhernandez.musicquiz.client.api;

import es.usj.mastertsa.jhernandez.musicquiz.client.ApiClient;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.CharacterDataWrapper;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.ComicDataWrapper;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.CreatorDataWrapper;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.EventDataWrapper;
import org.threeten.bp.LocalDate;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.SeriesDataWrapper;
import es.usj.mastertsa.jhernandez.musicquiz.client.model.StoryDataWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DefaultApi.class);
    }

    
    /**
     * Fetches lists of creators.
     *
     * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getAllCreatorCollectionTest() {
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getAllCreatorCollection(firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of creators.
     *
     * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllCreatorCollectionTestQueryMap() {
        DefaultApi.GetAllCreatorCollectionQueryParams queryParams = new DefaultApi.GetAllCreatorCollectionQueryParams()
            .firstName(null)
            .middleName(null)
            .lastName(null)
            .suffix(null)
            .nameStartsWith(null)
            .firstNameStartsWith(null)
            .middleNameStartsWith(null)
            .lastNameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .events(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CreatorDataWrapper response = api.getAllCreatorCollection(queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a character id.
     *
     * Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCharacterEventsCollectionTest() {
        Integer characterId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getCharacterEventsCollection(characterId, name, nameStartsWith, modifiedSince, creators, series, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of events filtered by a character id.
     *
     * Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCharacterEventsCollectionTestQueryMap() {
        Integer characterId = null;
        DefaultApi.GetCharacterEventsCollectionQueryParams queryParams = new DefaultApi.GetCharacterEventsCollectionQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .creators(null)
            .series(null)
            .comics(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // EventDataWrapper response = api.getCharacterEventsCollection(characterId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches a single character by id.
     *
     * This method fetches a single character resource.  It is the canonical URI for any character resource provided by the API.
     */
    @Test
    public void getCharacterIndividualTest() {
        Integer characterId = null;
        // CharacterDataWrapper response = api.getCharacterIndividual(characterId);

        // TODO: test validations
    }

    
    /**
     * Fetches lists of series filtered by a character id.
     *
     * Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCharacterSeriesCollectionTest() {
        Integer characterId = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getCharacterSeriesCollection(characterId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of series filtered by a character id.
     *
     * Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCharacterSeriesCollectionTestQueryMap() {
        Integer characterId = null;
        DefaultApi.GetCharacterSeriesCollectionQueryParams queryParams = new DefaultApi.GetCharacterSeriesCollectionQueryParams()
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .modifiedSince(null)
            .comics(null)
            .stories(null)
            .events(null)
            .creators(null)
            .seriesType(null)
            .contains(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // SeriesDataWrapper response = api.getCharacterSeriesCollection(characterId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by a character id.
     *
     * Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCharacterStoryCollectionTest() {
        Integer characterId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getCharacterStoryCollection(characterId, modifiedSince, comics, series, events, creators, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of stories filtered by a character id.
     *
     * Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCharacterStoryCollectionTestQueryMap() {
        Integer characterId = null;
        DefaultApi.GetCharacterStoryCollectionQueryParams queryParams = new DefaultApi.GetCharacterStoryCollectionQueryParams()
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .events(null)
            .creators(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // StoryDataWrapper response = api.getCharacterStoryCollection(characterId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by a comic id.
     *
     * Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicCharacterCollectionTest() {
        Integer comicId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getComicCharacterCollection(comicId, name, nameStartsWith, modifiedSince, series, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of characters filtered by a comic id.
     *
     * Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicCharacterCollectionTestQueryMap() {
        Integer comicId = null;
        DefaultApi.GetComicCharacterCollectionQueryParams queryParams = new DefaultApi.GetComicCharacterCollectionQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .series(null)
            .events(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CharacterDataWrapper response = api.getComicCharacterCollection(comicId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches a single comic by id.
     *
     * This method fetches a single comic resource.  It is the canonical URI for any comic resource provided by the API.
     */
    @Test
    public void getComicIndividualTest() {
        Integer comicId = null;
        // ComicDataWrapper response = api.getComicIndividual(comicId);

        // TODO: test validations
    }

    
    /**
     * Fetches lists of stories filtered by a comic id.
     *
     * Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicStoryCollectionTest() {
        Integer comicId = null;
        LocalDate modifiedSince = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getComicStoryCollection(comicId, modifiedSince, series, events, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of stories filtered by a comic id.
     *
     * Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicStoryCollectionTestQueryMap() {
        Integer comicId = null;
        DefaultApi.GetComicStoryCollectionQueryParams queryParams = new DefaultApi.GetComicStoryCollectionQueryParams()
            .modifiedSince(null)
            .series(null)
            .events(null)
            .creators(null)
            .characters(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // StoryDataWrapper response = api.getComicStoryCollection(comicId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a character id.
     *
     * Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCharacterCollectionTest() {
        Integer characterId = null;
        String format = null;
        String formatType = null;
        Boolean noVariants = null;
        String dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        Boolean hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCharacterCollection(characterId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of comics filtered by a character id.
     *
     * Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicsCharacterCollectionTestQueryMap() {
        Integer characterId = null;
        DefaultApi.GetComicsCharacterCollectionQueryParams queryParams = new DefaultApi.GetComicsCharacterCollectionQueryParams()
            .format(null)
            .formatType(null)
            .noVariants(null)
            .dateDescriptor(null)
            .dateRange(null)
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .issueNumber(null)
            .diamondCode(null)
            .digitalId(null)
            .upc(null)
            .isbn(null)
            .ean(null)
            .issn(null)
            .hasDigitalIssue(null)
            .modifiedSince(null)
            .creators(null)
            .series(null)
            .events(null)
            .stories(null)
            .sharedAppearances(null)
            .collaborators(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // ComicDataWrapper response = api.getComicsCharacterCollection(characterId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of comics.
     *
     * Fetches lists of comics with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollectionTest() {
        String format = null;
        String formatType = null;
        Boolean noVariants = null;
        String dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        Boolean hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollection(format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of comics.
     *
     * Fetches lists of comics with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicsCollectionTestQueryMap() {
        DefaultApi.GetComicsCollectionQueryParams queryParams = new DefaultApi.GetComicsCollectionQueryParams()
            .format(null)
            .formatType(null)
            .noVariants(null)
            .dateDescriptor(null)
            .dateRange(null)
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .issueNumber(null)
            .diamondCode(null)
            .digitalId(null)
            .upc(null)
            .isbn(null)
            .ean(null)
            .issn(null)
            .hasDigitalIssue(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .series(null)
            .events(null)
            .stories(null)
            .sharedAppearances(null)
            .collaborators(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // ComicDataWrapper response = api.getComicsCollection(queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a creator id.
     *
     * Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollectionByCreatorIdTest() {
        Integer creatorId = null;
        String format = null;
        String formatType = null;
        Boolean noVariants = null;
        String dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollectionByCreatorId(creatorId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of comics filtered by a creator id.
     *
     * Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicsCollectionByCreatorIdTestQueryMap() {
        Integer creatorId = null;
        DefaultApi.GetComicsCollectionByCreatorIdQueryParams queryParams = new DefaultApi.GetComicsCollectionByCreatorIdQueryParams()
            .format(null)
            .formatType(null)
            .noVariants(null)
            .dateDescriptor(null)
            .dateRange(null)
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .issueNumber(null)
            .diamondCode(null)
            .digitalId(null)
            .upc(null)
            .isbn(null)
            .ean(null)
            .issn(null)
            .hasDigitalIssue(null)
            .modifiedSince(null)
            .characters(null)
            .series(null)
            .events(null)
            .stories(null)
            .sharedAppearances(null)
            .collaborators(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // ComicDataWrapper response = api.getComicsCollectionByCreatorId(creatorId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by an event id.
     *
     * Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollectionByEventIdTest() {
        Integer eventId = null;
        String format = null;
        String formatType = null;
        List<Boolean> noVariants = null;
        List<String> dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollectionByEventId(eventId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of comics filtered by an event id.
     *
     * Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicsCollectionByEventIdTestQueryMap() {
        Integer eventId = null;
        DefaultApi.GetComicsCollectionByEventIdQueryParams queryParams = new DefaultApi.GetComicsCollectionByEventIdQueryParams()
            .format(null)
            .formatType(null)
            .noVariants(null)
            .dateDescriptor(null)
            .dateRange(null)
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .issueNumber(null)
            .diamondCode(null)
            .digitalId(null)
            .upc(null)
            .isbn(null)
            .ean(null)
            .issn(null)
            .hasDigitalIssue(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .series(null)
            .events(null)
            .stories(null)
            .sharedAppearances(null)
            .collaborators(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // ComicDataWrapper response = api.getComicsCollectionByEventId(eventId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a series id.
     *
     * Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollectionBySeriesIdTest() {
        Integer seriesId = null;
        String format = null;
        String formatType = null;
        List<Boolean> noVariants = null;
        List<String> dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollectionBySeriesId(seriesId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of comics filtered by a series id.
     *
     * Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicsCollectionBySeriesIdTestQueryMap() {
        Integer seriesId = null;
        DefaultApi.GetComicsCollectionBySeriesIdQueryParams queryParams = new DefaultApi.GetComicsCollectionBySeriesIdQueryParams()
            .format(null)
            .formatType(null)
            .noVariants(null)
            .dateDescriptor(null)
            .dateRange(null)
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .issueNumber(null)
            .diamondCode(null)
            .digitalId(null)
            .upc(null)
            .isbn(null)
            .ean(null)
            .issn(null)
            .hasDigitalIssue(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .events(null)
            .stories(null)
            .sharedAppearances(null)
            .collaborators(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // ComicDataWrapper response = api.getComicsCollectionBySeriesId(seriesId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a story id.
     *
     * Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollectionByStoryIdTest() {
        Integer storyId = null;
        String format = null;
        String formatType = null;
        List<Boolean> noVariants = null;
        List<String> dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollectionByStoryId(storyId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of comics filtered by a story id.
     *
     * Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getComicsCollectionByStoryIdTestQueryMap() {
        Integer storyId = null;
        DefaultApi.GetComicsCollectionByStoryIdQueryParams queryParams = new DefaultApi.GetComicsCollectionByStoryIdQueryParams()
            .format(null)
            .formatType(null)
            .noVariants(null)
            .dateDescriptor(null)
            .dateRange(null)
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .issueNumber(null)
            .diamondCode(null)
            .digitalId(null)
            .upc(null)
            .isbn(null)
            .ean(null)
            .issn(null)
            .hasDigitalIssue(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .series(null)
            .events(null)
            .sharedAppearances(null)
            .collaborators(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // ComicDataWrapper response = api.getComicsCollectionByStoryId(storyId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of characters.
     *
     * Fetches lists of comic characters with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollectionTest() {
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getCreatorCollection(name, nameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of characters.
     *
     * Fetches lists of comic characters with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorCollectionTestQueryMap() {
        DefaultApi.GetCreatorCollectionQueryParams queryParams = new DefaultApi.GetCreatorCollectionQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .events(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CharacterDataWrapper response = api.getCreatorCollection(queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by a comic id.
     *
     * Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollectionByComicIdTest() {
        Integer comicId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollectionByComicId(comicId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of creators filtered by a comic id.
     *
     * Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorCollectionByComicIdTestQueryMap() {
        Integer comicId = null;
        DefaultApi.GetCreatorCollectionByComicIdQueryParams queryParams = new DefaultApi.GetCreatorCollectionByComicIdQueryParams()
            .firstName(null)
            .middleName(null)
            .lastName(null)
            .suffix(null)
            .nameStartsWith(null)
            .firstNameStartsWith(null)
            .middleNameStartsWith(null)
            .lastNameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CreatorDataWrapper response = api.getCreatorCollectionByComicId(comicId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by an event id.
     *
     * Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollectionByEventIdTest() {
        Integer eventId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollectionByEventId(eventId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of creators filtered by an event id.
     *
     * Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorCollectionByEventIdTestQueryMap() {
        Integer eventId = null;
        DefaultApi.GetCreatorCollectionByEventIdQueryParams queryParams = new DefaultApi.GetCreatorCollectionByEventIdQueryParams()
            .firstName(null)
            .middleName(null)
            .lastName(null)
            .suffix(null)
            .nameStartsWith(null)
            .firstNameStartsWith(null)
            .middleNameStartsWith(null)
            .lastNameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CreatorDataWrapper response = api.getCreatorCollectionByEventId(eventId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by a series id.
     *
     * Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollectionBySeriesIdTest() {
        Integer seriesId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollectionBySeriesId(seriesId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of creators filtered by a series id.
     *
     * Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorCollectionBySeriesIdTestQueryMap() {
        Integer seriesId = null;
        DefaultApi.GetCreatorCollectionBySeriesIdQueryParams queryParams = new DefaultApi.GetCreatorCollectionBySeriesIdQueryParams()
            .firstName(null)
            .middleName(null)
            .lastName(null)
            .suffix(null)
            .nameStartsWith(null)
            .firstNameStartsWith(null)
            .middleNameStartsWith(null)
            .lastNameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .events(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CreatorDataWrapper response = api.getCreatorCollectionBySeriesId(seriesId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by a story id.
     *
     * Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollectionByStoryTest() {
        Integer storyId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollectionByStory(storyId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of creators filtered by a story id.
     *
     * Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorCollectionByStoryTestQueryMap() {
        Integer storyId = null;
        DefaultApi.GetCreatorCollectionByStoryQueryParams queryParams = new DefaultApi.GetCreatorCollectionByStoryQueryParams()
            .firstName(null)
            .middleName(null)
            .lastName(null)
            .suffix(null)
            .nameStartsWith(null)
            .firstNameStartsWith(null)
            .middleNameStartsWith(null)
            .lastNameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .events(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CreatorDataWrapper response = api.getCreatorCollectionByStory(storyId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by a story id.
     *
     * Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollectionByStoryIdTest() {
        Integer storyId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getCreatorCollectionByStoryId(storyId, name, nameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of characters filtered by a story id.
     *
     * Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorCollectionByStoryIdTestQueryMap() {
        Integer storyId = null;
        DefaultApi.GetCreatorCollectionByStoryIdQueryParams queryParams = new DefaultApi.GetCreatorCollectionByStoryIdQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .events(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CharacterDataWrapper response = api.getCreatorCollectionByStoryId(storyId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a creator id.
     *
     * Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorEventsCollectionTest() {
        Integer creatorId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getCreatorEventsCollection(creatorId, name, nameStartsWith, modifiedSince, characters, series, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of events filtered by a creator id.
     *
     * Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorEventsCollectionTestQueryMap() {
        Integer creatorId = null;
        DefaultApi.GetCreatorEventsCollectionQueryParams queryParams = new DefaultApi.GetCreatorEventsCollectionQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .characters(null)
            .series(null)
            .comics(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // EventDataWrapper response = api.getCreatorEventsCollection(creatorId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches a single creator by id.
     *
     * This method fetches a single creator resource.  It is the canonical URI for any creator resource provided by the API.
     */
    @Test
    public void getCreatorIndividualTest() {
        Integer creatorId = null;
        // CreatorDataWrapper response = api.getCreatorIndividual(creatorId);

        // TODO: test validations
    }

    
    /**
     * Fetches lists of series filtered by a creator id.
     *
     * Fetches lists of comic series in which a specific creator&#39;s work appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorSeriesCollectionTest() {
        Integer creatorId = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> events = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getCreatorSeriesCollection(creatorId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of series filtered by a creator id.
     *
     * Fetches lists of comic series in which a specific creator&#39;s work appears, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorSeriesCollectionTestQueryMap() {
        Integer creatorId = null;
        DefaultApi.GetCreatorSeriesCollectionQueryParams queryParams = new DefaultApi.GetCreatorSeriesCollectionQueryParams()
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .modifiedSince(null)
            .comics(null)
            .stories(null)
            .events(null)
            .characters(null)
            .seriesType(null)
            .contains(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // SeriesDataWrapper response = api.getCreatorSeriesCollection(creatorId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by a creator id.
     *
     * Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorStoryCollectionTest() {
        Integer creatorId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getCreatorStoryCollection(creatorId, modifiedSince, comics, series, events, characters, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of stories filtered by a creator id.
     *
     * Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCreatorStoryCollectionTestQueryMap() {
        Integer creatorId = null;
        DefaultApi.GetCreatorStoryCollectionQueryParams queryParams = new DefaultApi.GetCreatorStoryCollectionQueryParams()
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .events(null)
            .characters(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // StoryDataWrapper response = api.getCreatorStoryCollection(creatorId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by an event id.
     *
     * Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventCharacterCollectionTest() {
        Integer eventId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getEventCharacterCollection(eventId, name, nameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of characters filtered by an event id.
     *
     * Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEventCharacterCollectionTestQueryMap() {
        Integer eventId = null;
        DefaultApi.GetEventCharacterCollectionQueryParams queryParams = new DefaultApi.GetEventCharacterCollectionQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CharacterDataWrapper response = api.getEventCharacterCollection(eventId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches a single event by id.
     *
     * This method fetches a single event resource.  It is the canonical URI for any event resource provided by the API.
     */
    @Test
    public void getEventIndividualTest() {
        Integer eventId = null;
        // EventDataWrapper response = api.getEventIndividual(eventId);

        // TODO: test validations
    }

    
    /**
     * Fetches lists of series filtered by an event id.
     *
     * Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventSeriesCollectionTest() {
        Integer eventId = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getEventSeriesCollection(eventId, title, titleStartsWith, startYear, modifiedSince, comics, stories, creators, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of series filtered by an event id.
     *
     * Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEventSeriesCollectionTestQueryMap() {
        Integer eventId = null;
        DefaultApi.GetEventSeriesCollectionQueryParams queryParams = new DefaultApi.GetEventSeriesCollectionQueryParams()
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .modifiedSince(null)
            .comics(null)
            .stories(null)
            .creators(null)
            .characters(null)
            .seriesType(null)
            .contains(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // SeriesDataWrapper response = api.getEventSeriesCollection(eventId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by an event id.
     *
     * Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventStoryCollectionTest() {
        Integer eventId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getEventStoryCollection(eventId, modifiedSince, comics, series, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of stories filtered by an event id.
     *
     * Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEventStoryCollectionTestQueryMap() {
        Integer eventId = null;
        DefaultApi.GetEventStoryCollectionQueryParams queryParams = new DefaultApi.GetEventStoryCollectionQueryParams()
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .creators(null)
            .characters(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // StoryDataWrapper response = api.getEventStoryCollection(eventId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of events.
     *
     * Fetches lists of events with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventsCollectionTest() {
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getEventsCollection(name, nameStartsWith, modifiedSince, creators, characters, series, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of events.
     *
     * Fetches lists of events with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEventsCollectionTestQueryMap() {
        DefaultApi.GetEventsCollectionQueryParams queryParams = new DefaultApi.GetEventsCollectionQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .series(null)
            .comics(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // EventDataWrapper response = api.getEventsCollection(queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a series id.
     *
     * Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventsCollectionBySeriesIdTest() {
        Integer seriesId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getEventsCollectionBySeriesId(seriesId, name, nameStartsWith, modifiedSince, creators, characters, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of events filtered by a series id.
     *
     * Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEventsCollectionBySeriesIdTestQueryMap() {
        Integer seriesId = null;
        DefaultApi.GetEventsCollectionBySeriesIdQueryParams queryParams = new DefaultApi.GetEventsCollectionBySeriesIdQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .comics(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // EventDataWrapper response = api.getEventsCollectionBySeriesId(seriesId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a story id.
     *
     * Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventsCollectionByStoryIdTest() {
        Integer storyId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getEventsCollectionByStoryId(storyId, name, nameStartsWith, modifiedSince, creators, characters, series, comics, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of events filtered by a story id.
     *
     * Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEventsCollectionByStoryIdTestQueryMap() {
        Integer storyId = null;
        DefaultApi.GetEventsCollectionByStoryIdQueryParams queryParams = new DefaultApi.GetEventsCollectionByStoryIdQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .series(null)
            .comics(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // EventDataWrapper response = api.getEventsCollectionByStoryId(storyId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a comic id.
     *
     * Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getIssueEventsCollectionTest() {
        Integer comicId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getIssueEventsCollection(comicId, name, nameStartsWith, modifiedSince, creators, characters, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of events filtered by a comic id.
     *
     * Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getIssueEventsCollectionTestQueryMap() {
        Integer comicId = null;
        DefaultApi.GetIssueEventsCollectionQueryParams queryParams = new DefaultApi.GetIssueEventsCollectionQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .creators(null)
            .characters(null)
            .series(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // EventDataWrapper response = api.getIssueEventsCollection(comicId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by a series id.
     *
     * Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getSeriesCharacterWrapperTest() {
        Integer seriesId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getSeriesCharacterWrapper(seriesId, name, nameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of characters filtered by a series id.
     *
     * Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSeriesCharacterWrapperTestQueryMap() {
        Integer seriesId = null;
        DefaultApi.GetSeriesCharacterWrapperQueryParams queryParams = new DefaultApi.GetSeriesCharacterWrapperQueryParams()
            .name(null)
            .nameStartsWith(null)
            .modifiedSince(null)
            .comics(null)
            .events(null)
            .stories(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // CharacterDataWrapper response = api.getSeriesCharacterWrapper(seriesId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of series.
     *
     * Fetches lists of comic series with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getSeriesCollectionTest() {
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getSeriesCollection(title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of series.
     *
     * Fetches lists of comic series with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSeriesCollectionTestQueryMap() {
        DefaultApi.GetSeriesCollectionQueryParams queryParams = new DefaultApi.GetSeriesCollectionQueryParams()
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .modifiedSince(null)
            .comics(null)
            .stories(null)
            .events(null)
            .creators(null)
            .characters(null)
            .seriesType(null)
            .contains(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // SeriesDataWrapper response = api.getSeriesCollection(queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches a single comic series by id.
     *
     * This method fetches a single comic series resource.  It is the canonical URI for any comic series resource provided by the API.
     */
    @Test
    public void getSeriesIndividualTest() {
        Integer seriesId = null;
        // SeriesDataWrapper response = api.getSeriesIndividual(seriesId);

        // TODO: test validations
    }

    
    /**
     * Fetches lists of stories filtered by a series id.
     *
     * Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getSeriesStoryCollectionTest() {
        Integer seriesId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getSeriesStoryCollection(seriesId, modifiedSince, comics, events, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of stories filtered by a series id.
     *
     * Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSeriesStoryCollectionTestQueryMap() {
        Integer seriesId = null;
        DefaultApi.GetSeriesStoryCollectionQueryParams queryParams = new DefaultApi.GetSeriesStoryCollectionQueryParams()
            .modifiedSince(null)
            .comics(null)
            .events(null)
            .creators(null)
            .characters(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // StoryDataWrapper response = api.getSeriesStoryCollection(seriesId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches lists of stories.
     *
     * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getStoryCollectionTest() {
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getStoryCollection(modifiedSince, comics, series, events, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of stories.
     *
     * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getStoryCollectionTestQueryMap() {
        DefaultApi.GetStoryCollectionQueryParams queryParams = new DefaultApi.GetStoryCollectionQueryParams()
            .modifiedSince(null)
            .comics(null)
            .series(null)
            .events(null)
            .creators(null)
            .characters(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // StoryDataWrapper response = api.getStoryCollection(queryParams);

    // TODO: test validations
    }
    
    /**
     * Fetches a single comic story by id.
     *
     * This method fetches a single comic story resource.  It is the canonical URI for any comic story resource provided by the API.
     */
    @Test
    public void getStoryIndividualTest() {
        Integer storyId = null;
        // StoryDataWrapper response = api.getStoryIndividual(storyId);

        // TODO: test validations
    }

    
    /**
     * Fetches lists of series filtered by a story id.
     *
     * Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.
     */
    @Test
    public void getStorySeriesCollectionTest() {
        Integer storyId = null;
        List<Integer> events = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getStorySeriesCollection(storyId, events, title, titleStartsWith, startYear, modifiedSince, comics, creators, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }

    /**
     * Fetches lists of series filtered by a story id.
     *
     * Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getStorySeriesCollectionTestQueryMap() {
        Integer storyId = null;
        DefaultApi.GetStorySeriesCollectionQueryParams queryParams = new DefaultApi.GetStorySeriesCollectionQueryParams()
            .events(null)
            .title(null)
            .titleStartsWith(null)
            .startYear(null)
            .modifiedSince(null)
            .comics(null)
            .creators(null)
            .characters(null)
            .seriesType(null)
            .contains(null)
            .orderBy(null)
            .limit(null)
            .offset(null);
        // SeriesDataWrapper response = api.getStorySeriesCollection(storyId, queryParams);

    // TODO: test validations
    }
    
}
