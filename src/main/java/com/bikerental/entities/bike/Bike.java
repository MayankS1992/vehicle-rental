package com.bikerental.entities.bike;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import javax.persistence.OneToOne;

/**
 * Represents a bike
 */
@Data
@Repository
@Document(collection = "Bike")
public class Bike {
    // bike's id
    @Id
    private long bikeId;
    // location of the bike
    private BikeLocation location;
    // spot where the bike is located
    private String bikeSpot;
    // type of bike
    @OneToOne
    private BikeType bikeType;
    // bike state
    @OneToOne
    private BikeStatus bikeStatus;
    // deleted status
    private boolean deleted;
    //Actual Rate/Hr
    private String rate;
}
