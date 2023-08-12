class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
        
        for (int num : numbers) {
            if (result > n) {
                break;
            }
            result += num;
        }
        
        return result;
    }
}