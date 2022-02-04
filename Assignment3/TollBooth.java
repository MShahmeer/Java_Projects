import java.util.ArrayList;
public abstract class TollBooth {
    private double totalRecepits;
    private static ArrayList<Truck> truck = new ArrayList<>();
    
    public static ArrayList<Truck> getTruck() {
        return truck;
    }

    public void setTotalRecepits(double totalRecepits) {
        this.totalRecepits = totalRecepits;
    }
    

    public int getTotalTruckPassed() {
        return truck.size();
    }

    public double getTotalRecepits() {
        return totalRecepits;
    }
    
    public abstract double calculateTollDue(Truck truck);
    
    public abstract void displayData();
    
    public abstract void arrived(Truck truck);
    
}
