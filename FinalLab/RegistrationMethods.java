import java.util.*;
import java.io.*;

/**
 * RegistrationMethods class handles file input, file output,
 * and registration checking.
 *
 * @author Ammara Agsalud
 * @version 1.0
 */
public class RegistrationMethods
{
    private String inputFileName;
    private String outputFileName;

    public static final int REG_MONTH = 4;
    public static final int REG_YEAR = 2025;

    /**
     * Prompts user for input and output file names.
     *
     * @throws IOException for file errors
     */
    public void setFileNames() throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the path to the registrations.csv file (ie c:/tmp/registration.csv): ");
        inputFileName = keyboard.nextLine();

        File inputFile = new File(inputFileName);

        while (!inputFile.exists())
        {
            System.out.print("File was not found. Please enter the path again: ");
            inputFileName = keyboard.nextLine();
            inputFile = new File(inputFileName);
        }

        System.out.print("Enter the path where output.txt should be saved (ie c:/tmp/output.txt): ");
        outputFileName = keyboard.nextLine();
    }

    /**
     * Gets the number of data lines in the input file.
     *
     * @return the number of records
     * @throws IOException for file errors
     */
    public int getArraySize() throws IOException
    {
        File file = new File(inputFileName);
        Scanner input = new Scanner(file);

        int count = 0;

        if (input.hasNextLine())
        {
            input.nextLine();
        }

        while (input.hasNextLine())
        {
            input.nextLine();
            count++;
        }

        input.close();

        return count;
    }

    /**
     * Reads the csv file and creates CarOwner objects in the array.
     *
     * @param inArray the array of car owners
     * @throws IOException for file errors
     */
    public void processTextToArray(CarOwner[] inArray) throws IOException
    {
        File file = new File(inputFileName);
        Scanner inputStream = new Scanner(file);

        int element = 0;

        if (inputStream.hasNextLine())
        {
            inputStream.nextLine();
        }

        while (inputStream.hasNextLine())
        {
            String line = inputStream.nextLine();
            String[] parts = line.split(",");

            String lastName = parts[0];
            String firstName = parts[1];
            String license = parts[2];
            int month = Integer.parseInt(parts[3]);
            int year = Integer.parseInt(parts[4]);

            inArray[element] = new CarOwner(firstName, lastName, license, month, year);

            element++;
        }

        inputStream.close();
    }

    /**
     * Prints a message and array to the output file.
     *
     * @param inMsg the message header
     * @param inArray the array to print
     * @throws IOException for file errors
     */
    public void printArrayToFile(String inMsg, CarOwner[] inArray) throws IOException
    {
        FileWriter fw = new FileWriter(outputFileName, true);
        PrintWriter output = new PrintWriter(fw);

        output.println(inMsg);

        for (CarOwner owner : inArray)
        {
            output.println(owner);
        }

        output.println();

        output.close();
    }

    /**
     * Finds owners whose registration is expired.
     *
     * @param inArray the array of car owners
     * @return array of expired owners
     */
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray)
    {
        int totalMonths = REG_YEAR * 12 + REG_MONTH;
        int count = 0;

        for (int i = 0; i < inArray.length; i++)
        {
            int ownerMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();

            if (totalMonths - ownerMonths > 12)
            {
                count++;
            }
        }

        CarOwner[] overdue = new CarOwner[count];
        int index = 0;

        for (int i = 0; i < inArray.length; i++)
        {
            int ownerMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();

            if (totalMonths - ownerMonths > 12)
            {
                overdue[index] = inArray[i];
                index++;
            }
        }

        return overdue;
    }

    /**
     * Finds owners whose registration expires in three months or less.
     *
     * @param inArray the array of car owners
     * @return array of almost due owners
     */
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray)
    {
        int totalMonths = REG_YEAR * 12 + REG_MONTH;
        int count = 0;

        for (int i = 0; i < inArray.length; i++)
        {
            int ownerMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();
            int difference = totalMonths - ownerMonths;

            if (difference > 9 && difference <= 12)
            {
                count++;
            }
        }

        CarOwner[] almostDue = new CarOwner[count];
        int index = 0;

        for (int i = 0; i < inArray.length; i++)
        {
            int ownerMonths = inArray[i].getYear() * 12 + inArray[i].getMonth();
            int difference = totalMonths - ownerMonths;

            if (difference > 9 && difference <= 12)
            {
                almostDue[index] = inArray[i];
                index++;
            }
        }

        return almostDue;
    }

    /**
     * Gets the output file name.
     *
     * @return the output file name
     */
    public String getOutputFileName()
    {
        return outputFileName;
    }
}