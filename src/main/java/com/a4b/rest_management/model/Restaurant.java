package com.a4b.rest_management.model;

import java.util.List;

import com.a4b.rest_management.ennumeration.IsOPen;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String description;
    @Enumerated(EnumType.STRING)
    private IsOPen isOpen;
    private String address;
    private String phoneNo;
    @OneToMany(mappedBy = "restaurant")
    private List<MenuItems> menuItems;
    private Double latitude;
    private Double longitude;
    @ManyToOne
    @JoinColumn(name = "admin_id")
      private User admin;
      private boolean active;


}
