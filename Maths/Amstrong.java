// WAP of tha amstrong number

import java.util.Scanner;

class Amstrong
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number:");
      int num = scanner.nextInt();
      int s=num;
      int temp=num;
      int count=0;
      while(num>0)
      {
         num=num/10;
         count=count+1;
      }
      int sum=0;
      while (s>0)
      {
        int rem=s%10;
        sum=sum+(int)Math.pow(rem,count);
        s=s/10;
      }
      if(temp==sum)
      {
        System.out.println(temp + " is an Amstrong number " + sum);
      }
      else
      {
        System.out.println(temp + " is not an Amstrong number " + sum);
      }
   }   
}