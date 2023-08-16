class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        
        for (int a = i ; a <= j ; a++) {
            result += String.valueOf(a).length() 
                - String.valueOf(a).replace(String.valueOf(k), "").length();
        }
        
        return result;
    }
}