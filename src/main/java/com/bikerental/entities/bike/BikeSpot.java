package com.bikerental.entities.bike;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Represents where bikes can be located
 */
@Data
public class BikeSpot {
    // bike sport id
    @Id
    private String id;
    // name of the bike spot
    private String name;
    // number of bikes available at this spot
    private int availableBikes;
}
