package com.a4b.rest_management.service;

import java.util.List;

import com.a4b.rest_management.dto.AddressRequest;
import com.a4b.rest_management.model.Address;

public interface AddressService {
 Address createAddress(AddressRequest request);
 List<Address> getUserAddresses(Long id);
    
}
