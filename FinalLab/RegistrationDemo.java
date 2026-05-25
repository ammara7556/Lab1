import java.io.*;

/**
 * RegistrationDemo class runs the final project.
 *
 * @author Ammara Agsalud
 * @version 1.0
 */
public class RegistrationDemo
{
    public static void main(String[] args) throws IOException
    {
        RegistrationMethods dmv = new RegistrationMethods();

        dmv.setFileNames();

        int size = dmv.getArraySize();

        CarOwner[] ltState = new CarOwner[size];

        dmv.processTextToArray(ltState);

        dmv.printArrayToFile("List of Car Owners", ltState);

        CarOwner[] overdue = dmv.flagOverdueOwners(ltState);

        dmv.printArrayToFile("Owners with Expired Registration", overdue);

        CarOwner[] almostDue = dmv.flagAlmostDueOwners(ltState);

        dmv.printArrayToFile("Owners with registration expiring in three months or less", almostDue);

        System.out.println("The output file can be found at: " + dmv.getOutputFileName());
    }
}