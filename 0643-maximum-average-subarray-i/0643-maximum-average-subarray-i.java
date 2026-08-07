class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int left=0;
        double max=Double.NEGATIVE_INFINITY;
        for(int right=0;right<nums.length;right++){
            if(right-left+1>k){
                sum-=nums[left++];
            }
            sum+=nums[right];
            if(right-left+1==k){
                max=Math.max(sum/k,max);
            }
        }
        return max;
    }
}