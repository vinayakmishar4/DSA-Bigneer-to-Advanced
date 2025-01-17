package Arrays.MEDIUM;

import java.util.Scanner;

public class Sum2 
{
    public int[] twoSum(int[] nums, int target)
    {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (nums[i] + nums[j] == target) 
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
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
       System.out.println("Enter the target sum");
       int target = scanner.nextInt();
       Sum2 sum2 = new Sum2();
       int[] result = sum2.twoSum(arr, target);
       System.out.println("The indices of the two numbers that add up to the target are: " + result[0] + " and " + result[1]);
    }    
}
