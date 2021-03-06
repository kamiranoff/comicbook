package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Getter
@Setter
public class ComicList extends AbstractList {
    private List<ComicSummary> items;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
