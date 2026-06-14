import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            pq.offer(scoville[i]);
        }
        
        int answer = 0;
        
        while(!pq.isEmpty()){
            
            if(pq.peek() >= K){
                return answer;
            }
            
            if(pq.size() == 1){
                return -1;
            }
            
            int newFood = 0;
            
            if(pq.size() > 1){
                newFood = pq.poll() + (pq.poll() * 2);
            }
            
            pq.offer(newFood);
            
            answer++;
        }
        
        return answer;
    }
}