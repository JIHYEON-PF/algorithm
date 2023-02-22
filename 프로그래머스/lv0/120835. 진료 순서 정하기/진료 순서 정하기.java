import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] chk = emergency.clone();
        Arrays.sort(chk);
        
        int rank = emergency.length;
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        
        for (int i : chk) {
            if (!rankMap.containsKey(i)) {
                rankMap.put(i, rank--);
            }
        }
        
        int[] result = new int[emergency.length];
        
        for (int i = 0 ; i < result.length ; i++) {
            result[i] = rankMap.get(emergency[i]);
        }
        
        return result;
        
    }
}