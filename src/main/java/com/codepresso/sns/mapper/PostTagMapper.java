package com.codepresso.sns.mapper;

import com.codepresso.sns.vo.Tag;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostTagMapper {
    public int createTag(String tag);
    public Tag getNewOne
}
