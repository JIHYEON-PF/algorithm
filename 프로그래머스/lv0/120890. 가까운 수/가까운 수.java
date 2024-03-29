class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int min = n;
        
        for (int i : array) {
            if (Math.abs(n - i) < min) {
                min = Math.abs(n - i);
                answer = i;
            } else if(Math.abs(n - i) == min) {
                answer = Math.min(i, answer);
            }
        }
        
        return answer;
    }
}