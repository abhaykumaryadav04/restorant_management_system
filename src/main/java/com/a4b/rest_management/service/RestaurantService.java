package com.a4b.rest_management.service;

import com.a4b.rest_management.model.Restaurant;

import java.util.List;

import com.a4b.rest_management.dto.*;

public interface RestaurantService {

 Restaurant createRestaurant(RestaurantRequest request);
 Restaurant getRestaurant(Long id);
 List<Restaurant> getAllRestaurant();
    
} 
