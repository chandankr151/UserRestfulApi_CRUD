package com.chandan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandan.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
