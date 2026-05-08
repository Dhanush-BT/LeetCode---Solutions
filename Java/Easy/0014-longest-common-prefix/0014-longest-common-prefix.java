class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs == null || strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        StringBuilder k = new StringBuilder();

        for(char c : strs[0].toCharArray())
        {
            k.append(c);
            String prefix = k.toString();

            for(int i = 1; i < strs.length; i++)
            {
                if(!strs[i].startsWith(prefix)) 
                    return prefix.substring(0, prefix.length() - 1);
            }
        }
        return k.toString();
    }
}