
public class RaviTollBooth extends TollBooth{

    @Override
    public double calculateTollDue(Truck truck) {
        double tollDue = truck.getNumberOfAxels()*5;
        double truckWeight = truck.getTotalWeight()* 0.001;
        
        if (truckWeight<30) {
            tollDue = tollDue + truckWeight*20;
        }else {
            tollDue = tollDue +((truckWeight)*10);
        }
        
        setTotalRecepits(getTotalRecepits() + tollDue);
        return tollDue;
    }
    
    @Override
    public void displayData() {
        System.out.print("Total Truck Arrive: "+getTotalTruckPassed()+"\tTotal Receipt: "+getTotalRecepits());
    }

    @Override
    public void arrived(Truck truck) {
        truck.displayData();
        System.out.println("\tToll Due: "+calculateTollDue(truck));
    }
    
   
}
