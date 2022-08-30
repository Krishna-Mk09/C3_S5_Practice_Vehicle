/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.vehicle;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;

    public VehicleManufacturer() {
    }

    public VehicleManufacturer(String vehicleName, String vehicleModelName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelName = vehicleModelName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;

    }

    @Override
    public String toString() {
        return "VehicleManufacturer{" + "vehicleName='" + vehicleName + '\'' + ", vehicleModelName='" + vehicleModelName + '\'' + ", vehicleType='" + vehicleType + '\'' + '}';
    }

    public String getManufacturerInformation() {


        return toString();
    }
}
