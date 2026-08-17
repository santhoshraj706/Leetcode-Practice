class Solution{
public:
  int stoneGameV(vector<int>&a){
    int n=a.size(),ans=0;
    vector<vector<int>>dp(n,vector<int>(n,-1));
    dp[0][n-1]=0;
    for(int i=0;i<n;i++){
      int tot=0;
      for(int k=i;k<n;k++)tot+=a[k];
      for(int j=n-1;j>=i;j--){
        if(dp[i][j]>=0){
          if(i==j)ans=max(ans,dp[i][j]);
          else{
            int s1=0;
            for(int l=i;l<j;l++){
              s1+=a[l];
              int s2=tot-s1;
              if(s1>=s2)dp[l+1][j]=max(dp[l+1][j],s2+dp[i][j]);
              if(s1<=s2)dp[i][l]=max(dp[i][l],s1+dp[i][j]);
            }
          }
        }
        tot-=a[j];
      }
    }
    return ans;
  }
};