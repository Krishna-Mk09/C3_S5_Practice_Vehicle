/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.vehicle;

public class Bike extends VehicleManufacturer implements Vehicle {
    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType == "sportsBike") {
            return 300;
        }
        if (vehicleType == "crusier") {
            return 170;
        } else
            return 0;
    }

    public Bike() {
    }

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }


    @Override
    public String toString() {
        return "Bike{} " + super.toString();
    }
}

