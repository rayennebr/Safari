package com.edu.demo.safari.types;

import lombok.Builder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

@Builder
public class MultiLanguage implements Serializable {
    private HashMap<String,String> content;

    public MultiLanguage() {
    }

    public MultiLanguage(HashMap<String, String> content) {
        this.content = content;
    }

    public HashMap<String, String> getContent() {
        return content;
    }

    public void setContent(HashMap<String, String> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiLanguage that = (MultiLanguage) o;
        return Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        return "MultiLanguage{" +
                "content=" + content +
                '}';
    }
}
