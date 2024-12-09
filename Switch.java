// Switch statment 
import java.util.*;


class switch
{
   public static void main(String[] args)
    {
       Sacnner sc=new Scanner(System.in);
       System.out.println("Enter the File add/remove")
        int a=sc.nextIn();
        switch(a)
        {
           case 1:System.out.println("Please Photo Added")
           break;

           case 2:System.out.println("Please Photo Removed")
           break;

          default:System.out.println("No operation")
        }
    }
}
