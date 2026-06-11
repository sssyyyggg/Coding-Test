class Solution {
    boolean solution(String s) {
        
        String[] arr = s.split("");
        
        int open = 0;
        
        // Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if( arr[i].equals("(") ){
                open++;
            } else {
                open--;
            }
            if ( open < 0 ){
                return false;
            }
        }
        
        return open == 0;
        
    }
}