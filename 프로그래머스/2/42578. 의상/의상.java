import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        } // 옷 종류마다 개수

        int branch = 1;
        for (int count : map.values()) {
            branch *= (count + 1);
        }
        return branch - 1;
    }
}