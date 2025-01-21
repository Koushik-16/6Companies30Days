package Google;

import java.util.Arrays;

public class RussianDoll {
    public int maxEnvelopes(int[][] e) {
        Arrays.sort(e,(a,b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        int ans = 0;
        int dp [] = new int[e.length];
        for(int i = 0 ;i < dp.length ; i++){
            int max = 0;
            for(int j = 0 ; j < i ; j++){
                if(e[j][1] < e[i][1] && max < dp[j] && e[j][0] != e[i][0]) max = dp[j];
            }
            dp[i] = max + 1;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }

}
