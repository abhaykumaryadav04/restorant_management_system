package com.a4b.rest_management.service;

public class DeliveryAddressServiceImp implements  DeliveryAddressService{
      private static final double EARTH_RADIUS_KM=6371.0;

    @Override
    public double calculateDistance(double restaurantLatitude, double restaurantLongitude, double customerLatitude,
            double customerLongitude) {
     double latDistance=Math.toRadians( customerLatitude-restaurantLatitude);
     double logDistance=Math.toRadians(customerLongitude-restaurantLongitude);
      double a = Math.sin(latDistance / 2)* Math.sin(latDistance / 2)
                +
                Math.cos(Math.toRadians(restaurantLatitude))
                        * Math.cos(Math.toRadians(customerLatitude))
                        * Math.sin(logDistance / 2)
                        * Math.sin(logDistance / 2);
         double c = 2 * Math.atan2( Math.sqrt(a), Math.sqrt(1 - a) );
          return EARTH_RADIUS_KM * c;
    }

    @Override
    public boolean isWithinDeliveryRadius(double restaurantLatitude, double restaurantLongitude,
            double customerLatitude, double customerLongitude) {
                  return calculateDistance(
                restaurantLatitude,
                restaurantLongitude,
                customerLatitude,
                customerLongitude
        ) <= 30;
     
    }

}
