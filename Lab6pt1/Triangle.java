import java.util.Scanner;

/**
 * This class stores information about a triangle and can calculate
 * its area using the base and height.
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class Triangle {

    private String name;
    private double base;
    private double height;

    /**
     * Creates a triangle with default values.
     */
    public Triangle() {
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }

    /**
     * Creates a triangle with a name, base, and height.
     * @param inName the triangle name
     * @param inBase the triangle base
     * @param inHeight the triangle height
     */
    public Triangle(String inName, double inBase, double inHeight) {
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     * Sets the triangle name.
     * @param newName the new triangle name
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Sets the triangle base.
     * @param newBase the new triangle base
     */
    public void setBase(double newBase) {
        base = newBase;
    }

    /**
     * Sets the triangle height.
     * @param newHeight the new triangle height
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    /**
     * Reads the triangle name, base, and height from the user.
     */
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();

        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();

        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
    }

    /**
     * Calculates the area of the triangle.
     * @return the triangle area
     */
    private double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Prints the triangle name, base, height, and area.
     */
    public void writeOutput() {
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is: %.1f%n", getArea());
    }
}