// WAP to sort an array using bubble sort.

import java.util.Scanner;

public class Bubble_sort
{
  static void bubblesort(int[] array)
  {
    int n=array.length;
    for(int i=0;i<n;i++)
    {
       for(int j=i+1;j<n;j++)
       {
         if(array[j]<array[i])
         {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
         }
       }
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
    System.out.println("Unsorted array");
    for (int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Sorted array");
    bubblesort(arr);
    for (int i = 0; i < arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
  }    
}
