// WAP TO Right-Angled Number Pyramid - II
package PATTERN;

import java.util.Scanner;

public class Pattern4
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number of patterns");
      int a =scanner.nextInt();
      System.out.println("Right-Angled Number Pyramid - II");
      for (int i = 1; i<=a; i++)
      {
        for (int j = 1; j<=i;j++)
        {
            System.out.print(i);
        }
        System.out.println();
      }
   }    
}
