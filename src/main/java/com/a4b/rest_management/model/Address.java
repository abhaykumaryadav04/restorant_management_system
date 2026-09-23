package com.a4b.rest_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data 
public class Address {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
     @Column(nullable = false)
    private String houseNumber;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    private String state;
    private String postalCode;
    private Double latitude;
    private Double longitude;
    private boolean defaultAddress;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

}
