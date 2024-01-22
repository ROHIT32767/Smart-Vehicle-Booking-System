package src.Vehicle;

import src.Location;

public class Vehicle implements Location {
    public enum VehicleStatus {
        DOCKED,
        IN_USE
    }

    private String id;
    private String location;
    private String qrcode;
    private VehicleStatus vehicleStatus;
    private String color;
    private double tyrePressure;

    public String getVehicleID() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getQrcode() {
        return qrcode;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public String getColor() {
        return color;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }

    public void setVehicleID(String vehicleID) {
        this.id = vehicleID;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTyrePressure(double tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    /**
     * The reserveVehicle method returns true if the vehicle reservation is
     * successful, and false
     * otherwise.
     * 
     * @return The reserveVehicle method is returning a boolean value. In this case,
     *         it is returning true.
     */
    public boolean reserveVehicle() {
        // Implementation of reserveVehicle method
        // Return true if successful, false otherwise
        return true;
    }

    /**
     * The returnVehicle method returns true if the vehicle return is successful,
     * and false otherwise.
     * 
     * @return The returnVehicle method is returning a boolean value.
     */
    public boolean returnVehicle() {
        // Implementation of returnVehicle method
        // Return true if successful, false otherwise
        return true;
    }

    @Override // Location Interface
    // The `getCurrentLocation()` method is an implementation of the
    // `getCurrentLocation()` method from the
    // `Location` interface. This implementation is a placeholder and can be
    // modified to return the actual current location of the vehicle.
    public String getCurrentLocation() {
        return "dummy";
    }
}
