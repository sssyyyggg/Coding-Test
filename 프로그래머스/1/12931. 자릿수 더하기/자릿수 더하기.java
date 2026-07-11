import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        String num = String.valueOf(n);
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        return sum;
    }
}