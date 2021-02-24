package com.tts.twooter.service;

import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.User;

import java.util.List;

public interface TweetService {
    List<Tweet> findAll();
    List<Tweet> findAllByUser(User user);
    List<Tweet> findAllByUsers(List<User> users);
    List<Tweet> findAllWithTag(String tag);
    void save(Tweet tweet);
}
