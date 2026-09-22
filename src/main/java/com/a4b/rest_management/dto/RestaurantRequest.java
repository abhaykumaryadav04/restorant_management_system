package com.a4b.rest_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder 
@Data
public class RestaurantRequest {
     @NotBlank
    private String name;

    private String description;

    private String phone;

    @Email
    private String email;

    @NotBlank
    private String address;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

}
