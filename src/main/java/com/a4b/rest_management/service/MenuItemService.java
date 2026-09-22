package com.a4b.rest_management.service;

import java.util.List;

import com.a4b.rest_management.dto.MenuItemRequest;
import com.a4b.rest_management.model.MenuItem;

public interface MenuItemService {

    MenuItem createMenuItem(MenuItemRequest request);
    List<MenuItem> getMenuItemByCatagory(Long catagoryItem);

}
