class Solution {
    public String reverseWords(String s) {

        String S[] = s.split("\\s+"),string="";
        for(int i=S.length-1;i>=0;i--)
        {
            string+=S[i]+" ";
        }
        return string.trim();
        
    }
}