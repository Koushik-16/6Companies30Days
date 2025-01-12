package Amazon;

import java.util.HashMap;

public class MaxSumDisSubArray {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;
        int j = 0;
        long ans = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0 ; i< n ; i++) {
               map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
               sum += nums[i];
           if(i >= k - 1 ) {
              if(map.size() == k) ans = Math.max(ans , sum);
              if(map.get(nums[j]) == 1) map.remove(nums[j]);
              else map.put(nums[j] , map.get(nums[j]) - 1);
              sum -= nums[j];
              j++;
           }
        }
        return ans;
    }
}
