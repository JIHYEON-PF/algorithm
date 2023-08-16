import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        String str1 = Arrays.stream(before.split(""))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
        
        String str2 = Arrays.stream(after.split(""))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
        
        return Boolean.compare(str1.equals(str2), false);
    }
}