package Arrays.MEDIUM;
import java.util.Arrays;
import java.util.Scanner;

class MajortyElement
{
      public int majorityElement(int[] nums)
    {
       Arrays.sort(nums);
       int n=nums.length;
       return nums[n/2];         
    }
     public static void main(String[] args)
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
      MajortyElement me = new MajortyElement();
      int majority = me.majorityElement(nums);
      System.out.println("Majority element: " + majority);
    }   
}
 
