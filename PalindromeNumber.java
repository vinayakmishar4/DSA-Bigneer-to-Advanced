// WAP to Palindrome of a number
import java.util.Scanner;
class Palindrome
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int number=sc.nextInt();
    int sum=0;
    int temp=number;
    while(num>0)
    {
      int r=number%10;
      sum=sum+r*10;
      number=number/10;
    }
    if(temp==sum)
    {
      System.out.println(temp + "Number is Palindrome" + sum)
    }
    else
    {
      System.out.println(temp + "Number is Not a Palindrome" + sum) 
    }
  }
}
