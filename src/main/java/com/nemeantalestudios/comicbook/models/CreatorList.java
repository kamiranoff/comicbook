package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Getter
@Setter
public class CreatorList extends AbstractList {
    private List<CreatorSummary> items;

    public List<CreatorSummary> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
