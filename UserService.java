package com.example.demo;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<String> users;

    @PostConstruct
    public void init() {
        user = new ArrayList<>();
        users.add("admin");
        users.add("user1");
    }

    public boolean addUser(String user) {
        if (users.contains(user)) {
            return false;
        }
        users.add(user);
        return true;
    }

    public void deleteUser(String user) {
        if (!user.isEmpty()) {
            users.remove(user);
        }
    }

    public List<String> getUsers() {
        return user;
    }
}
