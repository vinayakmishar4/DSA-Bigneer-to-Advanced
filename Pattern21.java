// WAP to Hollow Rectangle Pattern
import java.util.Scanner;

public class Pattern21 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int n=scanner.nextInt();
    System.out.println("Hollow Rectangle Pattern");
    for (int i=0; i<n; i++)
    {
      for (int j=0; j<n; j++)
      {
        if (i==0 || i==n-1 || j==0 || j==n-1)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }  
}
