package com.a4b.rest_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a4b.rest_management.dto.RestaurantRequest;
import com.a4b.rest_management.model.Restaurant;

import com.a4b.rest_management.service.RestaurantService;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/api/restaurant")
public class RestaurantController {
   
    @Autowired 
    private RestaurantService restaurantService;

    @PostMapping ("/create")
    public ResponseEntity<Restaurant> createrestaurant(@RequestBody @Valid   RestaurantRequest request){
     
        return ResponseEntity.ok(restaurantService.createRestaurant(request));
    }
     @GetMapping ("/find/restaurant/")
    public ResponseEntity<List<Restaurant>> getAllRestaurant(){
        return ResponseEntity.ok(restaurantService.getAllRestaurant());
    }
    @GetMapping ("/find/restaurant/{id}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable  Long id){
        return ResponseEntity.ok(restaurantService.getRestaurant(id));
    }
}
