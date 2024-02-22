package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.mapper.PostMapper;
import com.codepresso.sns.vo.Post;
import com.codepresso.sns.vo.Tag;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    PostMapper postMapper;

    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public PostResponseDto createPost(PostCreateDto info){
        String allcontent=info.getContent();
        String[] contenttags=allcontent.split("#");
        info.setContent(contenttags[0]);//content만 따로 저장
        postMapper.createPost(info);
        Post post=postMapper.getNewOne();
        PostResponseDto answer=new PostResponseDto(post);
        String name= postMapper.findUserName(post.getPostId());
        answer.setUserName(name);
        String[] tags= Arrays.copyOf(contenttags, contenttags.length - 1);
        Tag temp;
        List<Tag> list=new ArrayList<>();
        for(String tag: tags){

        }
        return answer;
    }

    public List<PostResponseDto> findAllPost(int userId){
        List<PostResponseDto> list= postMapper.findAllPost();
        List<Integer> likelist=postMapper.findUserLike(userId);
        int i=0;
        for(PostResponseDto post: list){
            if(i>=likelist.size()){
                break;
            }
            else if(likelist.get(i)==post.getPostId()){
                post.setLikedByUser(true);
            }
            else{}
        }
        return list;
    }

    public List<PostLikeResponseDto> findAllPostByLike(int userId){
        List<PostResponseDto> responselist= postMapper.findAllPost();
        List<Integer> likelist=postMapper.findUserLike(userId);
        List<PostLikeResponseDto> list=new ArrayList<>();
        List<PostLikeCountDto> likecountlist=postMapper.countLikes();
        int i=0, j=0;
        PostLikeCountDto likeCountDto;
        PostLikeResponseDto temp;
        for(PostResponseDto post: responselist){
            if(i<likelist.size()&&likelist.get(i)==post.getPostId()){
                post.setLikedByUser(true);
                i++;
            }
            temp=new PostLikeResponseDto(post);
            if(j<likecountlist.size()) {
                likeCountDto = likecountlist.get(j);
                if(temp.getPostId()==likeCountDto.getPostId()){
                    ++j;
                    temp.setLikeCount(likeCountDto.getLikeCount());
                }
            }
            list.add(temp);
        }
        return list;
    }

    public PostUserDto findPostById(int id){
        String name=postMapper.findUserName(id);
        List<PostSimpleDto> list=postMapper.findPostById(id);
        PostUserDto answer=new PostUserDto(id, name, list);
        return answer;
    }

    public PostResponseDto updatePost(int postId, int userId, String content){
        Post post=postMapper.findPost(postId);
        postMapper.updatePost(postId, content);
        post=postMapper.findPost(postId);
        String username= postMapper.findUserName(userId);
        PostResponseDto answer=new PostResponseDto(post.getPostId(), post.getUserId(), username, post.getContent(), post.getCreatedAt(), post.getUpdatedAt());
        return answer;
    }

    public void deletePost (int postId){
        postMapper.deletePost(postId);
    }

}
