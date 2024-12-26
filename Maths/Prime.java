// WAP to find prime number
import java.util.Scanner;
class Prime
{
  static void Brute(int num)
  {
    int count=0;
    for(int i=0;i<num;i++)
    {
      if(num%i==0)
      {
        count=count+1;
      }
    }
    if(count==2)
    {
      System.out.println(num + " Number is an Prime number ");
    }
    else
    {
      System.out.println(num + "Number is an not Prime number");
    }
  }
  
  static void Optimal(int num)
  {
    int count=0;
    for(int i=0;i<Math.sqrt(num);i++)
    {
      if(num%i==0)
      {
        count=count+1;
      }
    }
    if(count==2)
    {
      System.out.println(num + " Number is an Prime number ");
    }
    else
    {
      System.out.println(num + "Number is an not Prime number");
    }
  }
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int num=sc.nextInt();
    System.out.println("1.Brute Approach")
    System.out.println("2.Optimal Approach")
    switch(n)
    {
      case 1:System.out.prinhtln("Brute approach");
             Brute(num);            
             break;
      case 2:System.out.println("Optimal approach");
             Optimal(num); 
             break;
      default:System.out.println("Worng Approach");
              break;
    }
  }
}
