// WAP to move all zero to the end

import java.util.ArrayList;
import java.util.Scanner;

class Move
{
    public void moveZeroes(int[] nums)
    {
      ArrayList<Integer> temp = new ArrayList<>();
         int n=nums.length;       
        for (int i = 0; i < n; i++) 
         {
            if (nums[i] != 0)
            {
              temp.add(nums[i]);
            }
        }
        int nz = temp.size();
        for (int i = 0; i < nz; i++) {
            nums[i] = temp.get(i);
        }
        for (int i = nz; i < n; i++)
        {
              nums[i] = 0;
        }
    }  
  public static void main(String []args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = scanner.nextInt();
    System.out.println("Enter the elements of the array");
    int[] nums = new int[n];
    for(int i=0; i<n; i++)
    {
      nums[i] = scanner.nextInt();
    }
    Move move = new Move();
    move.moveZeroes(nums);
    System.out.println("Array after moving zeroes to the end:");
    for(int i=0; i<n; i++)
    {
      System.out.print(nums[i] + " ");
    }

  }
}
