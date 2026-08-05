class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,c=0;
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[l]){
                l++;
                c++;
                nums[l]=nums[r];
            }
        }
        return c+1;
    }

}