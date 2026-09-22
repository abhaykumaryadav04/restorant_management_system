package com.a4b.rest_management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a4b.rest_management.model.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant,Long> {

}
