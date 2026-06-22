class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 리턴 배열
        
        for(int i = 0; i < commands.length; i++){
            int[] copy = new int[commands[i][1] - commands[i][0] + 1];
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
                copy[j - (commands[i][0] - 1)] = array[j];
            }
            
            for(int k = 0; k < copy.length; k++){
                int now = copy[k];
                int min = 101;
                boolean change = false;
                int index = 0;
                for(int h = k+1; h < copy.length; h++){
                    if(min > copy[h] && copy[k] > copy[h]){
                        min = copy[h];
                        change = true;
                        index = h;
                    }
                }
                if(change){
                    int temp = now;
                    copy[k] = min; 
                    copy[index] = temp;
                }
            }
            answer[i] = copy[commands[i][2]-1];
        }
        return answer;
    }
}