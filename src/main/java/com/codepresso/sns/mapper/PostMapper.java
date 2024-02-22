package com.codepresso.sns.mapper;

import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.vo.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public Post getNewOne();
    public void createPost(PostCreateDto info);
    int checkid(int id);

    public List<PostResponseDto> findAllPost();

    public List<PostSimpleDto> findPostById(int id);

    public String findUserName(int id);

    public void updatePost(int postId, String content);

    public Post findPost(int postId);

    public void deletePost(int postId);
    public List<Integer> findUserLike(int userId);

    public List<PostLikeCountDto> countLikes();
}
