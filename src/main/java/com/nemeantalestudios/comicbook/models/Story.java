package com.nemeantalestudios.comicbook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Setter
@Getter
@JsonIgnoreProperties
public class Story {
    private int id;
    private String title;
    private String description;
    private String resourceURI;
    private List<URL> urls;
    private String type;
    private String modified;
    private Image thumbnail;
    private ComicList comics;
    private SeriesList series;
    private EventList events;
    private CharacterList characters;
    private CreatorList creators;
    private ComicSummary originalIssue;
    private String start;
    private String end;
    private StoryList stories;
    private StorySummary next;
    private StorySummary previous;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
