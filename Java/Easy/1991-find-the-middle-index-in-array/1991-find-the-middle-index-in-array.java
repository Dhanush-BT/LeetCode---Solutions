class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0, lsum= 0 ,rsum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum+=nums[i];
        }
        for(int i = 0; i < nums.length ; i++)
        {
            lsum += (i==0)? 0 : nums[i-1];
            rsum = ( (sum - lsum) - nums[i] );

            //System.out.println(sum+" "+lsum+" "+rsum+" "+nums[i]);
            if(lsum == rsum)
            {
                return i;
            }  
        }
        return -1;
        
    }
}