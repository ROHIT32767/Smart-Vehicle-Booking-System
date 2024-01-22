package src.User;
import src.Payment.SalaryDeduction;

public class Staff extends User implements SalaryDeduction {
    private String staffID;
    private String designation;

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * The function creates a new account. Implementation of the Abstract method
     * from User
     */
    @Override
    public void createAccount() {
        // Implementation of new account Creation
    }

    /**
     * The function "uploadId" is used to implement the process of uploading an ID
     * related to a staff.
     */
    @Override
    public void uploadId() {
        // implementation of Id upload related to Student
    }

    /**
     * Implementing the interface `SalaryDeduction`
     * Transfer money from salary to Wallet
     * Internally uses the User::addMoneyToWallet()
     * @param amount : the Amount to be transferred
     */
    @Override
    public void deductFromSalary(double amount) {

    };
}
