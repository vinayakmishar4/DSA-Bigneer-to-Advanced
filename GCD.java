// WAP to find GCD(Greatest common divison ) of two numbers
class LCM
{
  static int GCD(int a,int b)
  {
    if(b==0)
    {
     return b;
    }
    return GCD(b,a%b);
  }
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the frist number");
    int number1=sc.nextlnt();
    System.out.println("Enter the second number");
    int number2=sc.nextlnt();
    int result=GCD(a,b);
    System.out.print("GCD of " + number1 + "and" + number2+ " = " + result)
  }
}
