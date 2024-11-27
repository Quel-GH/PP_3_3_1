package com.example.pp_3_3_1.service;

import com.example.pp_3_3_1.model.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> getAllUsers();


    public void addUser(UserEntity user);

    public void updateUser(Long id, String name, String lastName);

    public void deleteUser(Long id);
}
