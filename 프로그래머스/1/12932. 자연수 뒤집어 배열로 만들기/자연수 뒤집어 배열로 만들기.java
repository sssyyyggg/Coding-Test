class Solution {
    public int[] solution(long n) {
        String s = new StringBuilder(String.valueOf(n)).reverse().toString();
        char[] ch = s.toCharArray();
        int[] i = new int[s.length()];
        
        for(int k = 0; k < i.length; k++){
            i[k] = ch[k] - '0';
        }
        
        return i;
        
    }
}