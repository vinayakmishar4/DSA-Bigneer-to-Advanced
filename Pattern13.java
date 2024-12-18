// WAP to Increasing Number Triangle Pattern
import java.util.Scanner;
class Pattern13
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number")
    int a=sc.nextInt();
    System.out.println("Increasing Number Triangle Pattern");
    int num=1;
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=i;j++)
        {
           System.out.print(num);
           num=num+1;
        }
        System.out.println();
    }
  }
}
