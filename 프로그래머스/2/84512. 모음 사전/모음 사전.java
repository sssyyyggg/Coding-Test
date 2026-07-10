import java.util.*;

class Solution {
    
    List<String> list = new ArrayList<>();
    String[] vowels = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        dfs("");
        
        return list.indexOf(word) + 1;
    }
    
    public void dfs(String str){
        if(str.length() > 5) return;
        
        if(!str.equals("")) list.add(str);
        
        for(int i = 0; i < 5; i++){
            dfs(str + vowels[i]);
        }
    }
}