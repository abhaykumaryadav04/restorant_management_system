package com.a4b.rest_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.a4b.rest_management.dto.AddressRequest;
import com.a4b.rest_management.model.Address;
import com.a4b.rest_management.model.User;
import com.a4b.rest_management.repo.AddressRepo;
import com.a4b.rest_management.repo.UserRepo;

public class AddressServiceImp implements AddressService {
    @Autowired 
    private AddressRepo addressRepo;
    @Autowired 
    private UserRepo userRepo;

    @Override
    public Address createAddress(AddressRequest request) {
      User user=userRepo.findById(request.getUserId()).orElseThrow(()->new RuntimeException("User not found") );
      Address address=Address.builder().city(request.getCity())
                                       .houseNumber(request.getHouseNumber())
                                       .latitude(request.getLatitude())
                                       .longitude(request.getLongitude())
                                       .postalCode(request.getPostalCode())
                                       .state(request.getState())
                                       .street(request.getStreet())
                                       .build();
        return addressRepo.save(address);

    @Override
    public List<Address> getUserAddresses(Long id) {
       return addressRepo.findByUserId(id);
    }

}
