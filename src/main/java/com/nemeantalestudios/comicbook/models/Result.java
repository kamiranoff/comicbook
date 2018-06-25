package com.nemeantalestudios.comicbook.models;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
public class Result<T> {
    private int code;
    private String status;
    private String etag;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private Container<T> data;
    private String rawResponse;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
