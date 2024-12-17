// WAP to Binary Number Triangle Pattern
package PATTERN;

import java.util.Scanner;

public class Pattern11
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int n = scanner.nextInt();
    System.out.println("Binary Number Triangle Pattern");
    for(int i=0;i<=n;i++)
       {
         if(i%2==0)
         {
            for(int j=0;j<i;j++)
            {
               if(j%2==0)
               {
                  System.out.print("0 ");
               }
               if(j%2==1)
               {
                  System.out.print("1 ");
               }
            }
         }
         if(i%2==1)
         {
            for(int j=0;j<i;j++)
            {
               if(j%2==0)
               {
                 System.out.print("1 ");
               }
               if(j%2==1)
               {
                 System.out.print("0 ");
               }
            }
         }
         System.out.println();
       }
  }  
}
