package com.example.sirdm.controller;

import com.example.sirdm.dao.UserRepository;
import com.example.sirdm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/alluser")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
