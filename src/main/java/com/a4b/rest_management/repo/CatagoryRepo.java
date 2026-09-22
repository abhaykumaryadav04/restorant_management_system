package com.a4b.rest_management.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a4b.rest_management.model.MenuCatagory;
@Repository 
public interface CatagoryRepo extends JpaRepository<MenuCatagory,Long>{
List<MenuCatagory> findByRestaurantId(Long id);
}
