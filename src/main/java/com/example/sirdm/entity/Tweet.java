package com.example.sirdm.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="tweet")
public class Tweet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name = "tweet_id")
    private int tweetId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "content")
    private String content;
    @Column(name = "post_time")
    private Timestamp postTime;

    public int getTweetId() {
        return tweetId;
    }

    public void setTweetId(int tweetId) {
        this.tweetId = tweetId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }
}
