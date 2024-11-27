package com.example.pp_3_3_1.service;

import com.example.pp_3_3_1.model.UserEntity;
import com.example.pp_3_3_1.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public void addUser(UserEntity user) {
        userRepository.save(user);
    }

    @Transactional
    public void updateUser(Long id, String name, String lastName) {
        userRepository.save(new UserEntity(id, name, lastName));
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
