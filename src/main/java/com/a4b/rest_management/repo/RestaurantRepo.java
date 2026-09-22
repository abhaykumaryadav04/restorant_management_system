package com.a4b.rest_management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a4b.rest_management.model.Restaurant;
@Repository 
public interface RestaurantRepo extends JpaRepository<Restaurant,Long> {

}
