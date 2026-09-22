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

import com.a4b.rest_management.dto.MenuItemRequest;
import com.a4b.rest_management.model.MenuItem;
import com.a4b.rest_management.service.MenuItemService;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/api/menu-item")
public class MenuItemController {
    @Autowired 
    private MenuItemService menuItemService;

    @PostMapping ("/create")
    public ResponseEntity<MenuItem> createMenuItem(@RequestBody  @Valid  MenuItemRequest request){
        return ResponseEntity.ok(menuItemService.createMenuItem(request));
    }
    @GetMapping ("/catatogry/{catagoryId}")
    public ResponseEntity<List<MenuItem>> getMenuItemByCatagory(@PathVariable  Long cataogryId){
        return ResponseEntity.ok(menuItemService.getMenuItemByCatagory(cataogryId));
    }

}
