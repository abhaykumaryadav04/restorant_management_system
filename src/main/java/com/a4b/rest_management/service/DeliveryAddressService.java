package com.a4b.rest_management.service;

public interface DeliveryAddressService {
 double calculateDistance( double restaurantLatitude, double restaurantLongitude,double customerLatitude,
            double customerLongitude );

    boolean isWithinDeliveryRadius( double restaurantLatitude,double restaurantLongitude,
            double customerLatitude,double customerLongitude );
}
