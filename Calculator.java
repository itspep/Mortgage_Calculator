import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // declaring variables
        int period;
        double principle;
        double rate;
        double mortgage;

        // getting user input
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates your mortgage for a particular period (in years)");
        System.out.println("Enter the principle: ");
        principle = input.nextDouble();
        System.out.println("Enter the annual interest rate (in percentage): ");
        rate = input.nextDouble();
        System.out.println("Enter the period (in months): ");
        period = input.nextInt();
        // performing necessary calculations
        // to get the monthly interest rate
        int monthlyIntRate;
        monthlyIntRate = (rate / 100) / 12;
        period *= 12;
        mortgage = (principle * monthlyIntRate * Math.sqrt(1 + monthlyIntRate)) / Math.sqrt(1 + monthlyIntRate) - 1;

    }
}