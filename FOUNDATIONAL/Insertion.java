// WAP to sort an array using Insertion method

import java.util.Scanner;

public class Insertion
{
    static void insertionSort(int arr[]) 
    {
      int n=arr.length;    
      for(int i=0;i<n;i++)
      {
         for(int j=i;j>0;j--)
         {
            if(arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
         }
      }
    }
    
    public static void main(String args[])
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
      System.out.println("Unsorted array");
      for (int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      System.out.println("Sorted array");
      insertionSort(arr);
      for (int i = 0; i < arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }
    }    
}
