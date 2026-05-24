import java.util.Scanner;

public class CarpetCostDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Room Name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter room length: ");
        double length = keyboard.nextDouble();

        System.out.print("Enter room width: ");
        double width = keyboard.nextDouble();

        System.out.print("Enter cost per square foot: ");
        double cost = keyboard.nextDouble();

        RoomSize temp = new RoomSize(name, length, width);
        CarpetCost masterRoom = new CarpetCost(temp, cost);

        System.out.println(masterRoom);

        keyboard.nextLine();

        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();

        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();

        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();

        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();

        CarpetCost livingRoom = new CarpetCost(new RoomSize(name, length, width), cost);

        System.out.println(livingRoom);

        keyboard.close();
    }
}