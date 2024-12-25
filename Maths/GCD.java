// WAP to find GCD(Greatest common divison ) of two numbers

import java.util.Scanner;

class GCD
{
  static int GCD(int number1,int number2)
  {
    if(number2==0)
    {
     return number1;
    }
    return GCD(number2,number1%number2);
  }
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the frist number");
    int number1=sc.nextInt();
    System.out.println("Enter the second number");
    int number2=sc.nextInt();
    int result=GCD(number1,number2);
    System.out.print(" GCD of " + number1 + " and " + number2 + " = " + result);
  }
}
