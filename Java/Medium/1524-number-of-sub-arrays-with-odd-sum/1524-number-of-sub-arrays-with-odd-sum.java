class Solution {
    public int numOfSubarrays(int[] arr) {

        int count =0, sum = 0, odd = 0, even = 1;
        int mod = (int) (Math.pow(10,9) + 7); 

        for(int i = 0 ; i < arr.length ; i++)
        {
            sum+=arr[i];
            if(sum%2==0)
            {
                count = (count+odd) % mod;
                even ++;
            }
            else
            {
                count = (count + even) % mod;
                odd++;
            }
        }
        return count;
        
    }
}