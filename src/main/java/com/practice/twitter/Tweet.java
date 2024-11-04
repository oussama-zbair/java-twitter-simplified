package com.practice.twitter;

public class Tweet {
    private User author;
    private String message;

    public Tweet(User author, String message) {
        this.author = author;
        this.message = message;
    }


    public String getMessage(){
        return message;
    }

    public void setMessage(String message) {
        this.message = message;

    }

}
