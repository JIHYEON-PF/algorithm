class Solution {
    public int solution(int n, int k) {
        int meal = n * 12000;
        int drink = (k - (n / 10)) < 0 
                ? 0 
                : (k - (n / 10)) * 2000;
        
        return meal + drink;
    }
}