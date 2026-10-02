class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i:nums){
            if(map.containsKey(target-i)){
                return new int[] {map.get(target-i),c};
            }
            map.put(i,c);
            c++;
        }
        return new int[]{};
    }
}