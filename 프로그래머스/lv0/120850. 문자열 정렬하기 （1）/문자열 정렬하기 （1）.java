import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] i = Arrays.stream(my_string.split("")).filter(s -> s.matches("^[0-9]+")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(i);
        
        return i;
    }
}