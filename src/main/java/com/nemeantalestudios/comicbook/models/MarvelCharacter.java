package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class MarvelCharacter {

    private int id;
    private String name;
    private String description;
    private Date modified;
    private String resourceURI;
    private List<URL> urls;
    private Image thumbnail;
    private ComicList comics;
    private StoryList stories;
    private EventList events;
    private SeriesList series;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
