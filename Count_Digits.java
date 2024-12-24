// WAP to count Digits in number
import java.util.Scanner;
class CDigits
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int number=sc.nextInt();
    int sum=0;
    int count=0;
    while(num>0)
    {
      int r=n%10;
      sum=sum+r
      count=count+1;
    }
    System.out.println("Sum of Digits in a number = " + sum);
    System.out.println("Number  of Digits in a number = " + count); 
  }
}
