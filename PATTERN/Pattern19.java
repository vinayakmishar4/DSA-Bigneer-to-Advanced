// WAP to Symmetric-Void Pattern
import java.util.Scanner;

public class Pattern19 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number");
      int a=scanner.nextInt();
      System.out.println("Symmetric-Void Pattern");
      // Upper half pattern
      int u=0;
      for(int i=0;i<a;i++)
      {
         // frist triangle of stars
         for(int j=a;j>i;j--)
         {
             System.out.print("*");
         }
         // second trinagle of spaces
         for(int k=0;k<u;k++)
         {
            System.out.print(" ");
         }
         // third trinagle of stars
         for(int l=0;l<a-i;l++)
         {
            System.out.print("*");
         }
         u=u+2;
         System.out.println();
    }
      // lower half pattern
   int lh=2*a-2;
   for(int m=1;m<=a;m++)
   {
     // fourth triangle of stars
     for(int n=1;m>=n;n++)
     {
       System.out.print("*");
     }
     // fifth triangle of spaces
     for(int o=0;o<lh;o++)
     {
       System.out.print(" ");         
     }
     // sixth triangle of stars
     for (int p=0; p<m; p++)
     {
         System.out.print("*");
     }
     lh=lh-2;
     System.out.println();      
    }
   }
 }


