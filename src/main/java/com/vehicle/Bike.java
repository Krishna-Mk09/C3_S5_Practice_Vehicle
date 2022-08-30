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
        return 0;
    }

    public Bike() {
    }

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }
}
