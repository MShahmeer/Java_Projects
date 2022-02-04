
public class IslamabadTollBooth extends TollBooth {

    @Override
    public double calculateTollDue(Truck truck) {
        double truckWeight = truck.getTotalWeight();
        truckWeight = truckWeight * 0.001;
        double tollDue = (truck.getNumberOfAxels() * 8) + ((truckWeight) * 24);

        setTotalRecepits(getTotalRecepits() + tollDue);
        return tollDue;
    }

    @Override
    public void displayData() {
        System.out.print("Total Truck Arrive: " + getTotalTruckPassed() + "\tTotal Receipt: " + getTotalRecepits());
    }

    @Override
    public void arrived(Truck truck) {
        truck.displayData();
        System.out.println("\tToll Due: " + calculateTollDue(truck));
    }
}
