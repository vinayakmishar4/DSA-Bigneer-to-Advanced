// WAP to Inverted Numbered Right Pyramid
package PATTERN;

import java.util.Scanner;

public class Pattern6
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter number");
     int n = scanner.nextInt();
     System.out.println("Inverted Numbered Right Pyramid");
     for (int i = 0; i < n; i++)
     {
        for (int j = n; j>i; j--)
        {
            System.out.print(n-j+1);
        }
        System.out.println();
     }
   }  
}
