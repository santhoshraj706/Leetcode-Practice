class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int maj=0;
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
            if(freq.get(i)>(nums.length/2)){
                maj=i;
                break;
            }
        }
        return maj;
    }
}