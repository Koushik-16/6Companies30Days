package Wallmart;

import java.util.Arrays;

public class KDiffPairs {
   
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length;
        Integer prev = null;
        int ans = 0;
        while(i < n) {
           if(prev != null && prev == nums[i]) i++;
           else {
            int ind = binarySearch(i + 1 , n - 1, nums[i] + k , nums);
            if(ind >= 0 && ind < n) ans++;
            prev = nums[i];
            i++;
           }
        }
        return ans;
    }

    public int binarySearch(int low , int high , int target , int nums []) {
        int ans = -1;
        while(low <= high) {
            int mid = (low + high) >> 1;
            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1; 
        }
        return ans;
    }

}
