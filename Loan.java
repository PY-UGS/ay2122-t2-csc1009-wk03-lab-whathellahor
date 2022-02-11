import java.util.Date;

public class Loan{
    // Declaring variables
    private double annualInterestRate, loanAmount, monthlyPayment, totalPayment;
    private int numberOfYears;

    // Constructor for default values
    public Loan(){
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
    }

    // Do we even need this???
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    // Getters and setters --
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public Date getLoanDate() {
        return new java.util.Date();
    }

    // Calculating monthly payment
    public double getMonthlyPayment(){
        double monthlyInterestRate = (annualInterestRate/100)/12;
        monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
        return monthlyPayment;
    }

    // Calculating total payment
    public double getTotalPayment(){
        totalPayment = monthlyPayment * numberOfYears * 12;
        return totalPayment;
    }
}