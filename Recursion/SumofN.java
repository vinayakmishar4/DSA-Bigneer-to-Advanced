// Wap to sum of n number ̑
package Recursion;

import java.util.Scanner;

public class SumofN 
{
  static void Forloop(int number)
  {
    int sum=0;
    for(int i=1;i<=number;i++)
    {
        sum=sum+i;
    }
    System.out.println(sum);
  }
  static int Rersiev(int number)
  {
    if(number==0)
    {
        return 0;
    }
    return number + Rersiev(number-1);
  }
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int number=scanner.nextInt();
    System.out.println("1.Using for loop");
    System.out.println("2.Recursion ");
    int n=scanner.nextInt();
    switch (n)
    {
      case 1:System.out.println("Sum of N number");
              Forloop(number);
              break;
       case 2:System.out.println("Sum of N number");
              int sum=Rersiev(number);
              System.out.println(sum);
              break;
      default:System.out.println("No approach");
                break;
    }
  }    
}
