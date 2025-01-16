package Google;

import java.util.Arrays;

public class DestroyingAsteroids {
   
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        long x = (int)mass;
        for(int i = 0 ; i <  a.length ;i++){
            if(a[i] <= x)  x += (int)a[i];
            else return false;
        }
        return true;
    }
}
