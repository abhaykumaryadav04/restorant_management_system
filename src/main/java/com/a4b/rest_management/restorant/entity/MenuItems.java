package com.a4b.rest_management.restorant.entity;

import com.a4b.rest_management.restorant.ennummeration.Available;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class MenuItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private double price;
    private String description;
    @Enumerated(EnumType.STRING)
    private Available isAvailable;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
