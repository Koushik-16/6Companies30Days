package Wallmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int dp [] = new int[n];
        int len = 0;
        for(int i = 0; i < n ; i++){
            int max = 0;
            for(int j= 0 ; j < i ; j++){
                if(dp[j] > max && nums[i] % nums[j] == 0) max = dp[j];
            }
            dp[i] = max + 1;
            len = Math.max(len , dp[i]);
        }
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < n ;i++){
            if(dp[i] == len) {
                makeSet(i,ans,len,dp,nums);
                break;
            }
        }
        return ans;

    }

 public void makeSet(int ind, List<Integer> ans , int len , int dp [] , int nums []) {
               int next = nums[ind];
               ans.add(nums[ind]);
               len--;
               while(ind >= 0 && len > 0 ) {
                   if(dp[ind] == len && next % nums[ind] == 0) {
                       ans.add(nums[ind]);
                       len--;
                       next = nums[ind];
                   }
                   ind--;

               }
    }

}