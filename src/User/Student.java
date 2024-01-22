package src.User;
import src.Payment.FeePayment;

/**
 * The Student class extends the User class and implements the FeePayment interface, and it contains
 * attributes and methods related to a student's roll number, year, branch, account creation, ID
 * upload, and fee payment.
 */
public class Student extends User implements FeePayment{
    private String rollNo;
    private int year;
    private String branch;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
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
     * related to a student.
     */
    @Override
    public void uploadId() {
        // implementation of Id upload related to Student
    }

    /**
     * Implements the Interface `FeePayment`
     * Transfer money from fee to Wallet
     * Internally uses the User::addMoneyToWallet()
     * @param amount : the Amount to be transferred
     */
    @Override
    public void payFromFee(double amount){
        // Implementation of Add To Fee
    };
}
