package com.a4b.rest_management.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.a4b.rest_management.model.Address;

public interface AddressRepo extends JpaRepository<Address,Long>{
List<Address> findByUserId(Long userId);
}
