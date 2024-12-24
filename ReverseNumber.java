// WAP to Reverse a number 
import java.util.Scanner;
class Rev
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int number=sc.nextInt();
    int sum=0;
    while(num>0)
    {
      int r=n%10;
      sum=sum+r*10;
      n=n/10;
    }
    System.out.println("Reverse of a number" + sum);
  }
}
