package com.a4b.rest_management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class AddressRequest {
    @NotBlank
    private String houseNumber;

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    private String state;
    private String postalCode;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    private boolean defaultAddress;

    @NotNull
    private Long userId;

}
