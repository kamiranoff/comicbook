package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
public class ComicPrice {
    private String type;
    private float price;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
