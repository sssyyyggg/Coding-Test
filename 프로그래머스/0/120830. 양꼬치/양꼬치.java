class Solution {
    public int solution(int n, int k) {
        int service = n/10;
        int notService = k - service;
        int pay = (n*12000) + (notService*2000);
        
        return pay;
    }
}