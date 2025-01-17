import java.util.ArrayList;
import java.util.Scanner;

public class ProductArray
{
    public static ArrayList<Integer> productExceptSelf(int arr[]) 
    {
       ArrayList<Integer> arrayList = new ArrayList<Integer>();
       int n = arr.length;
       int producut=1;
       for(int i=0; i<n; i++)
       {
          producut *= arr[i];
       }
       System.out.println(producut);
       for(int i=0; i<n; i++)
       {
          arrayList.add(producut/arr[i]);
       }
       return arrayList;
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of an array");
       int size = sc.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter the elements of the array");
       for(int i=0;i<size;i++)
       {
         arr[i]=sc.nextInt();
       }
       ArrayList<Integer> result = productExceptSelf(arr);
       System.out.println("Product array is: " + result);
    }    
}