package Amazon;

public class Stock4 {
    
        public int maxProfit(int k, int[] prices) {
            Integer dp [][][] = new Integer[prices.length + 1][k + 1][2];
            return helper(prices,0,k-1,0,dp);
        }
        
        public int helper(int arr [] ,int ind , int k , int buy,Integer dp [][][]){
            if(k == -1) return 0;
            if(ind == arr.length ) return 0;
            if(dp[ind][k][buy] != null) return dp[ind][k][buy];
            int max = 0;
            if(buy == 0) {
                int p = -arr[ind] + helper(arr,ind + 1,k,1,dp);
                int np = helper(arr,ind + 1,k,0,dp);
                max = Math.max(p,np);
            }else {
                int p =  arr[ind] + helper(arr,ind + 1,k-1,0,dp);
                int np = helper(arr,ind + 1,k,1,dp);
                max = Math.max(p,np);
            }
            return dp[ind][k][buy] = max;
        }
    
}
