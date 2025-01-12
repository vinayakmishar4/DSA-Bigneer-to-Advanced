package Recursion;

import java.util.ArrayList;
import java.util.Scanner;



class Solution {
   private static void merge(int[] arr, int low, int mid, int high) {
       ArrayList<Integer> temp = new ArrayList<>(); // temporary array
       int left = low;      // starting index of left half of arr
       int right = mid + 1;   // starting index of right half of arr

       //storing elements in the temporary array in a sorted manner//

       while (left <= mid && right <= high) {
           if (arr[left] <= arr[right]) {
               temp.add(arr[left]);
               left++;
           } else {
               temp.add(arr[right]);
               right++;
           }
       }

       // if elements on the left half are still left //

       while (left <= mid) {
           temp.add(arr[left]);
           left++;
       }

       //  if elements on the right half are still left //
       while (right <= high) {
           temp.add(arr[right]);
           right++;
       }

       // transfering all elements from temporary to arr //
       for (int i = low; i <= high; i++) {
           arr[i] = temp.get(i - low);
       }
   }

   public static void mergeSort(int[] arr, int low, int high) {
       if (low >= high) return;
       int mid = (low + high) / 2 ;
       mergeSort(arr, low, mid);  // left half
       mergeSort(arr, mid + 1, high); // right half
       merge(arr, low, mid, high);  // merging sorted halves
   }
}
class MergeSort 
{
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
      Solution.mergeSort(arr, 0, arr.length - 1);
      System.out.println("After sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
   } 
}
