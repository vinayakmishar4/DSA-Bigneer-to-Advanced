package Recursion;

import java.util.Scanner;

public class RevString
{
   static boolean Rev(String str)
   {
     int left=0;
     int right=str.length()-1;;
     char l=str.charAt(left);
     char r=str.charAt(right);
     while(left<right)
     { 
       if(!Character.isLetterOrDigit(l))
       {
           left++;
       }
       if(Character.isLetterOrDigit(r))
       {
          right++;
       }
       if(Character.toLowerCase(l)!=Character.toLowerCase(r))
       {
          return false;
       }
       else
       {
         left++;
         right--;
       }  
      }
      return true;
    }
   static boolean Recursive(String str,int c)
   {
      if(c>=str.length()/2)
      {
         return true;
      }
      if(str.charAt(c)!=str.charAt(str.length()-c-1))
      {
        return false;
      }
      return Recursive(str, c+1);
   }
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the String");
      String str = scanner.next();
      System.out.println("1. Ietrative Approaches");
      System.out.println("2  Recursion Approaches");
      int n=scanner.nextInt();
      switch (n) {
        case 1:if(Rev(str)==true)
                {
                  System.out.println("This String is Pailendrome");
                }
                else
                {
                  System.out.println("This String is not a Pailendrome");
                }
                break;
        case 2:if(Recursive(str,0)==true)
               {
                 System.out.println("This String is Pailendrome");
               }
               else
               {
                 System.out.println("This String is not a Pailendrome");
               }
              break;
        default:System.out.println("No approach");
                break;
      }
    }    
}
