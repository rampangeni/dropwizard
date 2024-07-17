package io.dropwizard.api;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {
    private long id;

    private String content;

    public String Saying() {
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Saying{" + "id=" + id + ", content='" + content + '\'' + '}';
    }
}
