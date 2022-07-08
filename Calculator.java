import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
        System.out.print("Enter the principle: ");
        principle = input.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        rate = input.nextDouble();
        System.out.print("Enter the period (in years): ");
        period = input.nextInt();
        // performing necessary calculations
        // to get the monthly interest rate
        double monthlyIntRate;
        monthlyIntRate = (rate / 100) / 12;
        period *= 12;
        mortgage = (principle * monthlyIntRate * Math.sqrt(1 + monthlyIntRate)) / Math.sqrt(1 + monthlyIntRate) - 1;
        // display the results using a dialog box
        /*
         * JOptionPane.showMessageDialog(null, "The principle entered is: " +
         * principle);
         * JOptionPane.showMessageDialog(null, "The period entered in months is: " +
         * period);
         * JOptionPane.showMessageDialog(null, "Your monthly pay rate is : " +
         * monthlyIntRate);
         * JOptionPane.showMessageDialog(null, "Your mortgage for the period of " +
         * period + "is: " + mortgage);
         */
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.println("The principle entered is: " + principle);
        System.out.println("The period entered in months is: " + period);
        System.out.println("Your monthly pay rate is : " + monthlyIntRate);
        System.out.println("your mortgage for this period is: " + result);
    }
}