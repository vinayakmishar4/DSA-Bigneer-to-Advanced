// WAP to inserion sort of an array

import java.util.Scanner;

public class Selection_sort 
{
   static void selectionSort(int arr[])
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
    System.out.println("Entering the szie of an array");
    int size = scanner.nextInt();
    int arr[] = new int[size];
    System.out.println("Entering the elements of the array");
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
    selectionSort(arr);
    for (int i = 0; i < arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
  }  
}
