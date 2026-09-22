package com.a4b.rest_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a4b.rest_management.dto.RestaurantRequest;
import com.a4b.rest_management.model.Restaurant;
import com.a4b.rest_management.repo.RestaurantRepo;

@Service 
public class RestaurantServiceImp implements RestaurantService {
    @Autowired 
    private RestaurantRepo restaurantRepo;

    @Override
    public Restaurant createRestaurant(RestaurantRequest request) {
    Restaurant restaurant=Restaurant.builder().address(request.getAddress())
                                              .description(request.getDescription())
                                              .latitude(request.getLatitude())
                                              .longitude(request.getLongitude())
                                              .phoneNo(request.getPhone())
                                              .name(request.getName())
                                              .email(request.getEmail())
                                              .active(true)
                                              .build();
      return restaurantRepo.save(restaurant);
    }

    @Override
    public Restaurant getRestaurant(Long id) {

   return restaurantRepo.findById(id).orElseThrow(()-> new  RuntimeException("Restaurant not available"));

    }

    @Override
    public List<Restaurant> getAllRestaurant() {
         return restaurantRepo.findAll();
     }


}
