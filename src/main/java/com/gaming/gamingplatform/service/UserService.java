package com.gaming.gamingplatform.service;

import com.gaming.gamingplatform.dto.User;
import com.gaming.gamingplatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setUsername(userDetails.getUsername());
            user.setEmail(userDetails.getEmail());

            if (userDetails.getPassword() != null && !userDetails.getPassword().trim().isEmpty()) {
                user.setPassword(userDetails.getPassword());
            }

            return userRepository.save(user);
        }).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<User> loginUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}

