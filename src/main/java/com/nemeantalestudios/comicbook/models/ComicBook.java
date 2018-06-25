package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author kevin.amiranoff on 25/06/2018
 */

@Setter
@Getter
public class ComicBook {
    private int id;
    private int digitalId;
    private String title;
    private double issueNumber;
    private String variantDescription;
    private String description;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private int pageCount;
    private List<Text> textObjects;
    private String resourceURI;
    private List<URL> urls;
    private SeriesSummary series;
    private List<ComicSummary> collections;
    private List<ComicSummary> variants;
    private List<ComicSummary> collectedIssues;
    private List<ComicDate> dates;
    private List<ComicPrice> prices;
    private Image thumbnail;
    private List<Image> images;
    private CreatorList creators;
    private CharacterList characters;
    private StoryList stories;
    private EventList events;
}
