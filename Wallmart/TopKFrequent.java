package Wallmart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequent {
   
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        for(String s : words)  map.put(s,map.getOrDefault(s,0) + 1);
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> {
            if(map.get(a) != map.get(b)) return map.get(a) - map.get(b);
            else return b.compareTo(a);
        });
        for(String s : map.keySet()){
             pq.add(s);
             if(pq.size() > k) pq.poll();
        }
        List<String> ans = new ArrayList<>();
        while(pq.size() > 0) ans.add(pq.poll());
         Collections.reverse(ans);
         return ans;
    }

}
