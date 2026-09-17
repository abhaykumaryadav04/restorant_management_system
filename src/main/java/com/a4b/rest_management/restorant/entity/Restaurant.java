package com.a4b.rest_management.restorant.entity;

import java.util.List;

import com.a4b.rest_management.restorant.ennummeration.IsOPen;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private IsOPen isOpen;
    private String address;
    private String phoneNo;
    @OneToMany(mappedBy = "restaurant")
    private List<MenuItems> menuItems;


}
