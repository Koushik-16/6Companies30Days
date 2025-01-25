package Google;

import java.util.PriorityQueue;

public class MaxProduct {
   
        public int maximumProduct(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int val : nums) pq.add(val);
            while(k > 0){
                int num = pq.remove();
                pq.add(num + 1);
                k--;
            }
            long pro = 1;
            long mod = 1000000007;
            while(pq.size() > 0){
                pro = ((pro % mod) * (pq.remove() % mod) ) % mod;
            }
            return (int)pro;
        }
    
}
