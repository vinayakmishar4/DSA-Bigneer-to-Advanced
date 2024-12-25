// WAP to Reverse Letter Triangle Pattern
import java.util.Scanner;

class Pattern15
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int a=sc.nextInt();
    System.out.println("Reverse Letter Triangle Pattern");
    for(int i=0;i<a;i++)
    {
      for(char ch = 'A'; ch<='A'+(a-i-1);ch++)
      {
          System.out.println(ch);
      }
      System.out.println();
    }
  }
}
