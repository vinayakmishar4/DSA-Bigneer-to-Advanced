// While loop in java
import java.util.Scanner;
class Loop2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int i=10;
    while(i>0)
    {
       System.out.println(a*i);
       i=i-1;
    }
  }
}
