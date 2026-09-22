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

import com.a4b.rest_management.dto.MenuCatagoryRequest;
import com.a4b.rest_management.model.MenuCatagory;
import com.a4b.rest_management.service.MenucatagoryService;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/api/restaurant/catagory")
public class CatagoryController {
  @Autowired 
  private MenucatagoryService menucatagoryService;

  @PostMapping ("/create")
  public ResponseEntity<MenuCatagory> createCatagory(@RequestBody @Valid  MenuCatagoryRequest request){
    return ResponseEntity.ok(menucatagoryService.createMenuCatagory(request));
  }

  @GetMapping ("/restaurant/{restaurantId}")
  public ResponseEntity<List<MenuCatagory>> getRestautantCataogries(@PathVariable  Long restaurantId){
  return ResponseEntity.ok(menucatagoryService.getCatagoriesByRestaurant(restaurantId));
  }
}
