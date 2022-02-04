
public class ConstructorValuePassing {
   public static void main(String [] args){
       Constructor constructorObject1 = new Constructor();
       Constructor constructorObject2= new Constructor(5);
       Constructor constructorObject3 = new Constructor(5,13);
       Constructor constructorObject4 = new Constructor(5,13,43);
       System.out.printf(" %s\n", constructorObject1.toMilitary());
       System.out.printf(" %s\n", constructorObject2.toMilitary());
       System.out.printf(" %s\n", constructorObject3.toMilitary());
       System.out.printf(" %s\n", constructorObject4.toMilitary());
   } 
}
