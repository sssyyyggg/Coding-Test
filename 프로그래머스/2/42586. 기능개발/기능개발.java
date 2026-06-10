import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] workingDay = new int[progresses.length];
        // 남은 일수 넣기
        
        for(int i = 0; i < workingDay.length; i++){
            if(((100 - progresses[i]) % speeds[i]) > 0){
                workingDay[i] = (1+(100 - progresses[i]) / speeds[i]);
            } else {
                workingDay[i] = (100 - progresses[i]) / speeds[i];
            }
            
        }
        
        int endWorking = 1;
        int num = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < workingDay.length; i++){

            if(i != 0){
                if(num >= workingDay[i]){
                    endWorking++;
                } else {
                    q.offer(endWorking);
                    endWorking = 1;
                    num = workingDay[i];
                }
            } else {
                num = workingDay[i];
            }
            
        }
        
        q.offer(endWorking);

        
        
        int[] answer = new int[q.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = q.poll();
        }
        
        return answer;
        
    }
}