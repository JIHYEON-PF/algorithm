class Solution {
    public int solution(int n) {
        
        return n == Math.pow(Math.floor(Math.sqrt(n)), 2) ? 1 : 2;
    }
}