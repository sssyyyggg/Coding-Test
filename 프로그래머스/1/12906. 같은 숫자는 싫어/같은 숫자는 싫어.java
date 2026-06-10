import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Queue<Integer> q = new LinkedList<>();
        
        int num = -1;
        
        for(int i : arr){
            
            
            if(q.isEmpty()){
                q.offer(i);
            } else {
                if(num == i){
                    continue;
                } else{
                  q.offer(i);  
                }    
            }
                
            num = i;
        }
        
        int[] answer = new int[q.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = q.poll();
        }
        
        return answer;
        
    }
}