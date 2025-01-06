// Wap to the n to 1 
package Recursion;

import java.util.Scanner;

class printnto1
{
   static void printNto1(int number,int count)
   {
     if(number<1)
     {
        return;
     }
     System.out.println(number);
     printNto1(number-1, count);
   }
   public static void main(String[] args) 
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number");
      int number = scanner.nextInt();
      int count=number;
      printNto1(number, count);
    }
}