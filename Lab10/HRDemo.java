public class HRDemo
{
    public static void main(String[] args)
    {
        FullTime fred =
            new FullTime("Flinstone, Fred",
                         2013,
                         "BR-1",
                         75000.1234);

        Adjunct barney =
            new Adjunct("Rubble, Barney",
                        2014,
                        "BR-2",
                        320,
                        60.55);

        FullTime wilma = new FullTime();

        wilma.setName("Flintstone, Wilma");
        wilma.setIdNum("BR-3");
        wilma.setHireYear(2016);
        wilma.setSalary(78123.2468);

        Employee betty =
            new Employee("Rubble, Betty",
                         2020,
                         "BR-4");

        FullTime wilma2 =
            new FullTime("Slate, Wilma",
                         2016,
                         "BR-3",
                         78123.2468);

        Person[] staff =
        {
            fred,
            barney,
            wilma,
            betty,
            wilma2
        };

        int count = 1;

        for(Person p : staff)
        {
            System.out.println("Employee" + count);
            System.out.println(p);
            System.out.println();
            count++;
        }

        System.out.println(
            "wilma and wilma2 are the same person: "
            + wilma.equals(wilma2));

        System.out.println();

        wilma.setName("Slate, Wilma");

        Person[] staff2 =
        {
            fred,
            barney,
            wilma,
            betty
        };

        count = 1;

        for(Person p : staff2)
        {
            System.out.println("Employee" + count);
            System.out.println(p);
            System.out.println();
            count++;
        }
    }
}