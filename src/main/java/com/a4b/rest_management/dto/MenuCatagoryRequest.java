package com.a4b.rest_management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder 
@Data 
public class MenuCatagoryRequest {
      @NotBlank
    private String name;

    private String description;

    @NotNull
    private Long restaurantId;

}
