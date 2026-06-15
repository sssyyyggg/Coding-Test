class Solution {
    public long solution(int price, int money, int count) {
        
        long won = 0;
        
        for(int i = 1; i <= count; i++){
            won += price * i; 
        }
        
        if( money >= won ){
            return 0;
        } else {
            return won - money;
        }
        
    }
}