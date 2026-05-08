class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] prefix = new int[nums.length];
        prefix[0]=nums[0];
        for(int i = 1; i < nums.length ; i++)
        {
            prefix[i]+= prefix[i-1]+nums[i];
        }
        int count=0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++ )
        {
            if(map.containsKey(prefix[i]-goal))
            {
                count+=map.get(prefix[i]-goal);
            }
            map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);
        }
        System.out.println(map.keySet());
    return count;
    }
}