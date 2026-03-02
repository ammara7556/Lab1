import java.util.Scanner;

/**
 * Program Name: Sorting
 * Description: This program asks the user for three integers and displays them in ascending order using nested if statements.
 * @author Ammara Agsalud
 * @version 1.0
 * @since 2026-03-01
 */
public class Sorting
{
    public static void main(String[] args)
    {
        // Declarations
        int num1, num2, num3;

        // Input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = keyboard.nextInt();

        System.out.print("Enter second number: ");
        num2 = keyboard.nextInt();

        System.out.print("Enter third number: ");
        num3 = keyboard.nextInt();

        // Nested if sorting
        if (num1 <= num2 && num1 <= num3)
        {
            if (num2 <= num3)
            {
                System.out.println("Ascending order: " + num1 + " " + num2 + " " + num3);
            }
            else
            {
                System.out.println("Ascending order: " + num1 + " " + num3 + " " + num2);
            }
        }
        else if (num2 <= num1 && num2 <= num3)
        {
            if (num1 <= num3)
            {
                System.out.println("Ascending order: " + num2 + " " + num1 + " " + num3);
            }
            else
            {
                System.out.println("Ascending order: " + num2 + " " + num3 + " " + num1);
            }
        }
        else
        {
            if (num1 <= num2)
            {
                System.out.println("Ascending order: " + num3 + " " + num1 + " " + num2);
            }
            else
            {
                System.out.println("Ascending order: " + num3 + " " + num2 + " " + num1);
            }
        }

        keyboard.close();
    }
}