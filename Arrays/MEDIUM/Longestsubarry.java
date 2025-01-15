// WAP to find out longest sub array with sum k the number
package Arrays.MEDIUM;

import java.util.Scanner;

public class Longestsubarry 
{
  static int Longestsubarry(int arr[],int k)
  {
     int max=0;
     int n=arr.length;
     int sum=0;
     for(int i=0;i<n;i++)
     {
        for(int j=i;j<n;j++)
        {
            sum+=arr[j];
            if(sum==k)
            {
               max=Math.max(max,j-i+1);
            }
        }
     }
     return max;   
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
     int k = scanner.nextInt();
     int result = Longestsubarry(arr, k);
     System.out.println("Length of the longest subarray with sum " + k + " is " + result);
  }    
}