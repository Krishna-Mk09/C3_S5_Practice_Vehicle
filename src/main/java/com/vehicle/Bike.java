/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.vehicle;

public class Bike extends VehicleManufacturer implements Vehicle {
    @Override
    // This method is used to calculate the maximum speed of the vehicle.
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

    // This is a constructor of the class Bike.
    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }


    // This is a method which is used to print the details of the object.
    @Override
    public String toString() {
        return "Bike{} " + super.toString();
    }
}

