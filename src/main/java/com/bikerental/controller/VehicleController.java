package com.bikerental.controller;

import com.bikerental.entities.bike.Bike;
import com.bikerental.service.vehicle.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/vehicles/bikes")
public class VehicleController {

    private final IVehicleService vehicleService;

    @Autowired
    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping(value = "/getBikeSpots", method = RequestMethod.GET)
    public String getAvailableBikesBySpot(@PathVariable("bookingID") String bikeSpotLocation, Map<String, List<Bike>> model) {
        model.put("bikespots",vehicleService.getAvailableBikesBySpot(bikeSpotLocation));
        return "SUCCESS";
    }

    @RequestMapping(value = "/startRentalTime", method = RequestMethod.GET)
    public String startRentalTime(@PathVariable("bookingID") String bookingID, Map<String, Boolean> model) {
        model.put("status",vehicleService.startRentalTime(bookingID));
        return "SUCCESS";
    }

    @RequestMapping(value = "/addBikes", method = RequestMethod.GET)
    public String startRentalTime(@PathVariable("bike") Bike bike, Map<String, Boolean> model) {
        model.put("status",vehicleService.addBikes(bike));
        return "SUCCESS";
    }

    @RequestMapping(value = "/deleteBike", method = RequestMethod.DELETE)
    public String deleteBike(@PathVariable("bike") Bike bike, Map<String, Boolean> model) {
        model.put("status",vehicleService.deleteBikes(bike));
        return "SUCCESS";
    }

    @RequestMapping(value = "/addBike", method = RequestMethod.POST)
    public String addBike(@PathVariable("bike") Bike bike, Map<String, Boolean> model) {
        model.put("status",vehicleService.addBikes(bike));
        return "SUCCESS";
    }

}
