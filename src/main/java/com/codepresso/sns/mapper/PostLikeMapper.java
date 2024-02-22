package com.codepresso.sns.mapper;

import com.codepresso.sns.vo.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostLikeMapper {
    public int createLike(int postId, int userId);

    public int deleteLike(int postId, int userId);

}
