package com.a4b.rest_management.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a4b.rest_management.model.MenuItem;

public interface MenuItemRepo extends  JpaRepository<MenuItem,Long>{
List<MenuItem> findByCatagoryId(Long id);
}
