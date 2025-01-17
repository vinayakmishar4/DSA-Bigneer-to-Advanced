package Arrays.MEDIUM;

import java.util.Scanner;

public class Single
{
    public int singleNumber(int[] nums) 
    {
       int xor=0;
       for(int i=0;i<nums.length;i++)
       {
          xor=xor^nums[i];
       }
       return xor;
    }
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the size of an array");
       int size = scanner.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter the elements of the array");
       for (int i = 0; i < size; i++)
       {
         arr[i] = scanner.nextInt();
       }
       Single single = new Single();
       int result = single.singleNumber(arr);
       System.out.println("The single number is: " + result);
    }    
}
