import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        int n = citations.length;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < n; i++){
            int h = n - i; // 오름차순으로 정렬했을 때, citations[i] 만큼 인용된 논문은 n - i개 있을 것 이다. -> i가 늘어날수록 포함되는 인덱스는 줄어드니까.
            if(citations[i] >= h){
                return h;
            }
        }
        return 0;
    }
}