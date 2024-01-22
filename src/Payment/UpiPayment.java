package src.Payment;

public interface UpiPayment {
    /**
     * The function makeUpiPayment takes in a double amount and performs a UPI payment.
     * 
     * @param amount The amount parameter is a double data type, which means it can store decimal
     * numbers. It represents the amount of money that will be used for the UPI payment.
     */
    void makeUpiPayment(double amount);
}
