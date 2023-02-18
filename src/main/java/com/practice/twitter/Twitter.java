package com.practice.twitter;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private List<User> users;

    public Twitter() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }


}
