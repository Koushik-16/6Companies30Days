package Wallmart;

public class PreOrderSerialization {
        public boolean isValidSerialization(String p) {
            String s [] = p.split(",");
            int val = 1;
            for(String node : s) {
                if(--val < 0) return false;
                if(!node.equals("#")) val +=2;
            }
            return val == 0;
            
        }
}
