public class RoomSize {
    private String name;
    private double length;
    private double width;

    public RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    public RoomSize(RoomSize object2) {
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "Room Name: " + name +
               "\nLength: " + length +
               "\nWidth: " + width +
               "\nArea: " + String.format("%.2f", getArea());
    }
}