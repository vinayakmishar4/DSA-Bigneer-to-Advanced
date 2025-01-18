import java.util.HashSet;
import java.util.Scanner;

public class Remove
{
    static HashSet<Integer> removeDuplicates(int[] nums) 
    {
      HashSet<Integer> set = new HashSet();
      for(int i = 0; i < nums.length; i++)
      {
         set.add(nums[i]);
      }
      return set;
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
    HashSet<Integer> result = removeDuplicates(arr);
    System.out.println("Array after removing duplicates: " + result);
  }    
}
