
// WAP to check wethier array is sorted or not
import java.util.Scanner;

class CheckArray
{
  static boolean Check(int arr[],int n)
  {
     for(int i=1;i<n;i++)
     {
        if(arr[i]<arr[i-1])
        {
          return false;
        }
     }
     return true;
  }
  public static void main(String []args)
  {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = scanner.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < size; i++)
    {
      arr[i] = scanner.nextInt();
    }
    int n=arr.length;
    boolean result = Check(arr,n);
    if(result)
    {
      System.out.println("Array is sorted");
    }
    else
    {
      System.out.println("Array is not sorted");
    }
  }
}
