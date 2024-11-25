package com.example.pp_3_3_1.repository;

import com.example.pp_3_3_1.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
