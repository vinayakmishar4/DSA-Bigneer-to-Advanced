package Problem;
// WAP to compare to strings that it subsequnces of other strings
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
class IsSub
{
  static boolean ComSub(String a,String b)
  {
     int i=0;
     int j=0;
     while(i<a.length() && j<a.length())
     {
        if(a.charAt(i)==b.charAt(j))
        {
          i++; 
        }
        j++;
     }
    return i==a.length();
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the frist Strings");
    String a=sc.nextLine();
    System.out.println("Enter the Second Strings");
    String b=sc.nextLine();
    if(ComSub(a,b))
    {
       System.out.println(a + " is Subsequnecs " + b);
    }
    else
    {
      System.out.println(a + " is Subsequnecs " + b);
    }
  }
}
