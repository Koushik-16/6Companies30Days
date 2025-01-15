package Goldmansachs;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
   
    public List<List<Integer>> combinationSum3(int k, int n) {
        // int arr [] = new int[9];
        // for(int i = 0 ; i < arr.length ; i++) arr[i] = i+ 1;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(0,k,n,ds,ans);
        return ans;
    }

public void helper(int ind , int k , int n ,List<Integer> ds , List<List<Integer>> ans ) {
        
        if(ind == 9) {
              if(k == 0 && n == 0) {
                  ans.add(new ArrayList<>(ds));
              }
              return ;
        }

        if(ind + 1 <= n) {
            ds.add(ind + 1);
            helper(ind  + 1, k - 1, n -(ind + 1) , ds, ans);
            ds.remove(ds.size() - 1);
        }
         helper(ind + 1, k , n, ds, ans);

    }
}
