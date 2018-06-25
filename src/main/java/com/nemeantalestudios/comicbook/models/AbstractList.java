package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractList {
    protected int available;
    protected int returned;
    protected String collectionURI;

}
