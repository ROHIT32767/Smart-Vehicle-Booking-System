package src;

import src.User.User;
import java.util.List;

// Define the package for SupportFeedback class
public class SupportFeedback {
    // Private instance variables
    private String id;
    private User user;
    private List<String> tags;
    private String description;
    private static List<String> supportDocs;

    // Getter methods
    public String getTicketId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getDescription() {
        return description;
    }

    public static List<String> getSupportDocs() {
        return supportDocs;
    }

    // Setter methods
    public void setTicketId(String ticketId) {
        this.id = ticketId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Other methods
    public Boolean raiseTicket() {
        // Implement raiseTicket logic here
        return false; // Replace with actual logic
    }

    public List<String> accessSupportDocs() {
        // Implement accessSupportDocs logic here
        return null; // Replace with actual logic
    }

    public Boolean closeTicket() {
        // Implement closeTicket logic here
        return false; // Replace with actual logic
    }

    public Boolean submitFeedback() {
        // Implement submitFeedback logic here
        return false; // Replace with actual logic
    }
}
