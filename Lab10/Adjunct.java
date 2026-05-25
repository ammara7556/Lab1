public class Adjunct extends Employee
{
    private double hours;
    private double hrRate;

    public Adjunct()
    {
        super();
        hours = 0;
        hrRate = 0;
    }

    public Adjunct(String name,
                   int hireYear,
                   String idNum,
                   double hours,
                   double hrRate)
    {
        super(name, hireYear, idNum);

        this.hours = hours;
        this.hrRate = hrRate;
    }

    public double getSalary()
    {
        return hours * hrRate;
    }

    @Override
    public String toString()
    {
        return super.toString()
            + "\nHours: " + hours
            + ", Hourly Rate: "
            + String.format("$%,.2f", hrRate)
            + ", Salary: "
            + String.format("$%,.2f", getSalary());
    }
}