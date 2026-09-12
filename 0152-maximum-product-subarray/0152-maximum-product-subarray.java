class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int maxp=nums[0];
        int minp=nums[0];

        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int omaxp=maxp;
            int ominp=minp;

            maxp=Math.max(curr,Math.max(omaxp*curr,ominp*curr));
            minp=Math.min(curr,Math.min(omaxp*curr,ominp*curr));
            ans=Math.max(ans,maxp);
        }
        return ans;
    }
}