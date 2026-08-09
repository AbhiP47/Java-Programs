package oopsjava.codes;

import java.util.Scanner;
public class matrixsearch {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of rows ");
    int rows = sc.nextInt();
    System.out.println("enter the numbe of columns");
    int columns = sc.nextInt();
    int [][] array = new int[rows][columns];
    int i,j;
    System.out.println("enter the elements in the array");
    for(i=0;i<rows;i++)
    {
      for(j=0;j<columns;j++)
      {
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println("enter the number to be searched");
    int x = sc.nextInt();
    for(i=0;i<rows;i++)
    {
      for(j=0;j<columns;j++)
      {
        if(array[i][j]==x)
        {
          System.out.println(x+" is found at the index "+i+","+j);
          break;
        } 
        
      }
    }

    sc.close();
  }
  
}
