// WAP to Half Diamond Star Pattern
package PATTERN;

import java.util.Scanner;

public class Pattern10
{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number");
      int n= scanner.nextInt();
      System.out.println("Half Diamond Star Pattern");
      for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=i;j++)
         {
            System.out.print("* ");
         }
         System.out.println();         
       }
       int s=n-1;
       for (int i=0;i<s;i++)
      {
        for (int j=s;j>i;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
      }
    }
}
