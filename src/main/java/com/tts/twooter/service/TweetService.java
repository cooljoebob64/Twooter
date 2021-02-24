package com.tts.twooter.service;

import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.TweetDisplay;
import com.tts.twooter.model.User;

import java.util.List;

public interface TweetService {
    List<TweetDisplay> findAll();
    List<TweetDisplay> findAllByUser(User user);
    List<TweetDisplay> findAllByUsers(List<User> users);
    List<TweetDisplay> findAllWithTag(String tag);
    void save(Tweet tweet);
}
