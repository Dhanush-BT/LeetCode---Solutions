class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length()-1,sum=0;  
        while(length >= 0 && s.charAt(length)==' ')
        {
            length--;
        }
        while(length >= 0 && s.charAt(length)!=' ')
        {
            sum++;
            length--;
        } 
        return sum;
    }
}