package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Getter
@Setter
public class Event {
    private int id;
    private String title;
    private String description;
    private String resourceURI;
    private List<URL> urls;
    private String modified;
    private String start;
    private String end;
    private Image thumbnail;
    private ComicList comics;
    private StoryList stories;
    private SeriesList series;
    private CharacterList characters;
    private CreatorList creators;
    private EventSummary next;
    private EventSummary previous;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
