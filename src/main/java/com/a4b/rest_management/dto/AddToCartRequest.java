package com.a4b.rest_management.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder 
public class AddToCartRequest {
 @NotNull
    private Long userId;

    @NotNull
    private Long menuItemId;

    @NotNull
    @Min(1)
    private Integer quantity;
}
