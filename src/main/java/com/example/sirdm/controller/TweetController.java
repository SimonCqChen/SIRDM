package com.example.sirdm.controller;

import com.example.sirdm.dao.TweetRepository;
import com.example.sirdm.entity.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TweetController {
    @Autowired
    TweetRepository tweetRepository;

//    @RequestMapping(name = "/alltweet", method = RequestMethod.GET)
//    public List<Tweet> getAllTweets() {
//        return tweetRepository.findAll();
//    }
}
