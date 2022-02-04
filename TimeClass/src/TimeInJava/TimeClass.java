
public class TimeClass {
    public static void main(String[] args){
        TimeData TimeDataObject =new TimeData();
        System.out.println("Default Time when we have not passed any value");
        System.out.println(TimeDataObject.toMilitary());
        System.out.println(TimeDataObject.toString());
        TimeDataObject.setTime(13,27,6);
        System.out.println("Time After Passing The Values");
        System.out.println(TimeDataObject.toMilitary());
        System.out.println(TimeDataObject.toString());
    }
}
