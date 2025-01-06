// Wap to factorial of a number
package Recursion;

import java.util.Scanner;

public class Fact
{
  static void Fact1(int number)
  {
     int sum=1;
    for (int i = 1; i <= number; i++)
    {
      sum=sum*i;
    }
    System.out.println(sum);
  }
  static int Fact2(int number)
  {
    if(number == 1)
    {
        return 1;
    }
    return number*Fact2(number-1);
  }   
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number:");
     int  number=scanner.nextInt();
     System.out.println("1.Using for loop");
     System.out.println("2.Using recursion");
     int n=scanner.nextInt();
     switch (n)
     {
       case 1:System.out.println("Factorial of a number");
              Fact1(number);
              break;
       case 2:System.out.println("Factorial of a number");
              int result=Fact2(number);
              System.out.println(result);
              break;
       default:System.out.println("No Approaches");
               break;
     }
    }    
}
