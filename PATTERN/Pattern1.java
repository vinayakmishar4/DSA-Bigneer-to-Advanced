// Wap to Rectangular Star Pattern 

package PATTERN;

import java.util.Scanner;

public class Pattern1 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number for pattern");
    
      int n=scanner.nextInt();
       System.out.println("<-----RECTANGULAR STAR PATTERN------->");
      for (int i=0; i<n; i++)
      {5
        for (int j=0; j<n; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
      }
   }    
}