import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNum = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strNum[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNum, (a,b) -> (b+a).compareTo(a+b));
        
        if(strNum[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String a : strNum){
            sb.append(a);
        }
        
        return sb.toString();
    }
}