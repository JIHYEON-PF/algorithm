class Solution {
    public int solution(int slice, int n) {
        if (n % slice == 0) {
            return n / slice;
        }
        
        if (slice >= n) {
            return 1;
        }
        
        return n / slice + 1;
    }
}