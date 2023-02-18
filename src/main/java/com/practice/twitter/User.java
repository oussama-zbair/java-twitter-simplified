package com.practice.twitter;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Tweet> tweets;
    private List<User> followers;

    public User(String username) {
        this.username = username;
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
    }



    public String getUsername() {
        return username;
    }

    public void postTweet(String message) {
        Tweet tweet = new Tweet(this, message);
        tweets.add(tweet);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public void editTweet(Tweet tweet, String newMessage) {
         tweet.setMessage(newMessage);

    }

    public void follow(User user) {
        followers.add(user);
    }

    public void unfollow(User user) {
        followers.remove(user);
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public List<User> getFollowers() {
        return followers;
    }


}