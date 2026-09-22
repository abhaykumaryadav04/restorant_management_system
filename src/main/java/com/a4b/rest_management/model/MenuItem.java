package com.a4b.rest_management.model;

import java.math.BigDecimal;

import com.a4b.rest_management.ennumeration.Available;

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
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private BigDecimal price;
    private String description;
    @Enumerated(EnumType.STRING)
    private Available isAvailable;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    private String imageUrl;
      private boolean vegetarian;
       @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private MenuCatagory category;
}
