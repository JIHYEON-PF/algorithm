import java.util.stream.Collectors;

class Solution {
    public String solution(String cipher, int code) {
        
        int[] index = {0};
        
        return cipher.chars()
            .filter(c -> ++index[0] % code == 0)
            .mapToObj(Character::toString)
            .collect(Collectors.joining(""));
    }
}