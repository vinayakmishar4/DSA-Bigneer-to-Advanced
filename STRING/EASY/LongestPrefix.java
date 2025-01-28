
// WAP to the find the longest prefix in the array of strings

import java.util.Scanner;

public class LongestPrefix
{
    public String longestCommonPrefix(String[] strs)
    {
        if(strs==null || strs.length==0)
       {
          return "";
       }
       String prefix=strs[0];
       for(int i=1;i<strs.length;i++)
       {
         while(strs[i].indexOf(prefix)!=0)
         {
             prefix=prefix.substring(0,prefix.length()-1);
             if(prefix.isEmpty())
             {
                return "";
             }
         }
       }
       return prefix;     
    }
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of strings:");
       int n = scanner.nextInt();
       String[] strs = new String[n];
       System.out.println("Enter the strings:");
       for(int i=0;i<n;i++)
       {
         strs[i] = scanner.next();
       }
       LongestPrefix obj = new LongestPrefix();
       String longestPrefix = obj.longestCommonPrefix(strs);
       System.out.println("The longest common prefix is: " + longestPrefix);
    }
}