class Solution {
    public String solution(int a, int b) {
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int total = b;
        
        for(int i = 0; i < a-1; i++){
            total += days[i];
        }
        
        return week[total % 7];
    }
}