
package PATTERN;

import java.util.Scanner;

public class Pattern8
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int n=scanner.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        for(int k=0;k<2*n-(2*i+1);k++)
        {
           System.out.print("*");
        }
        System.out.println();
    }
  }    
}
