package Chapter_9;

import java.util.Date;

public class Account {
    
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();
    
    Account() {
        id = 0;
        balance = 0;
    }
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    void deposit(double ammount) {
        balance += ammount;
    }
    void withdraw(double ammount) {
        balance -= ammount;
    }
    static void setAnnualInterestingRate(double newRate) {
        annualInterestRate = newRate;
    }
    
    int getID() {
        return id;
    }
    double getBalance() {
        return balance;
    }
    double getAnnualInterestingRate() {
        return annualInterestRate;
    }
    String getDateCreated() {
        return dateCreated.toString();
    }
    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    double getMonthlyInterest() {
        return getMonthlyInterestRate() / 100 * balance;
    }
    
}
