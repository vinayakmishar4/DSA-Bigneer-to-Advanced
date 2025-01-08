// WAP to Sub Sequences of array
import java.util.Scanner;
class SubSequences
{
   static void SubSeq(int[] arr,int index,Arraylist<Integer> sub)
   {
     if(index==n)
     {
       System.out.println(sub);
       return;
     }
     sub.add(arr[index]);// take
     SubSeq(arr,index+1,sub);
     sub.add(sub.size()-1);
     sub.add(arr+index+1,sub);//remove
   }
   public static void main(String[] args) 
   {
     Scanner Sc=new Scanner(System.in);
     Arraylist<Integer> sub=new Arraylist<Integer>();
     System.out.println("Enter the Size of Array");
     int size=Sc.nextInt();
     int arr[]=new int[szie];
     System.out.println("Enter the elements of Array"); 
     int index=0;
     for(int i=0;i<size;i++)
     { 
       arr[i]=Sc.nextInt();  
     }
     for(int i=0;i<arr.length;i++)
     {
       System.,out.print(arr[i] + " ")   
     }
     SubSeq(arr,0,sub)
    }
}
