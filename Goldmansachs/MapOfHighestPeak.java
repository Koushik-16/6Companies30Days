
package Goldmansachs;

import java.util.LinkedList;
import java.util.Queue;

public class MapOfHighestPeak {
  
    public int[][] highestPeak(int[][] isWater) {
        Queue<int []> q = new LinkedList<>();
        int n = isWater.length;
        int m = isWater[0].length;
        int ans [][] = new int[n][m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(isWater[i][j] == 1) {
                    ans[i][j] = 0;
                    q.add(new int [] {i , j});
                }else ans[i][j] = -1;
            }
        }
        int x [] = {0 , 0 , 1, -1};
        int y [] = {-1,1,0,0};

        while(!q.isEmpty()) {
            int curr [] = q.poll();
            for(int i = 0; i < 4 ; i++) {
                int r = curr[0] + x[i];
                int c = curr[1] + y[i];
                if(r >= 0 && c >= 0 && r < n && c < m && ans[r][c] < 0) {
                    ans[r][c] = 1 + ans[curr[0]][curr[1]];
                    q.add(new int [] {r, c});
                }
            }
        }
        return ans;

    }
}
