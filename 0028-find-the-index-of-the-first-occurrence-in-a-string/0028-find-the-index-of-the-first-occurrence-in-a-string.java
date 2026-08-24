class Solution {
    public int strStr(String haystack, String needle) {
        int left=0;
        if(needle.length()>haystack.length()) return -1;
        for(int right=needle.length()-1;right<haystack.length();right++){
            if(haystack.substring(left,right+1).equals(needle)){
                return left;
            }
            left++;
        }
        return -1;
    }
}