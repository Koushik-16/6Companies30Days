package Google;

public class FindInMountainArray {
   
    public interface MountainArray {
        public int get(int index);
        public int length();
    }
 
 
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ind = findPeak(mountainArr);
        // System.out.println(ind);
        int ans = findEle(mountainArr,ind,target);
        //  System.out.println(ans);
        if(ans == -1) ans = findEle2(mountainArr,ind,target);
        return ans;
    }

    public int findEle(MountainArray arr , int ind , int target) {
        int ans = -1;
        int low = 0 , high = ind ;
        while(low <= high) {
            int mid = (low + high) /2;
              int curr = arr.get(mid);
            if(curr == target) {
                ans = mid;
                high = mid -1;
            }else if(curr < target) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }

    public int findEle2(MountainArray arr , int ind , int target) {
        int ans = -1;
        int low = ind , high = arr.length() - 1 ;
        while(low <= high) {
            int mid = (low + high) /2;
              int curr = arr.get(mid);
            if(curr == target) {
                ans = mid;
                high = mid -1;
            }else if(curr < target) high = mid - 1;
            else low = mid + 1;
        }
        return ans;
    }

    public int findPeak(MountainArray arr) {
        int n = arr.length();
        int low = 0 , high = n - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            int left =  mid - 1 < 0 ? Integer.MIN_VALUE : arr.get(mid -1);
            int right =  mid  + 1 >= n ? Integer.MAX_VALUE : arr.get(mid + 1);
            int curr = arr.get(mid);
            if(left < curr && right < curr) return mid;
            else if(left < curr && right > curr) low = mid + 1;
            else high = mid -1;
        }
        return -1;
    }

}
