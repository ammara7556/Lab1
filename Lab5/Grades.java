import java.util.Scanner;
import java.io.*;

/**
 * This program reads grades from an input file and writes results
 * to an output file. It calculates letter grades, min, max, and average
 * for each line of scores.
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class Grades {
    public static void main(String[] args) throws IOException {

        String inFile = getInFile();
        String outFile = getOutFile();

        processFile(inFile, outFile);
    }

    public static String getInFile() {
        Scanner keyboard = new Scanner(System.in);
        String fileName;
        File file;

        System.out.print("Enter the name of the input file (ie input.txt): ");
        fileName = keyboard.nextLine();
        file = new File(fileName);

        while (!file.exists()) {
            System.out.print("File not found. Enter again: ");
            fileName = keyboard.nextLine();
            file = new File(fileName);
        }

        return fileName;
    }

    public static String getOutFile() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the output file (ie out.txt): ");
        return keyboard.nextLine();
    }

    public static void processFile(String inFile, String outFile) throws IOException {

        Scanner inStream = new Scanner(new File(inFile));
        PrintWriter outStream = new PrintWriter(outFile);

        int set = 1;

        while (inStream.hasNextLine()) {

            int As = 0, Bs = 0, Cs = 0, Ds = 0, Fs = 0;
            int count = 0, total = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            if (!inStream.hasNextInt()) {
                inStream.nextLine();
                continue;
            }

            int number = inStream.nextInt();

            while (number != -1) {

                if (number < min) min = number;
                if (number > max) max = number;

                total += number;
                count++;

                if (number >= 90) As++;
                else if (number >= 80) Bs++;
                else if (number >= 70) Cs++;
                else if (number >= 60) Ds++;
                else Fs++;

                number = inStream.nextInt();
            }

            outStream.println("Set " + set + " of grades calculated");

            if (count == 0) {
                outStream.println("No grades to average");
            } else {
                outStream.println("Number of As: " + As);
                outStream.println("Number of Bs: " + Bs);
                outStream.println("Number of Cs: " + Cs);
                outStream.println("Number of Ds: " + Ds);
                outStream.println("Number of Fs: " + Fs);
                outStream.println("The high score was: " + max);
                outStream.println("The low score was: " + min);

                double avg = (double) total / count;
                outStream.printf("The avg score is: %.1f%n", avg);
            }

            set++;
        }

        System.out.println("Grade processing completed");
        System.out.println("You can retrieve the output file at, " + outFile);

        inStream.close();
        outStream.close();
    }
}