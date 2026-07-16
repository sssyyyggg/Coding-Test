class Solution {
    public boolean solution(String s) {
        
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        
        boolean a = false;
        boolean b = false;
        
        char[] ch = s.toCharArray();
        
        
        for(char c : ch){
            int n = c;
            if(n > 57){
                a = true;
            }

            if(n <= 57){
                b = true;
            }
        }
        
        if(a && b){
            return false;
        }
        return true;
    }
}