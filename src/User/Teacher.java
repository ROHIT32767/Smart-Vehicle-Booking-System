package src.User;

import src.Payment.SalaryDeduction;

/**
 * The `Teacher` class is a subclass of the `User` class and implements the
 * `SalaryDeduction`
 * interface, representing a teacher with a department and designation.
 */
public class Teacher extends User implements SalaryDeduction {
    private String department;
    private String designation;

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public void setDesignation(String newDesignation) {
        this.designation = newDesignation;
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
     * related to a teacher.
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
