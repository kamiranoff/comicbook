package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author kevin.amiranoff on 25/06/2018
 */

@Setter
@Getter
public class Text {
    private String type;
    private String language;
    private String text;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}