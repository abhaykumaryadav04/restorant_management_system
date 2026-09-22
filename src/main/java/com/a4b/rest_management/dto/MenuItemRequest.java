package com.a4b.rest_management.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data 
@Entity 
public class MenuItemRequest {
    @NotBlank
    private String name;

    private String description;

    @NotNull
    private Double price;

    private String imageUrl;

    private boolean vegetarian;

    @NotNull
    private Long categoryId;
}
