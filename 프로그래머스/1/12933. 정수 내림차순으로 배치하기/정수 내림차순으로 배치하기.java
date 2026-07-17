import java.util.*;

class Solution {
    public long solution(long n) {
        String num = String.valueOf(n);
        
        char[] ch = num.toCharArray();
        
        Arrays.sort(ch);
        
        
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            sb.append(c);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}