// WAP to make patnthes vaild 
package STRING.HARD;

import java.util.Scanner;

public class MakeVaild
{
    public int minAddToMakeValid(String s) 
    {
        int open = 0, close = 0;
        for (char c : s.toCharArray()) 
        {
            if (c == '(') 
                open++;
            else if (c == ')') 
            {
                if (open > 0) 
                    open--;
                else 
                    close++;
            }
        }
        return open + close;  
    }
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a string:");
       String s = scanner.nextLine();
       MakeVaild obj = new MakeVaild();
       System.out.println("Minimum number of parentheses to add to make the string valid: " + obj.minAddToMakeValid(s));
    }
}
