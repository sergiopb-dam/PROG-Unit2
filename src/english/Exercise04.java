package english;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Variables for amounts
        int totalToPay;
        int totalGiven;

        // Variable for change
        int remainingChange;

        // Variables for each coin count
        int coins200, coins100, coins50, coins20, coins10, coins5, coins2, coins1;

        // Coin values in cents
        final int COIN_200 = 200;
        final int COIN_100 = 100;
        final int COIN_50 = 50;
        final int COIN_20 = 20;
        final int COIN_10 = 10;
        final int COIN_5 = 5;
        final int COIN_2 = 2;

        // Ask user for amount to pay
        System.out.print("Enter amount to pay (in cents): ");
        totalToPay = input.nextInt();

        // Ask user for amount given
        System.out.print("Enter amount given (in cents): ");
        totalGiven = input.nextInt();

        // Calculate total change
        remainingChange = totalGiven - totalToPay;
        System.out.println("Calculating change for: " + remainingChange + " cents");

        // Compute coins from largest to smallest
        coins200 = remainingChange / COIN_200;
        remainingChange %= COIN_200;

        coins100 = remainingChange / COIN_100;
        remainingChange %= COIN_100;

        coins50 = remainingChange / COIN_50;
        remainingChange %= COIN_50;

        coins20 = remainingChange / COIN_20;
        remainingChange %= COIN_20;

        coins10 = remainingChange / COIN_10;
        remainingChange %= COIN_10;

        coins5 = remainingChange / COIN_5;
        remainingChange %= COIN_5;

        coins2 = remainingChange / COIN_2;
        remainingChange %= COIN_2;

        coins1 = remainingChange; // Remaining cents

        // Display the change
        System.out.println("Change in coins (2€,1€,50c,20c,10c,5c,2c,1c):");
        System.out.print(coins200 + " ");
        System.out.print(coins100 + " ");
        System.out.print(coins50 + " ");
        System.out.print(coins20 + " ");
        System.out.print(coins10 + " ");
        System.out.print(coins5 + " ");
        System.out.print(coins2 + " ");
        System.out.println(coins1);

        // Close Scanner
        input.close();
    }
}
