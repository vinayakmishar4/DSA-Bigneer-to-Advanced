package Arrays.MEDIUM;

import java.util.Scanner;

public class Sort_012
{
    static void sortColors(int[] arr)
    {
      int n=arr.length;
      for(int i=0;i<n-1;i++)
      {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
      }   
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
       sortColors(arr);
       System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }     
}
