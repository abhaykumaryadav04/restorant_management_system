package com.a4b.rest_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a4b.rest_management.dto.MenuItemRequest;
import com.a4b.rest_management.ennumeration.Available;
import com.a4b.rest_management.model.MenuItem;
import com.a4b.rest_management.repo.CatagoryRepo;
import com.a4b.rest_management.repo.MenuItemRepo;

@Service 
public class MenuItemServiceImp  implements  MenuItemService{
    @Autowired
    private MenuItemRepo menuItemRepo;
    @Autowired 
    private CatagoryRepo catagoryRepo;

    @Override
    public MenuItem createMenuItem(MenuItemRequest request) {
     MenuItem item=MenuItem.builder().description(request.getDescription())
                                     .imageUrl(request.getImageUrl())
                                     .price(request.getPrice())
                                     .isAvailable(Available.YES)
                                     .category(catagoryRepo.findById(request.getCategoryId()).orElseThrow(()->new RuntimeException("Catagory missing")))
                                     .vegetarian(request.isVegetarian())
                                     .build();
      return menuItemRepo.save(item);
                                     
   
    }

    @Override
    public List<MenuItem> getMenuItemByCatagory(Long catagoryItem) {
     return menuItemRepo.findByCatagoryId(catagoryItem);
   
    }

}
