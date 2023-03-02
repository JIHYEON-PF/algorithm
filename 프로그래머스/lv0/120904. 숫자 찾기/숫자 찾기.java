import java.util.Arrays;

class Solution {
    public int solution(int num, int k) {
        int[] intArr = Arrays.stream(String.valueOf(num).split(""))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        int result = -1;
        
        for(int i = 0 ; i < intArr.length ; i++) {
            if (intArr[i] == k) {
                result = i + 1;
                break;
            }
        }
        return result;
    }
}