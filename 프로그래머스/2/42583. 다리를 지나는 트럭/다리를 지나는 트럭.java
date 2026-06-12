import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q1 = new LinkedList<>(); // 대기 트럭
        Queue<Integer> q2 = new LinkedList<>(); // 다리 위의 공간
        
        int current_weight_sum = 0; // 현재 다리 위 트럭들의 무게 총합
        int answer = 0;
        
        // 1. 대기 트럭들 넣기
        for (int i = 0; i < truck_weights.length; i++){
            q1.offer(truck_weights[i]);
        }
        
        // 2. 다리 길이만큼 미리 0을 채우기
        for (int i = 0; i < bridge_length; i++) {
            q2.offer(0);
        }
        
        // 3. 다리 위에 차가 있거나, 대기 중인 차가 있는 동안 반복
        while(!q2.isEmpty()) {
            answer++; // 1초 흐름
            
            // [행동 1] 다리 맨 앞에서 나가는 차 빼기. 
            // 0이 나오면 그냥 빈 공간이 나간 거고, 트럭 무게가 나오면 트럭이 탈출한 것(그러면 무게 만큼 sum에서 빠진다).
            current_weight_sum -= q2.poll(); 
            
            // [행동 2] 대기 중인 다음 트럭이 다리에 올라올 수 있는지 체크
            if (!q1.isEmpty()) {
                // 다음 트럭이 다리에 오를 수 있는지 확인
                if (current_weight_sum + q1.peek() <= weight) { // 진입 가능
                    int next_truck = q1.poll(); // 진입 확정이니 대기열에서 완전히 꺼냄
                    current_weight_sum += next_truck; // 다리 누적 무게 증가
                    q2.offer(next_truck); // 다리 큐에 트럭 진입
                } else {
                    // 무게 초과로 못 들어오면, 트럭 대신 '0'을 밀어 넣어서 
                    // 다리 위에 있는 기존 트럭들은 한 칸 전진
                    q2.offer(0);
                }
            }
        }
        return answer;
    }
}