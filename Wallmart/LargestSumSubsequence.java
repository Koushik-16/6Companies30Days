package Wallmart;
import java.util.ArrayList;
import java.util.Collections;

public class LargestSumSubsequence {
   
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        ArrayList<int[]> list = new ArrayList<>();
        for(int i =0 ;i < n ; i++) {
            list.add(new int[] {nums[i] , i});
        }
        Collections.sort(list , (a,b) -> b[0] - a[0]);
        ArrayList<int[]> arr  = new ArrayList<>();
        for(int i = 0 ;i < k ; i++) arr.add(list.get(i));
        Collections.sort(arr , (a,b) -> a[1] - b[1]);
        int ans [] = new int[k];
        for(int i = 0; i < k ; i++) ans[i] = arr.get(i)[0];
        return ans;
        
    }
}
