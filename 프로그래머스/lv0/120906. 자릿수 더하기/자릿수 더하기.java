import java.util.Arrays;

class Solution {
    public int solution(int n) {
        
        return (int) Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}