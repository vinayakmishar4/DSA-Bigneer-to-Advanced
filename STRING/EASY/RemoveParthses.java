import java.util.Scanner;

class RemoveParthses
{
    public String removeOuterParentheses(String s)
    {
      int count=0;
      StringBuilder sc=new StringBuilder();
      for(char c:s.toCharArray())
      {
        if(c=='(')
        {
          if(count>0)
          {
            sc.append(c);
          }
          count++;
        }
        else if(c==')')
        {
          count--;
          if(count>0)
          {
            sc.append(c);
          }
        }
      }
      return sc.toString();
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String s = sc.nextLine();
      RemoveParthses obj = new RemoveParthses();
      String result = obj.removeOuterParentheses(s);
      System.out.println("The string after removing outer parentheses is: " + result);
    }
}
