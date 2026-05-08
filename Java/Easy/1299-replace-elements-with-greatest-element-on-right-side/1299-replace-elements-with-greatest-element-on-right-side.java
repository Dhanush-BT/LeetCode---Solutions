class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for(int i = n-1; i >= 0 ; i--)
        {
            int k = arr[i];
            arr[i] = max;
            max=Math.max(max,k); 
            //System.out.println(arr[i]+" "+k);
        }
        return arr;
    }
}