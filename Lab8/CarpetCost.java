public class CarpetCost {
    private RoomSize size;
    private double costPerSqFt;

    public CarpetCost(RoomSize area, double cost) {
        size = new RoomSize(area);
        costPerSqFt = cost;
    }

    public double getCost() {
        return size.getArea() * costPerSqFt;
    }

    public String toString() {
        return size +
               "\nThe cost per sq ft is: " + String.format("$%,.2f", costPerSqFt) +
               "\nThe total cost is: " + String.format("$%,.2f", getCost());
    }
}