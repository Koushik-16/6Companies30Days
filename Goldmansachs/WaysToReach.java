package Goldmansachs;
import java.util.Arrays;
public class WaysToReach {
   
        int mod=1000000007;
       int numberOfWays_(int p,int end,int k,int [][]dp){
           if(k<0)return 0;
           if(k==0){
               if(p==end)return 1;
               else return 0;
           }
           if(dp[k][p+1005]!=-1)return dp[k][p+1005];
           int a=numberOfWays_(p+1,end,k-1,dp);
           int b=numberOfWays_(p-1,end,k-1,dp);
           return dp[k][p+1005]=(a%mod+b%mod)%mod;
       }
       int numberOfWays(int startPos, int endPos, int k) {
          int dp [][] = new int[k + 1][20007];
           for(int i = 0 ; i < k + 1; i++){
               Arrays.fill(dp[i],-1);
           }
           return numberOfWays_(startPos,endPos,k,dp);
       }
       
}
