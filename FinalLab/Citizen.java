/**
 * Citizen class stores the first and last name of a citizen.
 *
 * @author Ammara Agsalud
 * @version 1.0
 */
public class Citizen
{
    private String firstName;
    private String lastName;

    /**
     * No-argument constructor.
     */
    public Citizen()
    {
        firstName = "No Name";
        lastName = "No Name";
    }

    /**
     * Constructor that sets first and last name.
     *
     * @param inFirst the first name
     * @param inLast the last name
     */
    public Citizen(String inFirst, String inLast)
    {
        firstName = inFirst;
        lastName = inLast;
    }

    /**
     * Sets the first name.
     *
     * @param inFirst the first name
     */
    public void setFirstName(String inFirst)
    {
        firstName = inFirst;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets the last name.
     *
     * @param inLast the last name
     */
    public void setLastName(String inLast)
    {
        lastName = inLast;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Returns the citizen name.
     *
     * @return first name and last name
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
