import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> q = new LinkedList<>();
        
        
        
        for (int i = 0; i < prices.length; i++){
            int num = prices[i];
            int second = 0;
            for (int j = i+1; j < prices.length; j++){
                if(prices[j] >= num){
                    second++;
                    if(j == prices.length - 1){
                        q.offer(second);
                    }
                } else {
                    q.offer(second + 1);
                    break;
                }
            }
        }
        q.offer(0);
        int[] answer = new int[q.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = q.poll();
        }
        
        return answer;
        
    }
}