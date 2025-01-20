class RotateArrray
{
  public void rotate(int[] nums, int k)
   {
      int n=nums.length;
      int[] temp=new int[n];
      k=k%n;
      System.arraycopy(nums,n-k,temp,0,k);
      for(inti=n-k-1;i>=0;i--)
      {
        nums[k+i]=nums[i];    
      }
      System.arraycopy(temp,0,nums,0,k);
    }
  public static void main(String []args)
  {
    
  }
}
