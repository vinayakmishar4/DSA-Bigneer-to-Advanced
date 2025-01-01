package Recursion;

import java.util.Scanner;

public class RevArray
{
   static void RevArr(int arr[])
   {
      int arr1[]=new int[arr.length];
      int max=Integer.MAX_VALUE;
      for(int i=0; i<arr.length; i++)
      {
         if(max<arr[i])
         {
            arr1[i]=arr[i]+swap(max,arr[i]);
         }
      }
   }
   static void swap(int a,int b)
   {
      int temp=a;
      a=b;
      b=temp;
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
        System.out.print(arr[i]+" ");
      }
      System.out.println("1.Iterative approach: ");
      System.out.println("2.Recursive approach: ");
      int n=scanner.nextInt();
      switch (n)
      {
        case 1:
              break;
      
        default:
                break;
      }
   }    
}
