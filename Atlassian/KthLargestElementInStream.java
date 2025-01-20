package Atlassian;

import java.util.PriorityQueue;

public class KthLargestElementInStream {
    class KthLargest {
   PriorityQueue<Integer> pq;
   int K;
    public KthLargest(int k, int[] nums) {
        K = k;
         pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length ; i++) {
            if(i < k) pq.add(nums[i]);
            else {
                if(nums[i] > pq.peek()) {
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
    }
    
    public int add(int val) {
        if(pq.size() < K) pq.add(val);
        else if(val > pq.peek()){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
