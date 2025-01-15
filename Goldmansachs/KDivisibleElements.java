package Goldmansachs;

import java.util.HashSet;

public class KDivisibleElements {

    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;
        int count;
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < n ; i++ ){
            StringBuilder sb = new StringBuilder();
            count = 0;
            for(int j = i ; j < n ; j++ ){
                sb.append(nums[j] + "-");
                if(nums[j] % p == 0)count++;
                if(count <= k ) set.add(sb.toString());
                else break;
            }
        }
        return set.size();
    }

}
