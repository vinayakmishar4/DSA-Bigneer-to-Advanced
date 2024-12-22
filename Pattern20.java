// WAP to Symmetric-Butterfly Pattern

import java.util.Scanner;

public class Pattern20 
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter number");
     int a=scanner.nextInt();
     System.out.println("Symmetric-Butterfly Pattern");
     // upper half pattern
    int b=a-1;
     int u=2*a-2;
    for(int m=1;m<=b;m++)
    {
     // frist triangle of stars
      for(int n=1;m>=n;n++)
      {
        System.out.print("*");
      }
     // second triangle of spaces
      for(int o=0;o<u;o++)
      {
        System.out.print(" ");         
      }
     // thrid triangle of stars
      for (int p=0; p<m; p++)
      {
         System.out.print("*");
      }
      u=u-2;
      System.out.println();      
    }
    // lower half pattern
    int lh=0;
      for(int i=0;i<a;i++)
      {
         // fourth triangle of stars
         for(int j=a;j>i;j--)
         {
             System.out.print("*");
         }
         // fifth trinagle of spaces
         for(int k=0;k<lh;k++)
         {
            System.out.print(" ");
         }
         // sixith trinagle of stars
         for(int l=0;l<a-i;l++)
         {
            System.out.print("*");
         }
         lh=lh+2;
         System.out.println();
    }
   }    
}
