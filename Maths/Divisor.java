// WAP to print all the divisor of the number

import java.util.Scanner;

class Divisor
{
   static void Optimal(int number)
   {
    for(int i = 1; i < Math.sqrt(number); i++)
    {
       if(number % i == 0)
       {
          System.out.println(i);
          if(i != number/i)
          {
             System.out.println(number/i);
          }
       }
    }
   } 
   static void Brute(int number)
   {
     for(int i = 1; i <(number); i++)
     {
       if(number % i == 0)
       {
         System.out.println(i);
       }
     }
   }
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number:");
     int number = scanner.nextInt();
     System.out.println("1: Brute Froce approuch ");
     System.out.println("2: Optimized approuch ");
     int n= scanner.nextInt();
     switch (n)
     {
        case 1:System.out.println("Divisor of a number: ");
               Brute(number);
               break;

        case 2:System.out.println("Divisor of a number: ");
               Optimal(number);
               break;

        default:System.out.println(" No approach ");
                break;
     }     
   }
}    
