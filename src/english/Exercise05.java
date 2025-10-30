package english;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        // Create Scanner for input
        Scanner input = new Scanner(System.in);

        // Variables to store values
        double V = 0, D = 0, T = 0;
        String type1, type2;
        double value1, value2;

        // Ask for first data type
        System.out.print("Enter first data type (V, D, T): ");
        type1 = input.next().toUpperCase();
        System.out.print("Enter value for " + type1 + ": ");
        value1 = input.nextDouble();

        // Ask for second data type
        System.out.print("Enter second data type (V, D, T): ");
        type2 = input.next().toUpperCase();
        System.out.print("Enter value for " + type2 + ": ");
        value2 = input.nextDouble();

        // Assign the values to the corresponding variables
        if (type1.equals("V")) V = value1;
        else if (type1.equals("D")) D = value1;
        else if (type1.equals("T")) T = value1;

        if (type2.equals("V")) V = value2;
        else if (type2.equals("D")) D = value2;
        else if (type2.equals("T")) T = value2;

        // Calculate the missing value using the formula V = D / T
        if (V == 0 && T != 0) {
            V = D / T;
            System.out.println("RESULT: V = " + V);
        } else if (D == 0 && T != 0) {
            D = V * T;
            System.out.println("RESULT: D = " + D);
        } else if (T == 0 && V != 0) {
            T = D / V;
            System.out.println("RESULT: T = " + T);
        } else {
            System.out.println("Not enough or incorrect data.");
        }

        // Close the scanner
        input.close();
    }
}
