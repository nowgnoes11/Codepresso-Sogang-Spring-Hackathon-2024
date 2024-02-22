package com.codepresso.sns.controller;

import com.codepresso.sns.Service.CommentService;
import com.codepresso.sns.controller.dto.CommentListDto;
import com.codepresso.sns.controller.dto.CommentRequestDto;
import com.codepresso.sns.controller.dto.CommentResponseDto;
import com.codepresso.sns.vo.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/post/{postId}/comment")
    public CommentResponseDto createComment(@PathVariable int postId, @RequestBody CommentRequestDto requestDto) {

        Comment comment = commentService.createComment(postId, requestDto);
        return new CommentResponseDto(comment.getCommentId(), comment.getPostId(), comment.getUserId()
                , comment.getComment(), comment.getCreatedAt());
    }

    @GetMapping("/post/{postId}/comments")
    public CommentListDto findAllComment(@PathVariable int postId){
        List<Comment> commentslist=commentService.findAllComment(postId);
        CommentListDto comments=new CommentListDto(commentslist);
        return comments;
    }
}
