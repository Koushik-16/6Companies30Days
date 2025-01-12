package Wallmart;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacter {
   
        public String frequencySort(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch,0) + 1);
            PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
            pq.addAll(map.keySet());
            StringBuilder sb = new StringBuilder();
            while(pq.size() > 0) {
                char ch = pq.remove();
                for(int i = 0; i < map.get(ch) ; i++) sb.append(ch);
            }
            return sb.toString();
    
            
        }

}
