package Atlassian;

import java.util.HashMap;

public class LongestSubarrayAtmostKFreq {
    class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int j = 0  , n = nums.length , ans = 0;
        for(int i = 0 ; i < n ; i++ ) {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
            while(map.get(nums[i]) > k) {
                if(map.get(nums[j]) == 1) map.remove(nums[j]);
                else map.put(nums[j] , map.get(nums[j]) - 1);
                j++;
            }
            ans = Math.max(ans , i - j + 1);
        }
        return ans;
    }
}
}
