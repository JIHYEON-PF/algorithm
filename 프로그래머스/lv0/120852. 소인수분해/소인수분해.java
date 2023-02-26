import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        int i = 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        while (n > 1) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        
        return Arrays.stream(set.toArray(new Integer[0])).mapToInt(Integer::intValue).sorted().toArray();
    }
}