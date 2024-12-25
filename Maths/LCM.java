// WAP to lcm(Lowest common mutiple) and greatest common factor(gcd)

import java.util.Scanner;
class LCM
{
   static int GCD(int number1,int number2)
   {
      if(number2==0)
      {
        return number1;
      }
      return GCD(number2,number1%number2);
   }
   static int LCM(int number1,int number2)
   {
      return (number1/GCD(number1,number2))*number2;
   }
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter frist number");
     int number1=scanner.nextInt();
     System.out.println("Enter Second number");
     int number2=scanner.nextInt();
     int gcd=GCD(number1,number2);
     int lcm=LCM(number1,number2);
     System.out.println("LCM of " + number1 + " and " + number2 +" = " + gcd);
     System.out.println("GCD of " + number1 + " and " + number2 +" = " + lcm);
  }   
}