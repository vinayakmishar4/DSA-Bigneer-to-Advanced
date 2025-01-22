// WAP to move all zero to the end
class Move
{
    public void moveZeroes(int[] nums)
    {
      ArrayList<Integer> temp = new ArrayList<>();
         int n=nums.length;       
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < n; i++) 
         {
            if (nums[i] != 0)
            {
              temp.add(nums[i]);
            }
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            nums[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++)
        {
              nums[i] = 0;
        }
    }  
  public static void main(String []args)
  {
    
  }
}
