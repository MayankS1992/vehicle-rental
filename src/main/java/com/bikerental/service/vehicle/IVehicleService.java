package com.bikerental.service.vehicle;

import com.bikerental.entities.bike.Bike;

import java.util.List;

public interface IVehicleService {

    List<Bike> getAvailableBikesBySpot(String bikeSpotLocation);

    Boolean startRentalTime(String bookingID);

    Boolean addBikes(Bike bike);

    Boolean deleteBikes(Bike bike);

    Boolean endRentalTime(String bookingID);

}
