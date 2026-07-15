package com.testRepo.service;

import com.testRepo.auth.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public User createUser(User user) {
        return new User();
        // return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        ArrayList<User> ans = new ArrayList<>();
        User x = new User();
        x.setId(4L);
        ans.add(x);
        return ans;
        // return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return new User();
        // return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User user) {
        user.setId(id);
        return user;
        // return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        // userRepository.deleteById(id);
    }
}