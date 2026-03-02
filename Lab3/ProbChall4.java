import java.util.Scanner;

/**
 * Program Name: ProbChall4
 * Description: This program asks for three exam scores, calculates the average to one decimal place, and displays the letter grade.
 * @author Ammara Agsalud
 * @version 1.0
 * @since 2026-03-01
 */
public class ProbChall4
{
    public static void main(String[] args)
    {
        // Declarations (same type on one line)
        int exam1, exam2, exam3;
        double avg;
        char grade;

        // Input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter exam 1 score: ");
        exam1 = keyboard.nextInt();

        System.out.print("Enter exam 2 score: ");
        exam2 = keyboard.nextInt();

        System.out.print("Enter exam 3 score: ");
        exam3 = keyboard.nextInt();

        // Operations (cast so average becomes double)
        avg = (double)(exam1 + exam2 + exam3) / 3;

        // Multi-branch if-else to determine letter grade
        if (avg >= 90)
        {
            grade = 'A';
        }
        else if (avg >= 80)
        {
            grade = 'B';
        }
        else if (avg >= 70)
        {
            grade = 'C';
        }
        else if (avg >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        // Output (average to 1 decimal, grade on next line)
        System.out.printf("Avg = %.1f%n", avg);
        System.out.printf("Letter Grade = %c%n", grade);

        keyboard.close();
    }
}