package com.example.swagger_demo.controller;

import com.example.swagger_demo.model.User;
import com.example.swagger_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

   
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
    if (userRepository.count() <= 1 || !userRepository.existsById(id)) {
            return null;
        }

        userRepository.deleteById(id);
        return "User deleted successfully.";
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        if (!userRepository.existsById(id)) {
            return null;
        }
        User existingUser = userRepository.findById(id).get();
        existingUser.setName(updatedUser.getName());
        return userRepository.save(existingUser);
    }



}
