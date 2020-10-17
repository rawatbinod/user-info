package com.binod.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binod.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
 