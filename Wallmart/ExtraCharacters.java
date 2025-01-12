package Wallmart;

import java.util.HashSet;

public class ExtraCharacters {
   
    public int minExtraChar(String s, String[] dict) {
        HashSet<String> set = new HashSet<>();
        Integer dp [] = new Integer[s.length() + 1];
        for(String t : dict) set.add(t);
        return helper(0,s,set , dp);
    }

    public int helper(int ind , String s , HashSet<String> set , Integer dp [] ) {
        if(ind == s.length()) return 0;
        if(dp[ind] != null) return dp[ind];
        int ans = Integer.MAX_VALUE;
        for(int i = ind + 1 ; i <= s.length() ; i++) {
            int curr = set.contains(s.substring(ind , i)) ? 0 : i - ind;
            ans = Math.min(ans , curr + helper(i , s , set , dp));
        }
        return dp[ind] = ans;
    }
}
