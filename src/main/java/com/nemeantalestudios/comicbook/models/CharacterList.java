package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Setter
@Getter
public class CharacterList extends AbstractList {
    private List<CharacterSummary> items;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
