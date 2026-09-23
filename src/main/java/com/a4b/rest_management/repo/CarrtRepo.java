package com.a4b.rest_management.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a4b.rest_management.model.Cart;

public interface CarrtRepo extends JpaRepository<Cart,Long> {
    Optional<Cart> findByUserId(Long userId);

}
