package com.a4b.rest_management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.a4b.rest_management.dto.AddressRequest;
import com.a4b.rest_management.model.Address;
import com.a4b.rest_management.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public ResponseEntity<Address> createAddress( @Valid @RequestBody AddressRequest request) {

        return ResponseEntity.ok( addressService.createAddress(request) );
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Address>> getUserAddresses( @PathVariable Long userId) {
        return ResponseEntity.ok(addressService.getUserAddresses(userId) );
    }
}