/**
 * Employee class
 *
 * @author Ammara Agsalud
 * @version 1.0
 */
public class Employee extends Person
{
    private int hireYear;
    private String idNum;

    public Employee()
    {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }

    public Employee(String name, int hireYear, String idNum)
    {
        super(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }

    public void setHireYear(int hireYear)
    {
        this.hireYear = hireYear;
    }

    public int getHireYear()
    {
        return hireYear;
    }

    public void setIdNum(String idNum)
    {
        this.idNum = idNum;
    }

    public String getIdNum()
    {
        return idNum;
    }

    public int getServiceYears()
    {
        return CURRENT_YEAR - hireYear;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean isEqual = false;

        if (o != null && getClass() == o.getClass())
        {
            Employee copy = (Employee)o;

            if (idNum.equalsIgnoreCase(copy.idNum))
            {
                isEqual = true;
            }
        }

        return isEqual;
    }

    @Override
    public String toString()
    {
        return super.toString()
                + "\nID Number: " + idNum
                + "\nYear Hired: " + hireYear
                + ", Years Of Service: " + getServiceYears();
    }
}