// WAP to Alpha-Ramp Pattern

import java.util.Scanner;
class Pattern16
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int a=sc.nextInt();
    System.out.println("Alpha-Ramp Pattern");
    for(int i=0;i<a;i++)
    {
       char c= (char)('A'+i);
      for(int j=0;j<=i;j++)
      {
          System.out.print(ch);
      }
      System.out.println();
    }
  }
}
