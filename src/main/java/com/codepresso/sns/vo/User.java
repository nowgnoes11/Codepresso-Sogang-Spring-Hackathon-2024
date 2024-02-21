package com.codepresso.sns.vo;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class User {
    int userId;
    String userName;
    String email ;
    String password;
    int postCount;
    int likeCount;
    int followingCount ;
    int followerCount;
    String introduction;
    String occupation ;
    LocalDateTime birthday;
    String city;
    LocalDateTime createdAt ;
    LocalDateTime updatedAt;

    public User(int userId, String userName, String email, String password, int postCount, int liekCount,
                int followingCount, int followerCount, String introduction, String occupation,
                LocalDateTime birthday, String city, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.postCount = postCount;
        this.likeCount = liekCount;
        this.followingCount = followingCount;
        this.followerCount = followerCount;
        this.introduction = introduction;
        this.occupation = occupation;
        this.birthday = birthday;
        this.city = city;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}
