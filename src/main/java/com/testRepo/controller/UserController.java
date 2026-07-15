package com.testRepo.controller;

import com.testRepo.auth.*;
import com.testRepo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        User x = new User();
        x.setId(1L);
        ArrayList<User> ans = new ArrayList<>();
        ans.add(x);
        return ans;
        // return userService.getAllUsers();
    }

    @GetMapping("/{user}")
    public User getUserById(@PathVariable Long id) {
        return new User();
        // return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return new User();
        // return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        // userService.deleteUser(id);
    }
}