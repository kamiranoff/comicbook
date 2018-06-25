package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
public class CreatorSummary {
    private String resourceURI;
    private String name;
    private String role;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
