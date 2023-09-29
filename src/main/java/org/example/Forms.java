package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Forms {
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
