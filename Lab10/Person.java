/**
 * Person class
 *
 * @author Ammara Agsalud
 * @version 1.0
 */
public class Person
{
    private String name;

    public static final int CURRENT_YEAR = 2025;

    public Person()
    {
        name = "No name yet";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Name: " + name;
    }
}