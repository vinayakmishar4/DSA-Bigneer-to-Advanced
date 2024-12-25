// WAP to Star Pyramid
package PATTERN;

import java.util.Scanner;

public class Pattern7 
{
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter number");
     int n = scanner.nextInt();
     System.out.println("Star Pyramid");
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
  }
}
