import java.util.Scanner;

/**
 * Program Name: ProgChall13_RestaurantBill
 * Description: This program calculates tax and tip on a meal and displays the meal charge, tax, tip, and total bill.
 * @author Ammara Agsalud
 * @version 1.0
 * @since 2026-02-16
 */
public class ProgChall13_RestaurantBill
{
    public static void main(String[] args)
    {
        // Constants (one per line)
        final double TAX_RATE = 0.0675;
        final double TIP_RATE = 0.20;

        // Declarations
        double mealCharge;
        double taxAmount, tipAmount, totalBill;

        // Input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the meal charge: ");
        mealCharge = keyboard.nextDouble();

        // Operations
        taxAmount = mealCharge * TAX_RATE;
        totalBill = mealCharge + taxAmount;
        tipAmount = totalBill * TIP_RATE;
        totalBill = totalBill + tipAmount;

        // Output
        System.out.println("Meal charge: " + mealCharge);
        System.out.println("Tax amount: " + taxAmount);
        System.out.println("Tip amount: " + tipAmount);
        System.out.println("Total bill: " + totalBill);

        keyboard.close();
    }
}