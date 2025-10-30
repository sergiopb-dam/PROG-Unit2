package english;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        // Create Scanner to read input
        Scanner input = new Scanner(System.in);

        // Interest rates for each account type (percent)
        final double RATE_ACCOUNT_A = 1.5;
        final double RATE_ACCOUNT_B = 2.0;
        final double RATE_ACCOUNT_C = 1.5;
        final double RATE_ACCOUNT_X = 5.0;

        // Variables to store user input
        double depositAmount;
        char acctType;

        // Variable to store calculated interest
        double interest = 0.0;

        // Ask user for the deposit amount
        System.out.print("Enter the deposit amount: ");
        depositAmount = input.nextDouble();

        // Ask user for account type
        System.out.print("Enter account type (A, B, C, X): ");
        acctType = input.next().charAt(0);

        // Calculate interest using switch and handle uppercase/lowercase
        switch (Character.toUpperCase(acctType)) {
            case 'A' -> interest = depositAmount * (RATE_ACCOUNT_A / 100); // Type A
            case 'B' -> interest = depositAmount * (RATE_ACCOUNT_B / 100); // Type B
            case 'C' -> interest = depositAmount * (RATE_ACCOUNT_C / 100); // Type C
            case 'X' -> interest = depositAmount * (RATE_ACCOUNT_X / 100); // Type X
            default -> System.out.println("Invalid account type.");
        }

        // Show interest only if valid type was entered
        if (interest > 0) {
            System.out.printf("Interest earned in one year: €%.2f\n", interest);
        }

        // Close Scanner
        input.close();
    }
}
