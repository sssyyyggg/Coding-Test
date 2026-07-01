import java.util.*;
class Solution {
    
    Set<Integer> set = new HashSet<>();
    boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        
        makeNumber("", numbers);
        
        int count = 0;
        
        for(int num : set){
            if(isPrime(num)) count++;
        }
        
        return count;
    }
    
    public void makeNumber(String current, String numbers){
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                makeNumber(current + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }     
}