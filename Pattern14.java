// WAP to Increasing Letter Triangle Pattern
import java.util.Scanner;
class Pattern14
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int a=sc.nextInt();
    System.out.println("Increasing Letter Triangle Pattern");
    for(int i=0;i<a;i++)
    {
      for(char c='A';c<'A'+i;c++)
      {
          System.out.print(c);
      }
      System.out.println();
    }
  }
}
