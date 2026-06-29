class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        
        long castSqrt = (long) sqrt;
        
        if( castSqrt * castSqrt == n){
            return (castSqrt + 1) * (castSqrt + 1);
        }
        
        return -1;
    }
}