class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> freq=new HashSet<>();
        
        for(int i:nums2){
            freq.add(i);
        }
        int id=0;
        HashSet<Integer> f=new HashSet<>();
        for(int i:nums1){
            if(freq.contains(i)){
                f.add(i);
            }
        }
        int[] arr=new int[f.size()];
        for(int num:f){
            arr[id++]=num;
        }

        return arr;
    }
}