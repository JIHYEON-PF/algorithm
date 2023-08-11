import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return num_list.length <= 10
            ? Arrays.stream(num_list)
                .reduce(1, (a,b) -> a*b)
            : Arrays.stream(num_list)
                .reduce(0, Integer::sum);
            
    }
}