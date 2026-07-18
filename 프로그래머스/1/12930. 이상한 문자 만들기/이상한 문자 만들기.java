import java.util.*;

class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        int empty = 0;
        for(int i = 0; i < s.length(); i++){
            if(ch[i] == ' '){
                empty = i+1;
                continue;
            } else {
                if(i - empty == 0 || (i - empty) % 2 == 0){
                    if(ch[i] >= 97){
                        ch[i] -= 32;
                    }
                } else{
                    if(ch[i] < 97){
                        ch[i] += 32;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder(new String(ch));
        
        return sb.toString();
    }
}
// 배열에 담고 인덱스가 2의 배수이면 대문자로 바꾸기 -32