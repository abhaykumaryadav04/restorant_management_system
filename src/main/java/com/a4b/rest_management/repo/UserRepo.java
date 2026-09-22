package com.a4b.rest_management.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a4b.rest_management.model.User;

public interface UserRepo extends JpaRepository<User,Long>{
Optional<User> findByEmail(String email);
}
