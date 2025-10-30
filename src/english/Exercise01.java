package english;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        // Base price of the computer
        double pcPrice = 375.99;

        // Variables to store user choices for extras
        int chooseAntivirus;
        int choosePrinter;

        // Prices for extras and screens
        final double SCREEN_SMALL = 75.99;
        final double SCREEN_LARGE = 99.99;
        final double ANTIVIRUS_PRICE = 65.99;
        final double PRINTER_PRICE = 125.00;

        // Create Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask user to choose a screen size
        System.out.println("Welcome to the PC Store!");
        System.out.println("Base PC price: €" + pcPrice);
        System.out.println("Select your screen:");
        System.out.println("1 - 38 cm (€" + SCREEN_SMALL + ")");
        System.out.println("2 - 43 cm (€" + SCREEN_LARGE + ")");
        System.out.print("Enter your choice: ");
        int screenOption = input.nextInt();

        // Update price based on screen choice
        if (screenOption == 1) {
            pcPrice += SCREEN_SMALL; // Add small screen price
        } else if (screenOption == 2) {
            pcPrice += SCREEN_LARGE; // Add large screen price
        } else {
            // Default to small screen if input invalid
            System.out.println("Invalid option. Defaulting to 38 cm screen.");
            pcPrice += SCREEN_SMALL;
        }

        // Ask user if they want Antivirus software
        System.out.print("Do you want Antivirus software for €" + ANTIVIRUS_PRICE + "? (1 = yes, 0 = no): ");
        chooseAntivirus = input.nextInt();
        if (chooseAntivirus == 1) {
            pcPrice += ANTIVIRUS_PRICE; // Add antivirus price if chosen
        }

        // Ask user if they want a Printer
        System.out.print("Do you want a Printer for €" + PRINTER_PRICE + "? (1 = yes, 0 = no): ");
        choosePrinter = input.nextInt();
        if (choosePrinter == 1) {
            pcPrice += PRINTER_PRICE; // Add printer price if chosen
        }

        // Show the final total price
        System.out.printf("Total amount to pay: €%.2f\n", pcPrice);

        // Close the Scanner
        input.close();
    }
}
