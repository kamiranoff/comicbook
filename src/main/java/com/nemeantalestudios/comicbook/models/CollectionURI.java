package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Setter
@Getter
public class CollectionURI {
    private String collectionURI;
    private String service;
    private int id;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
