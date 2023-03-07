import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        
        int width = Arrays.stream(dots).mapToInt(i -> i[0]).max().orElseThrow()
                    - Arrays.stream(dots).mapToInt(i -> i[0]).min().orElseThrow();
        
        int height = Arrays.stream(dots).mapToInt(i -> i[1]).max().orElseThrow()
                     - Arrays.stream(dots).mapToInt(i -> i[1]).min().orElseThrow();
        
        return width * height ;
    }
}