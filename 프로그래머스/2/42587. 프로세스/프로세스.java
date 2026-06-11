import java.util.*;

class Solution {
    
    class Process {
        int id;
        int priority;
        
        Process(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        
        Queue<Process> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++){
            q.offer(new Process(i, priorities[i]));
            pq.offer(priorities[i]);
        }
        
        int answer = 0;
        
        while(!q.isEmpty()){
            Process now = q.poll();
            
            if(now.priority == pq.peek()){
                answer++;
                pq.poll();
                
                if(now.id == location){
                    return answer;
                }
            } else {
                q.offer(now);
            }
        }
        return 0;
    }
}