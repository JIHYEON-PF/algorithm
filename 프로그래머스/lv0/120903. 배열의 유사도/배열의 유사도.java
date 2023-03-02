import java.util.stream.Stream;

class Solution {
    public int solution(String[] s1, String[] s2) {
        
        return (s1.length + s2.length)
            - (int) Stream.of(s1, s2).flatMap(Stream::of).distinct().count();
    }
}