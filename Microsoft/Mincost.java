package Microsoft;

import java.util.Arrays;

public class Mincost {
    
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n = source.length();
        int m = changed.length;
        long [][] mincost = new long[26][26];
        for(int i =0 ; i < 26 ; i++) Arrays.fill(mincost[i] , (long)1e12);
        for(int i = 0; i < 26 ; i++) mincost[i][i] = 0;
        for(int i = 0; i < m ; i++) {
            mincost[original[i] - 'a'][changed[i] - 'a'] = Math.min( mincost[original[i] - 'a'][changed[i] - 'a'] , cost[i]);
        }
        for(int k = 0 ; k < 26 ; k++) {
            for(int i = 0 ; i < 26 ; i++) {
                for(int j = 0 ; j < 26 ; j++) {
                   mincost[i][j] = Math.min(mincost[i][j] ,mincost[i][k] + mincost[k][j] );
                }
            }
        }

         long ans = 0;
        for(int i = 0 ; i < n ; i++) {
            char ori =  source.charAt(i);
            char rep =  target.charAt(i);
            if((long)mincost[ori-'a'][rep-'a'] >= (long)1e12) return -1;
            else ans += mincost[ori-'a'][rep-'a'];
        }
        return ans;
    }
}
