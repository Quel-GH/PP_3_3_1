package com.example.pp_3_3_1.service;

import com.example.pp_3_3_1.model.UserEntity;
import com.example.pp_3_3_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }


    public void addUser(UserEntity user) {
        userRepository.save(user);
    }

    public void updateUser(Long id, String name, String lastName) {
        userRepository.save(new UserEntity(id, name, lastName));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
