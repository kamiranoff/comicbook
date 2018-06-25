package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Getter
@Setter
public class Container<T> {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<T> results;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
