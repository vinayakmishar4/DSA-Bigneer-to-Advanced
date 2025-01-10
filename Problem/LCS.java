package Problem;
// WAP to longest common subsequnecs of two Strings
import java.util.Scanner;
class LCS
{
   static int ComSub(String a,String b,int count)
  {
     int i=0;
     int j=0;
     while(i<a.length() && j<a.length())
     {
        if(a.charAt(i)==b.charAt(j))
        {
          i++;
          count=count+1;
        }
        j++;
     }
    return count;
  }
  public static void main(String[] args)
  {
    int count=0;  // Initialize a variable to store the length of longest common subsequnecs
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the frist Strings");
    String a=sc.nextLine();
    System.out.println("Enter the Second Strings");
    String b=sc.nextLine();
    ComSub(a,b,0);
    System.out.println(" Longest common subsequnecs of two Strings " + ComSub(a,b,0));
  }   
}
