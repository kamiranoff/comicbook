package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Getter
@Setter
public class Series {
    private int id;
    private String title;
    private String description;
    private String resourceURI;
    private String type;
    private List<URL> urls;
    private int startYear;
    private int endYear;
    private String rating;
    private String modified;
    private Image thumbnail;
    private ComicList comics;
    private StoryList stories;
    private EventList events;
    private CharacterList characters;
    private CreatorList creators;
    private SeriesSummary next;
    private SeriesSummary previous;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
