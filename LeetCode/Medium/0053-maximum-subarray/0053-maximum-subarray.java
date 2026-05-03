class Solution {
    public int maxSubArray(int[] nums) {
        int msn = 0;
        int ms = Integer.MIN_VALUE;

        for(int i : nums) {
            msn = Math.max(i, msn + i);
            ms = Math.max(ms, msn);
        }

        return ms;   // ❗ also missing in your code
    }
}