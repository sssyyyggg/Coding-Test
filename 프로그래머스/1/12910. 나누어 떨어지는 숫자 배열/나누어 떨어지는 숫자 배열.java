import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                 count++;
                list.add(arr[i]);
            }
        }
        int[] a = {-1};
        
        if(count == 0) return a;
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}