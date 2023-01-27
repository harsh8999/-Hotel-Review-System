package com.harsh.userservice.userservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.userservice.userservice.Entity.User;

public interface UserRepository extends JpaRepository<User, String>{
    
}
