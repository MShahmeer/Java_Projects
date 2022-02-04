 class MultidimentionalArray
{
    public static void main (String[] args)
    {
      int firstarray[][] ={{2,3,4,5},{6,7,8,9},{10,11,12,13}};
      int secondarray[][]={{31,32,33},{43},{4,5,6}};
      System.out.println("This is my First Array ");
      display(firstarray);
      System.out.println("This is my second Array ");
      display(secondarray);
    }
 
 
    public static void display (int x[][])
    {
      for(int row=0;row<x.length;row++)
        {
           for(int column=0;column<x[row].length;column++)
             {
                System.out.print(x[row][column]+"\t");
             }
             System.out.println();
        }

    }
}
