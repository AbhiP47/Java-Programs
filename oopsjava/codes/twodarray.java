package oopsjava.codes;

import java.util.Scanner;
public class twodarray {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no.  of rows in the array");
    int r = sc.nextInt();
    System.out.println("enter the no. of colums in the array");
    int c = sc.nextInt();
    int [][] arr = new int[r][c];
    System.out.println("enter the elements in the array");
    int i,j;
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("the list of the elements of the array is:");
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

    sc.close();
  }
  
}
