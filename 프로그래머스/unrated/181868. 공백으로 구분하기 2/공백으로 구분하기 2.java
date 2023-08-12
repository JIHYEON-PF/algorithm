import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" "))
                .filter(str -> !str.equals(""))
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }
}