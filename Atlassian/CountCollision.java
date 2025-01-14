package Atlassian;

import java.util.Stack;

public class CountCollision {
    public int countCollisions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(char ch : s.toCharArray()) {
           if(ch == 'R') st.push(ch);
           else if(ch == 'S') {
                while(st.size() > 0 && st.peek() == 'R') {
                    st.pop();
                    ans++;
                }
                 st.push(ch);
           }else {
            if(st.size() > 0 && st.peek() == 'R') {
                ans += 2;
                st.pop();
                while(st.size() > 0 && st.peek() == 'R') {
                    st.pop();
                    ans++;
                }
                st.push('S');
            }else if(st.size() > 0 && st.peek() == 'S') {
                ans ++;
            }
           }
        }
        return ans;
    }
}
