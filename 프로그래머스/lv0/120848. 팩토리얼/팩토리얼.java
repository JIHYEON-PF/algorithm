class Solution {
    
    int recursiveCnt = 1;
    
    public int solution(int n) {
        if (n == 1) {
            return recursiveCnt;
        }
        if (n == 0) {
            return recursiveCnt - 1;
        }
        
        return solution(n / ++recursiveCnt);
    }
}