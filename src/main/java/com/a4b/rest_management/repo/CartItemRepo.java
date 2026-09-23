package com.a4b.rest_management.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a4b.rest_management.model.CartItem;

public interface CartItemRepo extends  JpaRepository<CartItem,Long>{
    List<CartItem> findByCartId(Long cartId);

    Optional<CartItem> findByCartIdAndMenuItemId( Long cartId, Long menuItemId);
    void deleteByCartId(Long cartId);
} 
