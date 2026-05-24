import java.io.*;
import java.util.*;

/**
 * Driver class for the SalesAnalysis program.
 * It asks the user for a file path, checks that
 * the file exists, and runs the sales analysis.
 *
 * @author Ammara Agsalud
 * @version 1.0
 * @since Spring 2026
 */
public class SalesAnalysisDemo
{
    /**
     * Main method for the program.
     *
     * @param args Command line arguments.
     * @throws IOException if the file cannot be read.
     */
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the path to the SalesData.txt file: ");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);

        while(!file.exists())
        {
            System.out.print("File not found. Enter again: ");
            fileName = keyboard.nextLine();
            file = new File(fileName);
        }

        SalesAnalysis sales = new SalesAnalysis(fileName);

        sales.processFile();
        sales.writeOutput();

        keyboard.close();
    }
}