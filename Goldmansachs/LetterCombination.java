package Goldmansachs;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) return res;
        String [] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations(res,digits,"",0,map);
        return res;
    }
    public void combinations(List<String> res , String digits, String curr, int index , String [] map){
    if(index == digits.length()){
        res.add(curr);
        return ;
    }
        String letters = map[digits.charAt(index) - '0'];
        for(int i =0 ;i < letters.length() ;i++){
            combinations(res,digits,curr + letters.charAt(i), index + 1,map);
        }
    }

}
