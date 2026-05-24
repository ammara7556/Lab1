import java.io.*;
import java.util.*;

/**
 * Processes sales data from a file and displays
 * weekly and monthly sales information.
 *
 * @author Ammara Agsalud
 * @version 1.0
 * @since Spring 2026
 */
public class SalesAnalysis
{
    public static final int WEEKS_IN_MONTH = 4;

    private double[] weeklyTotal;
    private String inputFile;
    private int lineNumber = 0;

    /**
     * Creates a SalesAnalysis object using the file name.
     *
     * @param fileName The name or path of the input file.
     */
    public SalesAnalysis(String fileName)
    {
        inputFile = fileName;
        weeklyTotal = new double[WEEKS_IN_MONTH];
    }

    /**
     * Reads the file, splits each line, and sends the
     * weekly sales data to the helper method.
     *
     * @throws IOException if the file cannot be read.
     */
    public void processFile() throws IOException
    {
        File file = new File(inputFile);
        Scanner input = new Scanner(file);

        while(input.hasNextLine())
        {
            String line = input.nextLine();
            String[] salesArray = line.split(",");
            setArrayElement(salesArray);
        }

        input.close();
    }

    /**
     * Totals one week of sales and stores it in the array.
     *
     * @param inArray The String array of daily sales values.
     */
    private void setArrayElement(String[] inArray)
    {
        double total = 0;

        for(String value : inArray)
        {
            total += Double.parseDouble(value);
        }

        weeklyTotal[lineNumber] = total;
        lineNumber++;
    }

    /**
     * Displays weekly total sales, average daily sales,
     * total monthly sales, average weekly sales, and the
     * highest and lowest sales weeks.
     */
    public void writeOutput()
    {
        double totalSales = 0;
        double max = weeklyTotal[0];
        double min = weeklyTotal[0];

        int maxWeek = 0;
        int minWeek = 0;

        for(int i = 0; i < weeklyTotal.length; i++)
        {
            double dailySales = weeklyTotal[i] / 7;

            System.out.println("Week" + (i + 1) + " Info");
            System.out.println("Total Sales: " 
                    + String.format("$%,.2f", weeklyTotal[i]));
            System.out.println("Avg Daily Sales for Week: " 
                    + String.format("$%,.2f", dailySales));

            totalSales += weeklyTotal[i];

            if(weeklyTotal[i] > max)
            {
                max = weeklyTotal[i];
                maxWeek = i;
            }

            if(weeklyTotal[i] < min)
            {
                min = weeklyTotal[i];
                minWeek = i;
            }
        }

        System.out.println("Total Sales for all Weeks: " 
                + String.format("$%,.2f", totalSales));

        System.out.println("Avg Weekly Sales: " 
                + String.format("$%,.2f", totalSales / WEEKS_IN_MONTH));

        System.out.println("Week" + (maxWeek + 1) 
                + " had the highest amount of sales");

        System.out.println("Week" + (minWeek + 1) 
                + " had the lowest amount of sales");
    }
}