package Goldmansachs;

public class LengthEncoding {
   
        public static String encode(String s) {
           int i = 0;
           int n = s.length();
           StringBuilder sb = new StringBuilder();
           while(i < n) {
               char curr = s.charAt(i);
               int count = 0;
               while(i < n && s.charAt(i) == curr) {
                   i++;
                   count++;
               }
               sb.append(curr);
               sb.append(count);
           }
           return sb.toString();
        }
}
