package src.User;
import java.util.List;

import src.Trip;
import src.Wallet;
import src.Payment.UpiPayment;

/**
 * The User class is an abstract class that represents a user in a system and provides methods for
 * managing user details, authentication, and Trip History.
 */
abstract public class User implements UpiPayment {
    private String id;
    private String email;
    private String password;
    private boolean autoDeductFromWallet;
    private Wallet wallet;
    private List<Trip> tripHistory;
    private boolean isVerified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAutoDeductFromWallet() {
        return autoDeductFromWallet;
    }

    public void setAutoDeductFromWallet(boolean autoDeduct) {
        this.autoDeductFromWallet = autoDeduct;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public List<Trip> getTripHistory() {
        return tripHistory;
    }

    public void setTripHistory(List<Trip> tripHistory) {
        this.tripHistory = tripHistory;
    }


    public boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean verified) {
        this.isVerified = verified;
    }

    /**
     * Iterates over All available User objects and returns the one that matches with the email and password
     * @param email
     * @param password
     * @return User Object
     */
    public static User login(String email, String password) {
        return null;
    }

    /**
     * To Create a new Account. Implementation upto the inherited Class.
     */
    public abstract void createAccount();

    /**
     * To Upload Id. Implementation upto the inherited Class.
     */
    public abstract void uploadId();

    /**
     * Method to be used in the implementation of the payment interfaces by Sub-Classes to add some amount to Wallet.
     * Internally Uses Wallet::addMoney()
     * @param amount
     */
    protected void addMoneyToWallet(double amount) {
        // Implementation of addMoneyToWallet method
    }

    /**
     * Add a Trip Object the the Users' History
     * @param trip
     */
    public void addTripToHistory(Trip trip) {
        // Implementation of addTripToHistory method
    }

    /**
     * The getUserDetails method returns an object representing user details.
     * @return an object representing user details.
     */
    public Object getUserDetails() {
        // Implementation of getUserDetails method
        return null;
    }

    /**
     * The function makeUpiPayment is an implementation of the UpiPayment interface method.
     * Internally Uses User::addMoneyToWallet()
     * @param amount The amount parameter represents the amount of money that needs to be paid using
     * UPI (Unified Payments Interface).
     */
    @Override
    public void makeUpiPayment(double amount) {
        // Implementation of UpiPayment interface method
    }
}
