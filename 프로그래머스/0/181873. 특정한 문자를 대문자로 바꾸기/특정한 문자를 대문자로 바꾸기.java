import java.util.*;
class Solution {
    public String solution(String my_string, String alp) {
        
        char[] ch = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++){
            if(String.valueOf(ch[i]).equals(alp)){
                ch[i] = Character.toUpperCase(ch[i]);
            }
            sb.append(ch[i]);
        }
        
        return sb.toString();
    }
}