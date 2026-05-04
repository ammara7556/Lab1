import java.util.Scanner;

/**
 * This program prints a diamond pattern based on a width entered by the user.
 * If the user enters an even number, it is adjusted to the next odd number.
 * The pattern is created using nested loops for the top and bottom halves.
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class Stars {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int width;

        System.out.print("Enter max width: ");
        width = keyboard.nextInt();

        // make sure width is odd
        if (width % 2 == 0) {
            width++;
        }

        int middle = width / 2;

        // TOP HALF
        for (int line = 0; line <= middle; line++) {

            for (int spaces = 0; spaces < middle - line; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars < 2 * line + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // BOTTOM HALF
        for (int line = middle - 1; line >= 0; line--) {

            for (int spaces = 0; spaces < middle - line; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars < 2 * line + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

        keyboard.close();
    }
}