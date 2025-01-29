package STRING.MEDUIM;

import java.util.Scanner;

public class MaxmiunNest
{
    public int maxDepth(String s) 
    {
        int max_depth = 0;
        int depth = 0;
        
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(') 
            {
                depth++;
                max_depth = Math.max(max_depth, depth);
            } 
            else if (s.charAt(i) == ')') 
            {
                depth--;
            }
        }
        
        return max_depth;    
    }
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a string:");
       String s = scanner.nextLine();
       MaxmiunNest obj = new MaxmiunNest();
       System.out.println("Maximum nesting depth: " + obj.maxDepth(s));
    }    
}