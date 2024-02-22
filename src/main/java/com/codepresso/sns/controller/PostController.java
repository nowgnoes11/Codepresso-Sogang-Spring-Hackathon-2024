package com.codepresso.sns.controller;

import com.codepresso.sns.Service.PostService;
import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.vo.Post;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post")
    public PostResponseDto createPost(@RequestBody PostCreateDto info){
        return postService.createPost(info);
    }

    @GetMapping("/posts")
    public PostListDto findAllPost(@RequestParam(value = "userId", required = true) int userId){
        List<PostResponseDto> postslist=postService.findAllPost(userId);
        PostListDto posts=new PostListDto(postslist);
        return posts;
    }

    @GetMapping("/posts/sortedByLikes")
    public PostLikeListDto findAllPostByLike(@RequestParam(value = "userId", required = true) int userId){
        PostLikeListDto posts=new PostLikeListDto(postService.findAllPostByLike(userId));
        return posts;
    }

    @GetMapping("/user/{userId}/posts")
    public PostUserDto findUserPost(@PathVariable int userId){
        return postService.findPostById(userId);
    }

    @PatchMapping("/post/{postId}")
    public PostResponseDto updatePost(@PathVariable int postId, @RequestBody PostUpdateRequestDto info){
        return postService.updatePost(postId, info.getUserId(), info.getContent());
    }

    @DeleteMapping("/post/{postId}")
    public MessageDto deletePost(@PathVariable int postId, @RequestBody GetUserIdDto userId){
        postService.deletePost(postId);
        MessageDto answer=new MessageDto("Post successfully deleted.");
        return answer;
    }



}
