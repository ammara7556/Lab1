import java.util.Scanner;

/**
 * This program calculates the distance an object falls over time.
 * It asks the user for the number of seconds and displays a table
 * showing the distance fallen at each second.
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class FallingDistance {

    public static final double ACCELERATION = 9.8;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int numOfSecs;

        System.out.print("Please enter how many seconds to compute: ");
        numOfSecs = keyboard.nextInt();

        System.out.println("Time(secs)\tDistance(m)");
        System.out.println("=========\t===========");

        for (int i = 1; i <= numOfSecs; i++) {
            double distance = getDistance(i);
            System.out.printf("%d\t\t%.1f%n", i, distance);
        }

        keyboard.close();
    }

    /**
     * Calculates falling distance based on time.
     * @param time number of seconds
     * @return distance fallen in meters
     */
    public static double getDistance(int time) {
        return 0.5 * ACCELERATION * Math.pow(time, 2);
    }
}