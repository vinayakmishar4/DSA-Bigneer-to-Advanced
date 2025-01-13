package Recursion;

import java.util.Scanner;

class sort
{
    static int partition(int arr[],int start,int end)
    {
        int pivot =arr[start];
        int i=start;
        int j=end;
        while (i<j)
        {
           while (arr[i]<=pivot && i<=end-1)
           {
             i++; 
           }
           while(arr[j]>pivot && j>=start-1)
           {
              j--;
           }
           if(i<j)
           {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
           }
        }
        int temp=arr[start];
        arr[start]=arr[j];
        arr[j]=temp;
        return j;
    }
    static void sort(int arr[], int start, int end)
    {
        if(start<end)
        {
          int p=partition(arr, start, end);// pattrtion of array
          sort(arr, start, p-1);// smaller than pivot
          sort(arr, p+1, end);// greater than pivot
        }
    }
}
class QuckSort
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);    
      System.out.println("Enter the size of the array to sort");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements of the array");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("Unsorted array");
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println("Sorted array");
      sort.sort(arr,0,n-1);
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }    
}