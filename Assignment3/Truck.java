
public abstract class Truck {
    private int numberOfAxels;
    private double totalWeight;

    public Truck(int numberOfAxels, double totalWeight) {
        this.numberOfAxels = numberOfAxels;
        this.totalWeight = totalWeight;
    }

    public int getNumberOfAxels() {
        return numberOfAxels;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
    
    public abstract void displayData();
}
