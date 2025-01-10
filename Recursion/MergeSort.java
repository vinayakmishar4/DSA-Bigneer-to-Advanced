package Recursion;

import java.util.ArrayList;
import java.util.Scanner;


public class MergeSort 
{

   static void Merge(int arr[],int start,int mid,int end)
   {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      int left=start;
      int right=mid+1;
      while(left<=mid && right<=end)
      {
        if(arr[left]<=arr[right])
        {
            temp.add(arr[left]);
            left++;
        }
        else
        {
            temp.add(arr[right]);
            right++;
        }
        while (left<=mid) 
        {
            temp.add(arr[left]);
            left++;
        }
        while (right<=end) 
        {
            temp.add(arr[right]);
            right++;
        }
        for (int i = start; i < end; i++)
        {
            arr[i] = temp.get(i - start);
        }
      } 
   }
   static void Msort(int arr[],int start,int end)
   {
       if(start==end)
       {
          int mid=(start+end)/2;
          Msort(arr,start,mid);
          Msort(arr,mid+1,end);
          Merge(arr,start,mid,end);
       }
   } 
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter size of Array");
      int size =scanner.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter elements of Array");
      for (int i = 0; i < size; i++)
      {
         arr[i] = scanner.nextInt();
      }
      System.out.println("Array before sorting");
      for (int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      Msort(arr, 0, arr.length - 1);
      System.out.println("Array after sorting");
      for (int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " ");
      }
   } 
}
