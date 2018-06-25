package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Getter
@Setter
public class Creator {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String fullName;
    private String modified;
    private String resourceURI;
    private List<URL> urls;
    private Image thumbnail;
    private SeriesList series;
    private StoryList stories;
    private ComicList comics;
    private EventList events;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
