// WAP to find the largest element of an array
class Largest
{
  static int Max(int arr[],int n)
  {
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    System.out.println("Enter the size of array");
    int arr[]=new int[size];
    System.out.println("Enter the elements");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Array :-");
    for(int i=0;i<arr.length;i++)
    {
       System.out.print(arr[i] + " "); 
    }
    System.out.println();
    int n=arr.length;
    int m=Max(arr,n)
    System.out.println(" Largest Element of an Array " + m);  
  }
}
