/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.vehicle;

public class VehicleManufacturerImpl {
    /**
     * The main function is the entry point of the program
     */
    public static void main(String[] args) {
        Bike bike = new Bike("sportsbike", "12334", "bike");
        System.out.println(bike);
        System.out.println(" The speed of the Bike is : " + bike.maxSpeed("sportsBike") + "km/h");
        Car car = new Car("sportsCar", "1234", "car");
        System.out.println(car);
        System.out.println(" The speed of the car is : " + car.maxSpeed("sedan") + "km/hr");

    }
}
