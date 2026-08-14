class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char i:s.toCharArray()){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int c=0;
        for(char i:s.toCharArray()){
            if(freq.get(i)==1){
                return c;
            }
            c++;
        }
        return -1;
    }
}