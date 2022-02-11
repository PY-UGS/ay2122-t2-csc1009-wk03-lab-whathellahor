import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        double annualInterestRate, loanAmount;
        int numberOfYears;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        annualInterestRate = userInput.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        numberOfYears = userInput.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        loanAmount = userInput.nextDouble();

        Loan loan1 = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("The loan was created on " + loan1.getLoanDate());

        System.out.println("The monthly payment is " + String.format("%.2f",loan1.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f",loan1.getTotalPayment()));

        userInput.close();
    }
}