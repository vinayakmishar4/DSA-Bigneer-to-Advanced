import java.util.Scanner;

class LargestNumber
{
    public String largestOddNumber(String num) 
    {
        String largestOdd = "";
        for (int i = num.length() - 1; i >= 0; i--) 
        {
            int digit = num.charAt(i) - '0';
            if (digit % 2!= 0) 
            {
                largestOdd = num.substring(0,i+1);
                break;  // Once we find the first odd digit, we break the loop.
            }
        }
        return largestOdd;    
    }
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number:");
      String num = scanner.nextLine();
      LargestNumber obj = new LargestNumber();
      String largestOdd = obj.largestOddNumber(num);
      System.out.println("The largest odd number in the given number is: " + largestOdd);
    }
}
