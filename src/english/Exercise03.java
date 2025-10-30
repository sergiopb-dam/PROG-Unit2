package english;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        // Variables for user input (mirror time)
        int mirrorH;
        int mirrorM;

        // Variables for calculated real time
        int realH;
        int realM;

        // Scanner to read input
        Scanner input = new Scanner(System.in);

        // Ask user for the hour seen in the mirror
        System.out.print("Enter the hour seen in the mirror (1-12): ");
        mirrorH = input.nextInt();

        // Ask user for the minutes seen in the mirror
        System.out.print("Enter the minutes seen in the mirror (0-59): ");
        mirrorM = input.nextInt();

        // Convert 12 o'clock to 0 for calculation
        mirrorH = (mirrorH == 12) ? 0 : mirrorH;

        // Calculate real time
        if (mirrorM == 0) {
            realH = 12 - mirrorH; // Exact hour
            realM = 0;
        } else {
            realH = 11 - mirrorH; // Not exact hour
            realM = 60 - mirrorM;
        }

        // If hour is 0, set it to 12
        if (realH == 0) realH = 12;

        // Display the real time with leading zeros if needed
        System.out.print("Real time: ");
        if (realH < 10) System.out.print("0");
        System.out.print(realH + ":");
        if (realM < 10) System.out.print("0");
        System.out.println(realM);

        // Close the Scanner
        input.close();
    }
}
