/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.vehicle;

public class Car extends VehicleManufacturer implements Vehicle {

    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType == "sportscar") {
            return 300;
        }
        if (vehicleType == "sedan") {
            return 170;
        }

        return 0;
    }
}
