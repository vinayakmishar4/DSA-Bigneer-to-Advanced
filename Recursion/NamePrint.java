// WAP to print names n times 
package Recursion;

import java.util.Scanner;

public class NamePrint 
{
   static void PrintName(String name,int num,int count)
   {
    if(count==num)
    {
        return;
    }
    System.out.println(count + " " + name);
    PrintName(name,num,count+1);
   } 
   public static void main(String[] args)
   {
      int count = 0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter name");
       String name = scanner.nextLine();
       System.out.println("Enter number of times you want to print name");
       int num = scanner.nextInt();
       PrintName(name, num, count);
    }    
}
