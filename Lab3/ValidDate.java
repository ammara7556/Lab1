import java.util.Scanner;

/**
 * Program Name: ValidDate
 * Description: This program reads a date in mm/dd/yyyy format and reports whether it is valid or not valid with a reason.
 * @author Ammara Agsalud
 * @version 1.0
 * @since 2026-03-01
 */
public class ValidDate
{
    public static void main(String[] args)
    {
        // Declarations
        int month, day, year;
        int maxDays;
        boolean leapYear;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a date in mm/dd/yyyy format: ");
        String input = keyboard.nextLine().trim();

        // Split the input by "/"
        String[] parts = input.split("/");

        month = Integer.parseInt(parts[0]);
        day = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);

        String date = month + "/" + day + "/" + year;

        // Leap year calculation
        leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Month validation
        if (month < 1 || month > 12)
        {
            System.out.println(date + " is not a valid date.  Months must be 1 to 12.");
            keyboard.close();
            return;
        }

        // Day lower bound check
        if (day < 1)
        {
            System.out.println(date + " is not a valid date.  Days must be 1 or more.");
            keyboard.close();
            return;
        }

        // Determine max days for the month
        if (month == 2)
        {
            if (leapYear)
            {
                maxDays = 29;
            }
            else
            {
                maxDays = 28;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            maxDays = 30;
        }
        else
        {
            maxDays = 31;
        }

        // Day upper bound checks with specific messages
        if (day > 31)
        {
            System.out.println(date + " is not a valid date.  Cannot have more than 31 days in any month.");
        }
        else if (month == 2 && !leapYear && day >= 29)
        {
            System.out.println(date + " is not a valid date.  Cannot have 29 or more days in a non-leap year.");
        }
        else if (day > maxDays)
        {
            if (maxDays == 30)
            {
                System.out.println(date + " is not a valid date.  Cannot have 31 days in this month.");
            }
            else
            {
                System.out.println(date + " is not a valid date.  Day value is too large for this month.");
            }
        }
        else
        {
            System.out.println(date + " is a valid date.");
        }

        keyboard.close();
    }
}