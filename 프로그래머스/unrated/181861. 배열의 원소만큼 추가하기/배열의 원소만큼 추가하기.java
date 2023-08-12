import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            String value = String.valueOf(num) + " ";
            sb.append(value.repeat(num));
        }
        
        return Arrays.stream(sb.toString().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
    }
}