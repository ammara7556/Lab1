/**
 * CarOwner class stores citizen and car registration information.
 *
 * @author Ammara Agsalud
 * @version 1.0
 */
public class CarOwner extends Citizen
{
    private String license;
    private int month;
    private int year;

    /**
     * No-argument constructor.
     */
    public CarOwner()
    {
        super("No Name", "No Name");
        license = "Not Assigned";
        month = 0;
        year = 0;
    }

    /**
     * Constructor that sets all car owner information.
     *
     * @param inFirst the first name
     * @param inLast the last name
     * @param inLicense the license plate
     * @param inMonth the registration month
     * @param inYear the registration year
     */
    public CarOwner(String inFirst, String inLast, String inLicense,
                    int inMonth, int inYear)
    {
        super(inFirst, inLast);
        license = inLicense;
        month = inMonth;
        year = inYear;
    }

    /**
     * Sets the license.
     *
     * @param inLicense the license plate
     */
    public void setLicense(String inLicense)
    {
        license = inLicense;
    }

    /**
     * Gets the license.
     *
     * @return the license plate
     */
    public String getLicense()
    {
        return license;
    }

    /**
     * Sets the month.
     *
     * @param inMonth the month
     */
    public void setMonth(int inMonth)
    {
        month = inMonth;
    }

    /**
     * Gets the month.
     *
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Sets the year.
     *
     * @param inYear the year
     */
    public void setYear(int inYear)
    {
        year = inYear;
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Returns car owner information.
     *
     * @return formatted car owner information
     */
    public String toString()
    {
        return super.toString() + "\t\t" + license + "\t\t" + month + "/" + year;
    }
}