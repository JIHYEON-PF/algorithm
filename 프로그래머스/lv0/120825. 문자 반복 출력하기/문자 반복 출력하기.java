class Solution {
    public String solution(String my_string, int n) {
        char[] chr = my_string.toCharArray();
        
        StringBuffer sb = new StringBuffer();
        
        for (char c : chr) {
            sb.append(String.valueOf(c).repeat(n));
        }
        
        return sb.toString();
    }
}