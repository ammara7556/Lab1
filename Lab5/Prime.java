import java.util.Scanner;

/**
 * This program checks whether a number greater than 2 is prime.
 * It uses a separate method to test the number and lets the user
 * keep checking more numbers until they choose to stop.
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class Prime {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean isPrime;
        int number;
        String playAgain;

        do {
            System.out.print("Enter a whole number>2 (ie 19) to test if prime: ");
            number = keyboard.nextInt();

            isPrime = testForPrime(number);

            if (isPrime) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }

            System.out.print("Enter yes to test another number, no to quit. ");
            playAgain = keyboard.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        keyboard.close();
    }

    /**
     * Tests whether a number is prime.
     * @param inNumber number being checked
     * @return true if the number is prime, false otherwise
     */
    public static boolean testForPrime(int inNumber) {

        int inNumberSqRt = (int) Math.sqrt(inNumber);
        boolean isPrimeMeth = true;

        for (int i = 2; isPrimeMeth && i <= inNumberSqRt; i++) {
            if (inNumber % i == 0) {
                isPrimeMeth = false;
            }
        }

        return isPrimeMeth;
    }
}