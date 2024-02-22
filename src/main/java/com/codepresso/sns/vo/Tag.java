package com.codepresso.sns.vo;

import lombok.Getter;

@Getter
public class Tag {
    int tagId;
    String tagName;

    public Tag(int tagId, String tagName) {
        this.tagId = tagId;
        this.tagName = tagName;
    }
}
