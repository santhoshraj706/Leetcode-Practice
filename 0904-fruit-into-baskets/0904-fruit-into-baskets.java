class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int max=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            freq.put(fruits[i],freq.getOrDefault(fruits[i],0)+1);
            while(freq.size()>2){
                freq.put(fruits[left],freq.getOrDefault(fruits[left],0)-1);
                if(freq.get(fruits[left])==0){
                    freq.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}