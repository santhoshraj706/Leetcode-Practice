class Solution {
    public int diagonalSum(int[][] mat) {
        int right=mat.length-1;
        int left=0;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(j==right || j==left){
                    sum+=mat[i][j];
                }
            }
            left++;
            right--;
        }
        return sum;
    }
}