package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.PostLikeRequestDto;
import com.codepresso.sns.mapper.PostLikeMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PostLikeService {
    PostLikeMapper postLikeMapper;

    public PostLikeService(PostLikeMapper postLikeMapper) {
        this.postLikeMapper = postLikeMapper;
    }

    public MessageDto createLike(int postId, PostLikeRequestDto userId) {
        if (postId == 0 || userId.getUserId() == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "400 Bad Request");
        }
        if(postLikeMapper.checkpost(postId) == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }
        if (postLikeMapper.checklike(postId, userId.getUserId()) != 0) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "409 Conflict");
        }

        postLikeMapper.createLike(postId, userId.getUserId());
        postLikeMapper.increaseLike(postId);
        MessageDto answer = new MessageDto("Like successfully added to the post.");
        return answer;
    }

    public MessageDto deleteLike(int postId, PostLikeRequestDto userId) {
        if (postId == 0 || userId.getUserId() == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "400 Bad Request");
        }
        if(postLikeMapper.checkpost(postId) == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }
        if (postLikeMapper.checklike(postId, userId.getUserId()) < 1) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "404 Not Found");
        }

        postLikeMapper.deleteLike(postId, userId.getUserId());
        postLikeMapper.decreaseLike(postId);
        MessageDto answer = new MessageDto("Like successfully deleted from the post.");
        return answer;
    }
}
