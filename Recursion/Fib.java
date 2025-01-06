// Wap to fabnnoci
package Recursion;

import java.util.Scanner;

public class Fib 
{
    static void fibonacci(int n)
    {
       int a=0;
       int b=1;
       int c;
       if(n<0)
       {
         System.out.println("Incorrect input");
       }
       if(n==0)
       {
         System.out.print(a+" ");
       }
       if(n==1)
       {
         System.out.print(a+" "+b+" ");
       }
       if(n>=2)
       {
        System.out.print(a + " " + b + " " );
        for(int i=2; i<=n; i++)
        {
            c=a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
        }
       }
    }
    static int RecFib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return RecFib(n-1)+RecFib(n-2);
    }
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number");
       int n = scanner.nextInt();
       System.out.println("1.Iterate way");
       System.out.println("2.Recurseive way");
       int value = scanner.nextInt();
       switch (value) {
        case 1:System.out.println("Fibonaoci of a number");
               fibonacci(n);
               break;
        case 2:System.out.println("Fibonacci of a number");
               System.out.println(RecFib(n));
               break;
        default:System.out.println("Worng way");
               break;
       }
    }
}
