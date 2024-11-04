package com.practice.twitter;

public class Main {
     public static void main(String[] args) {
         User user1 = new User("elonmusk");
         User user2 = new User("Oussama");

         user2.follow(user1);
         user1.postTweet("Going offline for a while");
         user2.postTweet("Hello World!");

         Twitter twitter = new Twitter();
         twitter.addUser(user1);
         twitter.addUser(user2);

         for (User user : twitter.getUsers()) {
             System.out.println(user.getUsername() + "'s tweets:");
             for (Tweet tweet : user.getTweets()) {
                 System.out.println("  - " + tweet.getMessage());
             }

         }
     }
}