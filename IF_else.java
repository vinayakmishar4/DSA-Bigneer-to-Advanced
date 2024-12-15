import java.util.Scanner;

public class IF_else
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     int n=scanner.nextInt();
     int m=scanner.nextInt();
     if(n<m)
     {
       System.out.println("lesser");
     }
     else if(n==m)
     {
        System.out.println("equal");
     }
     else if(n>m)
     {
        System.out.println("greater");
     }
   }    
}
