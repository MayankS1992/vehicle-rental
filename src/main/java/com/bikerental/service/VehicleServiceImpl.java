package com.bikerental.service;

import com.bikerental.entities.bike.Bike;
import com.bikerental.service.vehicle.IVehicleService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehicleServiceImpl implements IVehicleService {

    @Override
    public List<Bike> getAvailableBikesBySpot(String bikeSpotLocation) {
        return null;
    }

    @Override
    public Boolean startRentalTime(String bookingID) {
        return null;
    }

    @Override
    public Boolean addBikes(Bike bike) {
        return null;
    }

    @Override
    public Boolean deleteBikes(Bike bike) {
        return null;
    }

    @Override
    public Boolean endRentalTime(String bookingID) {
        return null;
    }
}
