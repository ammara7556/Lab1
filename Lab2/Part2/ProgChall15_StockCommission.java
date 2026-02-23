import java.util.Scanner;

/**
 * Program Name: ProgChall15_StockCommission
 * Description: This program calculates the stock cost, commission, and total paid based on shares purchased and price per share.
 * @author Ammara Agsalud
 * @version 1.0
 * @since 2026-02-16
 */
public class ProgChall15_StockCommission
{
    public static void main(String[] args)
    {
        // Constants (one per line)
        final double COMMISSION_RATE = 0.02;

        // Declarations
        int shares;
        double pricePerShare;
        double stockCost, commission, totalPaid;

        // Input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of shares purchased: ");
        shares = keyboard.nextInt();

        System.out.print("Enter price per share: ");
        pricePerShare = keyboard.nextDouble();

        // Operations
        stockCost = shares * pricePerShare;
        commission = stockCost * COMMISSION_RATE;
        totalPaid = stockCost + commission;

        // Output
        System.out.println("Amount paid for stock alone: " + stockCost);
        System.out.println("Commission amount: " + commission);
        System.out.println("Total amount paid: " + totalPaid);

        keyboard.close();
    }
}