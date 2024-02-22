package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.CommentRequestDto;
import com.codepresso.sns.mapper.CommentMapper;
import com.codepresso.sns.vo.Comment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommentService {
    CommentMapper commentMapper;

    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public Comment createComment(int postId,CommentRequestDto requestDto) {
        if(requestDto.getUserId() == 0 || requestDto.getComment() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "400 Bad Request");
        }
        if(commentMapper.checkpost(postId) == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }


        commentMapper.createComment(postId, requestDto);
        Comment comment = commentMapper.getNewOne();
        return comment;
    }

    public List<Comment> findAllComment(int postId){
        if(commentMapper.checkpost(postId) == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }
        List<Comment> list=commentMapper.findAllComment(postId);
        return list;
    }
}
