package Microsoft;
import java.util.*;

class InnerMinmoves {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n =  nums.length;
        int median  = 0;
        if(n % 2 == 1)  median = nums[n/2];
        else  median = (nums[n /2 - 1] + nums[n/2]) /2;
        int ans = 0;
        for(int val : nums) ans += Math.abs(median - val);
        return ans;
    }
} 