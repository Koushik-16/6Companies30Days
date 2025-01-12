package Wallmart;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
   
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp [] = new Boolean[s.length()];
		Set<String> set = new HashSet<>();
		for(int i = 0 ; i < wordDict.size() ; i++) {
			set.add(wordDict.get(i));
		}
		return helper(s,0,dp,set);
    }
    public  boolean helper(String s , int pos, Boolean dp [], Set<String> set) {
		if(pos == s.length()) return true;
		if(dp[pos] != null) return dp[pos];
		for(int i = pos ; i < s.length() ; i++) {
			if(set.contains(s.substring(pos, i+ 1))) {
				boolean c = helper(s,i+1,dp,set);
				if(c == true) return dp[pos] = true;
			}
		}
		return dp[pos] = false;
	}

}
