package Amazon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
         Deque<Integer> dq = new ArrayDeque<>();
         for(int i = 0 ; i < n ; i++){
             
             while(dq.size() > 0 && dq.peekFirst() <= i - k) dq.pollFirst();
             while(dq.size() > 0 && arr[dq.peekLast()] < arr[i]) dq.pollLast();
             dq.addLast(i);
             if(i >= k - 1) ans.add(arr[dq.peekFirst()]);
         }
         return ans;
     }
}
