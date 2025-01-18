package Goldmansachs;

import java.util.PriorityQueue;

public class KthSmallestElementQuery {
    class pair{
        String s;
        int ind;
        pair(String s , int ind){
            this.s = s; 
            this.ind = ind;
        }
    }
    public int[] smallestTrimmedNumbers(String[] nums, int[][] q) {
        int n = q.length;
        int ans [] = new int[n];
        for(int i = 0 ; i < q.length ; i++ ){
            String st [] = new String[nums.length];
            for(int  j = 0 ; j < nums.length ; j++){
                st[j] = nums[j].substring(nums[j].length() - q[i][1]);
                // System.out.println(st[j]);
            }
            PriorityQueue<pair> pq = new PriorityQueue<>((x,y) -> { 
            if(!x.s.equals(y.s)) return  x.s.compareTo(y.s) ;
            else return x.ind - y.ind;
                });
            
            for(int j =0 ; j < nums.length ; j++){
                pq.add(new pair(st[j],j));
            }
            while(q[i][0] - 1 > 0){
                pq.remove();
                q[i][0] --;
            }
            ans[i] = pq.peek().ind;
            
            
        }
        return ans;
    }

}
