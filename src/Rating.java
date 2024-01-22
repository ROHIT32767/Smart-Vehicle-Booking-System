package src;

public class Rating {
    // Public instance variable
    public String id;

    // Private instance variables
    private Trip trip;
    private int stars;
    private String feedback;

    // Getter methods
    public String getRatingID() {
        return id;
    }

    public Trip getTrip() {
        // Implement getTripID logic here or return null if Trip class is not defined
        return trip;
    }

    public int getStars() {
        return stars;
    }

    public String getFeedback() {
        return feedback;
    }

    // Setter methods
    public void setRatingID(String ratingID) {
        this.id = ratingID;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
        // Implement setTripID logic here or ignore if Trip class is not defined
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
