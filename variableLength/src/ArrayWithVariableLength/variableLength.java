 import java.util.Scanner;
public class variableLength {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int n;
      System.out.println("Enter the Number of Elements in Array ");
      n=input.nextInt();
      int[] array= new int[n];
      System.out.println("Enter the array elements ");
      for(int i=0;i<n;i++){
      array[i]=input.nextInt();  
    }
       System.out.println("Array elements are ");
       System.out.print("[ ");
       for(int i=0;i<n;i++){
       System.out.print(array[i]+" ");
    }
       System.out.println("]");
       System.out.println("The average is "+average(array));
       
    }
    
    public static int average(int...arr){
        int total =0;
        for(int x:arr ){
            total +=x;
        }
        return total/arr.length;
    }
}

