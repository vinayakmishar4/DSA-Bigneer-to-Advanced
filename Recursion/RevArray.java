package Recursion;

import java.util.Scanner;

public class RevArray
{
   static void printArr(int arr[])
   {
      System.out.println("Reversed Array");
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i] + " ");
      }  
    }
   static void Revearray(int arr[])
   {
      int a=0;
      int b=arr.length-1;
      while(a<b)
      {
       int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
       a=a+1;
       b=b-1;
      }
      printArr(arr);
   }
   static void RecurArray(int arr[], int start, int end)
   {
    if(start<end)
    {
       int temp=arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
       RecurArray(arr, start+1, end-1);
    }
   }
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Size of array: ");
      int size=scanner.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter elements of array: ");
      for (int i=0; i<size; i++)
      {
        arr[i]=scanner.nextInt();
      }
      System.out.println("Arrays: ");
      for (int i=0; i<arr.length; i++)
      {
        System.out.println(arr[i]);
      }
      System.out.println("1.Iterative approach: ");
      System.out.println("2.Recursive approach: ");
      int n=scanner.nextInt();
      switch (n)
      {
        case 1:Revearray(arr);
               break;
        case 2:RecurArray(arr,0, arr.length-1);
               printArr(arr);
               break;
        default:System.out.println("No approach");
                break;
      }
   }    
}
