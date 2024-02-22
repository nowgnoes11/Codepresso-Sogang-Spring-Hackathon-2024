package com.codepresso.sns.controller;

import com.codepresso.sns.Service.PostLikeService;
import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.PostLikeRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostLikeController {
    PostLikeService postLikeService;

    public PostLikeController(PostLikeService postLikeServiceService) {
        this.postLikeService = postLikeServiceService;
    }

    @PostMapping("/post/{postId}/like")
    public MessageDto createLike(@PathVariable int postId, @RequestBody PostLikeRequestDto user){
        MessageDto answer=postLikeService.createLike(postId, user);
        return answer;
    }

    @DeleteMapping("/post/{postId}/like")
    public MessageDto deleteLike(@PathVariable int postId, @RequestBody PostLikeRequestDto user){
        MessageDto answer=postLikeService.deleteLike(postId, user);
        return answer;
    }
}

