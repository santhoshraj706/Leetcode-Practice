class Solution {
    public static boolean isVowel(char s){
        String c="aeiou";
        if(c.indexOf(s)==-1){
            return false;
        }
        return true;
    }
    public int maxVowels(String s, int k) {
        int left=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int right=0; right < s.length(); right++) {
            if(right >= k) {
                if(isVowel(s.charAt(left))) {
                    c--;
                }   
                left++;
            }
            if(isVowel(s.charAt(right))) {
                    c++;
            }
            
            max = Math.max(max, c);

            if(c == k) return k;
        }
        return max;
    }
}