// WAP to print a number from 1 to n numbers
package Recursion;

import java.util.Scanner;

public class print1ton 
{
    static int from1ton(int num,int count)
    {
        if(count == num)
        {
            return num;
        }
        System.out.println(count);
        return from1ton(num, count+1);
    }
    public static void main(String[] args) 
    {
        int count = 0;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number");
       int num = scanner.nextInt();
       System.out.println("Print Number 1 to n using Recursion");
       System.out.println(from1ton(num, count));
    }
}
