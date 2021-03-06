package com.bikerental.entities.booking;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Represents a booking for a bike
 */
@Data
public class Booking {
    // booking id
    private String bookingId;
    // represents id of the bike that was booked
    private String bikeId;
    // the spot from which the bike was taken from
    private String bikeSpot;
    // type of booking
    private BookingType bookingType;
    // status of the booking, whether the booking was cancelled
    private boolean status;
    // userID
    private String username;
    // start time for the bike
    private Timestamp startTime;
    // end time for the bike
    private Timestamp endTime;
    //Flag for active Booking
    private boolean activeBooking;
}
