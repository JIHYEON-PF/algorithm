class Solution {
    public int solution(int n) {
        if (n % 6 == 0) {
            return n / 6;
        }
        
        return lcm(n, 6) / 6;
    }
    
    private int gdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        
        return gdc(min, (max % min));
    }
    
    private int lcm(int a, int b) {
        return a * b / gdc(a, b);
    }
}