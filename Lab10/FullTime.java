public class FullTime extends Employee
{
    private double salary;

    public FullTime()
    {
        super();
        salary = 0;
    }

    public FullTime(String name, int hireYear,
                    String idNum, double salary)
    {
        super(name, hireYear, idNum);
        this.salary = salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return super.toString()
            + String.format("\nSalary: $%,.2f", salary);
    }
}