package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.PostLikeRequestDto;
import com.codepresso.sns.mapper.PostLikeMapper;
import org.springframework.stereotype.Service;

@Service
public class PostLikeService {
    PostLikeMapper postLikeMapper;

    public PostLikeService(PostLikeMapper postLikeMapper) {
        this.postLikeMapper = postLikeMapper;
    }

    public MessageDto createLike(int postId, PostLikeRequestDto userId){
        postLikeMapper.createLike(postId, userId.getUserId());
        postLikeMapper.increaseLike(postId);
        MessageDto answer=new MessageDto("Like successfully added to the post.");
        return answer;
    }

    public MessageDto deleteLike(int postId, PostLikeRequestDto userId){
        postLikeMapper.deleteLike(postId, userId.getUserId());
        postLikeMapper.decreaseLike(postId);
        MessageDto answer=new MessageDto("Like successfully deleted from the post.");
        return answer;
    }
}
