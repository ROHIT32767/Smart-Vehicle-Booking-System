package src;

import java.util.Date;

public class Transaction {
    private String id;
    private Date transactionDate;
    private double transactionAmount;
    private String transactionType;
    private String transactionStatus;
    private String transactionRemarks;
    private Trip transactionTrip;

    // Constructors (if needed)
    public String getId() {
        return id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public String getTransactionRemarks() {
        return transactionRemarks;
    }

    public Trip getTransactionTrip() {
        return transactionTrip;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public void setTransactionRemarks(String transactionRemarks) {
        this.transactionRemarks = transactionRemarks;
    }

    public void setTransactionTrip(Trip trip) {
        this.transactionTrip = trip;
    }

    /**
     * The function "updateTransaction" updates a transaction and returns whether
     * the update was successful
     * or not.
     * 
     * @return The method is returning a boolean value, either true or false, to
     *         indicate the success or
     *         failure of the transaction update.
     */

    public boolean updateTransaction() {
        // Implementation for updating the transaction
        return true; // Return success or failure
    }

    /**
     * The function "deleteTransaction" is used to delete a transaction and returns
     * a boolean value
     * indicating success or failure.
     * 
     * @return The method is returning a boolean value, either true or false, to
     *         indicate the success or
     *         failure of the transaction deletion.
     */
    public boolean deleteTransaction() {
        // Implementation for deleting the transaction
        return true; // Return success or failure
    }

    /**
     * The function "makeTransaction" in Java is used to perform a transaction and
     * returns a boolean value
     * indicating the success or failure of the transaction.
     * 
     * @return The makeTransaction() method is returning a boolean value, either
     *         true or false, indicating
     *         the success or failure of the transaction.
     */
    public boolean makeTransaction() {
        // Implementation for making the transaction
        return true; // Return success or failure
    }

    /**
     * The function "updateWallet" updates the wallet and returns a boolean value
     * indicating success or
     * failure.
     * 
     * @return The method is returning a boolean value, either true or false, to
     *         indicate the success or
     *         failure of the wallet update.
     */
    public boolean updateWallet() {
        // Implementation for updating the wallet
        return true; // Return success or failure
    }
}