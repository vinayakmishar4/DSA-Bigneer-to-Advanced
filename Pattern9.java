// WAP to Diamond Star Pattern
package PATTERN;

import java.util.Scanner;

public class Pattern9 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number: ");
      int n = scanner.nextInt();
      System.out.println("Diamond Star Pattern");
      for(int i=1;i<n;i++)
     {
        for(int j=n-1;j>i;j--)
        {
            System.out.print(" ");
        }
        for(int k=0;k<(2*i-1);k++)
        {
            System.out.print("*");
        }
        System.out.println();
     }
     int s=n-1;
     for(int i=0;i<s;i++)
     {
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        for(int k=0;k<2*s-(2*i+1);k++)
        {
           System.out.print("*");
        }
        System.out.println();
    }
   }    
}
