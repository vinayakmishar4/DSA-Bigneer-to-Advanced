package Recursion;

import java.util.Scanner;

public class BasicRecusrion 
{
  static void FristRecursion(int num,int count)
  {
    if(count == num)
    {
        return;
    }
    System.out.println(count);
    FristRecursion(num,count+1);
  }
  public static void main(String[] args)
  {
     int count = 0;
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a number:");
     int num = scanner.nextInt();
     FristRecursion(num,count);
  }    
}
