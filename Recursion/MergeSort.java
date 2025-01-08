package Recursion;

import java.util.Scanner;

public class MergeSort 
{
   static void Msort(int arr[],int start,int end)
   {

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
   } 
}
