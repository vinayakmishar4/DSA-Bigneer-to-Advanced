import java.util.Scanner;

class RotateArrray
{
  public void rotate(int[] nums, int k)
   {
      int n=nums.length;
      int[] temp=new int[n];
      k=k%n;
      System.arraycopy(nums,n-k,temp,0,k);
      for(int i=n-k-1;i>=0;i--)
      {
        nums[k+i]=nums[i];    
      }
      System.arraycopy(temp,0,nums,0,k);
    }
  public static void main(String []args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = scanner.nextInt();
    System.out.println("Enter the elements of the array");
    int[] nums = new int[n];
    for(int i=0; i<n; i++)
    {
      nums[i] = scanner.nextInt();
    }
    System.out.println("Enter the number of positions to rotate");
    int k = scanner.nextInt();
    RotateArrray ra = new RotateArrray();
    ra.rotate(nums, k);
    System.out.println("Array after rotation: ");
    for(int i=0; i<n; i++)
    {
      System.out.print(nums[i]+" ");
    }
  }
}
