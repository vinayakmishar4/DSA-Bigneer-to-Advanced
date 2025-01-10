// WAP to Sub Sequences of array
package Recursion;


import java.util.ArrayList;
import java.util.Scanner;
class SubSequences
{
   static void SubSeq(int[] arr,int index,ArrayList<Integer> sub)
   {
     if(index==arr.length)
     {
       System.out.println(sub);
       return;
     }
     sub.add(arr[index]);// take
     SubSeq(arr,index+1,sub);
     sub.remove(sub.size()-1);//remove
     SubSeq(arr,index+1,sub);
   }
   public static void main(String[] args) 
   {
     Scanner Sc=new Scanner(System.in);
     ArrayList<Integer> sub=new ArrayList<Integer>();
     System.out.println("Enter the Size of Array");
     int size=Sc.nextInt();
     int arr[]=new int[size];
     System.out.println("Enter the elements of Array"); 
     int index=0;
     for(int i=0;i<size;i++)
     { 
       arr[i]=Sc.nextInt();  
     }
     for(int i=0;i<arr.length;i++)
     {
       System.out.print(arr[i] + " ");   
     }
     SubSeq(arr,0,sub);
    }
}
