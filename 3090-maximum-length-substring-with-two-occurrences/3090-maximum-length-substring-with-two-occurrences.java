class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0)+1);
            while(freq.get(s.charAt(right))>2){
                freq.put(s.charAt(left),freq.get(s.charAt(left))-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}