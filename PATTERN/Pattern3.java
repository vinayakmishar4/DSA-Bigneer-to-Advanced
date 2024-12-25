package PATTERN;
// Wap for the Right-Angled Number Pyramid
import java.util.Scanner;

public class Pattern3 
{
  public static void main(String[] args) 
  {
     Scanner scanner = new Scanner(System.in);
     System.out.println(" Enter the number of patterns");
     int n=scanner.nextInt();
     System.out.println("<-------Right-Angled Number Pyramid----->");
     for(int i=0; i<n; i++)
     {
        for(int j=0; j<=i; j++)
        {
            System.out.print(j+1);
        }
        System.out.println();
     }
  }    
}
