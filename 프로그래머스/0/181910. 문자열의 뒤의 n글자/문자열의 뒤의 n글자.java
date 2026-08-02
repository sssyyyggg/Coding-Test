class Solution {
    public String solution(String my_string, int n) {
        my_string = my_string.substring(my_string.length() - n);
        return my_string;
    }
}