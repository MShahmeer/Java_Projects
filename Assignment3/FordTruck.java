
public class FordTruck extends Truck{

    public FordTruck(int numberOfAxels, double totalWeight) {
        super(numberOfAxels, totalWeight);
    }

    @Override
    public void displayData() {
        System.out.print("Ford Truck" + "\t" + "Axels: " + getNumberOfAxels() + "\t" + "Total Weight In Kg: " + getTotalWeight());
    }
}
