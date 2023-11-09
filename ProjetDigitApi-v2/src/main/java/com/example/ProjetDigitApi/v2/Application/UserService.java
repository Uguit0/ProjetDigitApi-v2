package com.example.ProjetDigitApi.v2.Application;

import com.example.ProjetDigitApi.v2.Domain.User;
import com.example.ProjetDigitApi.v2.Infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUser(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    public void addUser(User user) {
        user.setId(UUID.randomUUID());
        userRepository.save(user);
    }

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

}
