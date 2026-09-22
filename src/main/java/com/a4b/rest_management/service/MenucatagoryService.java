package com.a4b.rest_management.service;

import java.util.List;

import com.a4b.rest_management.dto.MenuCatagoryRequest;
import com.a4b.rest_management.model.MenuCatagory;

public interface MenucatagoryService {

    MenuCatagory createMenuCatagory(MenuCatagoryRequest request);
    List<MenuCatagory> getCatagoriesByRestaurant(Long restaurantId);
}
