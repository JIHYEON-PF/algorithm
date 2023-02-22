class Solution {
    public String solution(int age) {
        char[] chr = String.valueOf(age).toCharArray();
        
        StringBuffer sb = new StringBuffer();
        
        for (char c : chr) {
            sb.append(String.format("%c", (c - '0' + 'a')));
        }
        
        return sb.toString();
    }
}