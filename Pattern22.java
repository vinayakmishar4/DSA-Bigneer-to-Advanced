// WAP to The Number Pattern
import java.util.Scanner;
public class Pattern22
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter number");
     int a=scanner.nextInt();
     System.out.println("The Number Pattern");
     for(int i=0;i<2*a-1;i++)
     {
        for(int j=0;j<2*a-1;j++)
        {
            int top = i;
            int bottom = j;
            int right = (2*a - 2) - j;
            int left = (2*a - 2) - i;
            
            System.out.print(a- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
        }
        System.out.println();
    }
   }    
}
