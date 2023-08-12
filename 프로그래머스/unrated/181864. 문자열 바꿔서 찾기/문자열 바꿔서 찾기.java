import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        String value = Arrays.stream(myString.split(""))
            .map(str -> str.equals("A") ? "B" : "A")
            .collect(Collectors.joining());
        
        return Boolean.compare(value.contains(pat), false);
    }
}