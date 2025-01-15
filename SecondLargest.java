// WAP to find the second largest element of an array
class SecondLargest
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
    int Secondmax=-1;
    for(int i=0;i<n;i++)
    {
      if(arr[i]>Secondmax && arr[i]!=max)
      {
        Secondmax=arr[i];
      }  
    }
    return Secondmax;
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
    System.out.println(" Second Largest Element of an Array " + m);  
  }
}
