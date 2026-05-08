class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int[] prefix = new int [arr.length];
        prefix[0]= arr[0];
        for(int i = 1; i < arr.length ; i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        int j = k -1;
        int count =0;
        for(int i = -1 ; j < arr.length ; i++)
        {


            if(i == -1)
            {
                if(prefix[j]/k >= threshold)
                {
                    count++;
                }
            }
            else
            {
                if((prefix[j]-prefix[i])/k >= threshold)
                {
                    count++;
                }

            }
            j++;
        }
        return count;
        
    }
}