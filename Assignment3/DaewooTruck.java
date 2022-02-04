
public class DaewooTruck extends Truck {

    public DaewooTruck(int numberOfAxels, double totalWeight) {
        super(numberOfAxels, totalWeight);
    }

    @Override
    public void displayData() {
        System.out.print("Daewoo Truck" + "\t" + "Axels: " + getNumberOfAxels() + "\t" + "Total Weight In Kg: " + getTotalWeight());
    }

}
