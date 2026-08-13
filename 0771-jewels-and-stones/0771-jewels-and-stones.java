class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char i:stones.toCharArray()){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(char i:jewels.toCharArray()){
            if(freq.containsKey(i)){
                sum+=freq.get(i);
            }
        }
        return sum;
    }
}