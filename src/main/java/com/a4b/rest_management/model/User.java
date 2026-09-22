package com.a4b.rest_management.model;

import com.a4b.rest_management.ennumeration.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class User {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column (nullable = false,unique = true)
    private String email;
    @Column (nullable = false)
    private String phoneName;
    @Column (nullable = false)
    private String password;
     @Enumerated(EnumType.STRING)
    private Role role;
}
