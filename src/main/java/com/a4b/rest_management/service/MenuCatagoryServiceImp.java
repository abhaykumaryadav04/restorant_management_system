package com.a4b.rest_management.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.a4b.rest_management.dto.MenuCatagoryRequest;
import com.a4b.rest_management.model.MenuCatagory;
import com.a4b.rest_management.repo.CatagoryRepo;
import com.a4b.rest_management.repo.RestaurantRepo;

public class MenuCatagoryServiceImp implements MenucatagoryService {
    @Autowired 
    private CatagoryRepo catagoryRepo;
    @Autowired 
    private RestaurantRepo restaurantRepo;

    @Override
    public MenuCatagory createMenuCatagory(MenuCatagoryRequest request) {
     MenuCatagory catagory=MenuCatagory.builder().active(true)
                                                 .description(request.getDescription())
                                                 .name(request.getName())
                                                 .restaurant(restaurantRepo.findById(request.getRestaurantId()).orElseThrow(()-> new RuntimeException("Restaurant doe not exist")))
                                                 .build();
    return catagoryRepo.save(catagory);

    }

    @Override
    public List<MenuCatagory> getCatagoriesByRestaurant(Long restaurantId) {
     
        List<MenuCatagory> catagories=catagoryRepo.findByRestaurantId(restaurantId);
     return catagories;
    }

}
