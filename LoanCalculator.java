package Java;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for loan amount, interest rate and number of years
        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        
        // Asking user to select interest type
        System.out.println("Select interest type: 1.Simple Interest 2.Compound Interest");
        int interestType = sc.nextInt();
        
        //Calculating the interest based on user's choice
        double interest = 0;
        if (interestType == 1) {
            interest = (loanAmount * interestRate * years) / 100;
        } else if (interestType == 2) {
            interest = loanAmount * Math.pow((1 + (interestRate / 100)), years) - loanAmount;
        } else {
            System.out.println("Invalid choice.");
        }
        
        //Calculating the total amount to be returned
        double totalAmount = loanAmount + interest;
        System.out.println("Total amount to be returned: " + totalAmount);
        
        //closing the scanner resource
        sc.close();
    }
}
