/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.vehicle;

public class Car extends VehicleManufacturer implements Vehicle {

    public Car() {
    }

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    // Overriding the method maxSpeed() in the interface Vehicle.
    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType == "sportscar") {
            return 300;
        }
        if (vehicleType == "sedan") {
            return 170;
        } else

            return 0;
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
