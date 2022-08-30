/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.vehicle;

public class VehicleManufacturerImpl {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike.toString());
        System.out.println(bike.maxSpeed("sportsBike"));
        Car car = new Car();
        System.out.println(car.maxSpeed("sedan"));

    }
}
