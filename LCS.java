// WAP to longest common subsequnecs of two Strings
import java.util.Scanner;
class LCS
{
   static int ComSub(String a,String b,int count)
  {
     int i=0;
     int j=0;
     while(s<a.length() && s<a.length())
     {
        if(s.charAt(i)==s.charAt(j))
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
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the frist Strings");
    String a=sc.nextLine();
    System.out.println("Enter the Second Strings");
    String b=sc.nextLine();
    int a=ComSub(a,b);
    System.out.println(" Longest common subsequnecs of two Strings " + a);
  }   
}
