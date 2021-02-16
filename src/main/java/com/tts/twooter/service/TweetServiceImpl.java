package com.tts.twooter.service;

import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.User;
import com.tts.twooter.repository.TweetRepository;

import java.util.List;

public class TweetServiceImpl implements TweetService{

    private TweetRepository tweetRepository;

    public TweetServiceImpl(TweetRepository tweetRepository){
        this.tweetRepository=tweetRepository;
    }

    @Override
    public List<Tweet> findAll() {
        return tweetRepository.findAllByOrderByCreatedAtDesc();
    }

    @Override
    public List<Tweet> findAllByUser(User user) {
        return tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
    }

    @Override
    public List<Tweet> findAllByUsers(List<User> users) {
        return tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
    }

    @Override
    public void save(Tweet tweet) {

    }
}
