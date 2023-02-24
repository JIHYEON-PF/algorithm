import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        
        List<String> vower = List.of("a", "e", "i", "o", "u");
        
        return Arrays.stream(my_string.split("")).filter(s -> !vower.contains(s)).collect(Collectors.joining());
    }
}