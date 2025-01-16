// WAP to check wethier array is sorted or not
class CheckArray
{
  static boolean Check(int arr[])
  {
     for(int i=0;i<arr.length;i++)
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
    
  }
}
