// Write a program  count-and-say sequence is a sequence of digit strings
package STRING.HARD;

import java.util.Scanner;

class Countandsay 
{
   public String countAndSay(int n)
  {
        if (n == 1) 
        {
            return "1";
        }
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < prev.length(); i++) 
        {
            if (prev.charAt(i) == prev.charAt(i - 1))
            {
                count++;
            }
            else
            {
                result.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(prev.charAt(prev.length() - 1));

        return result.toString();
    }
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number:");
      int n = scanner.nextInt();
      Countandsay obj = new Countandsay();
      System.out.println("Count-and-say sequence for " + n + "th term: " + obj.countAndSay(n));
    }
}
