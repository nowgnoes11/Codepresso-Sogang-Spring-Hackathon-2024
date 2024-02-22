package com.codepresso.sns.controller.dto;

import com.codepresso.sns.vo.Post;
import com.codepresso.sns.vo.Tag;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PostResponseDto {
    int postId;
    int userId;
    String userName;
    String content;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    boolean likedByUser;
    List<Tag> tagList;

    public PostResponseDto(int postId, int userId, String userName, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.postId = postId;
        this.userId = userId;
        this.userName = userName;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.likedByUser=false;
        List<Tag> tagList=new ArrayList<>();
    }

    public PostResponseDto(Post post) {
        this.postId = post.getPostId();
        this.userId = post.getUserId();
        this.content = post.getContent();
        this.createdAt = post.getCreatedAt();
        this.updatedAt = post.getUpdatedAt();
        this.likedByUser=false;
        List<Tag> tagList=new ArrayList<>();
    }
}
