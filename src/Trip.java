package src;

import java.util.Date;

import src.User.User;
import src.Vehicle.Vehicle;

// Define the package for Trip class
public class Trip {
    public enum StatusEnum {
        ONGOING,
        ENDED
    }

    // Private instance variables
    private Trip trip;
    private User user;
    private Vehicle vehicle;
    private StatusEnum status;
    private Double fare;
    private Transaction transaction;
    private Date startTime;
    private Date endTime;
    private Double distanceTravelled;
    private Boolean isReturnedOnTime;
    private Rating tripRating;
    private DockingStation tripStartLocation;
    private DockingStation tripEndLocation;

    // Getter methods
    public Trip getTrip() {
        return trip;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public Double getFare() {
        return fare;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Transaction getTransaction(){
        return transaction;
    }

    public Double getDistanceTravelled() {
        return distanceTravelled;
    }

    public Rating getTripRating(){
        return tripRating;
    }

    public DockingStation getTripStartLocation(){
        return tripStartLocation;
    }

    public DockingStation getTripEndLocation(){
        return tripEndLocation;
    }

    public Boolean getIsReturnedOnTime() {
        return isReturnedOnTime;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setDistanceTravelled(Double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void setIsReturnedOnTime(Boolean isReturnedOnTime) {
        this.isReturnedOnTime = isReturnedOnTime;
    }

    /**
     * The function calculateCost returns the cost as a Double.
     * 
     * @return The method is currently returning a Double value of 0.0.
     */
    public Double calculateCost() {
        // Implement calculateCost logic here
        return 0.0; // Replace with actual logic
    }
}
