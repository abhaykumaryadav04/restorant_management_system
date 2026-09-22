package com.a4b.rest_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class Cart {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long id;
   @OneToOne
   @JoinColumn (name = "CustomerId")
   private User customer;
   
}
