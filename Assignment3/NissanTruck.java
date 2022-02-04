
public class NissanTruck extends Truck {

    public NissanTruck(int numberOfAxels, double totalWeight) {
        super(numberOfAxels, totalWeight);
    }

    @Override
    public void displayData() {
        System.out.print("Nissan Truck" + "\t" + "Axels: " + getNumberOfAxels() + "\t" + "Total Weight In Kg: " + getTotalWeight());
    }
}
