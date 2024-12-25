// . WAP to Number Crown Pattern
package PATTERN;

import java.util.Scanner;

public class Pattern12 
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number");
       int n=scanner.nextInt();
       System.out.println("Number Crown Pattern");
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=i; j++)
        {
            System.out.print(j);
        }
        
        System.out.println();
     }
    }
}
