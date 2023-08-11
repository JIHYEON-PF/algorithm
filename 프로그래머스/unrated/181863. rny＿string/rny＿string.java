class Solution {
    public String solution(String rny_string) {
        StringBuffer sb = new StringBuffer();
        
        for (char c : rny_string.toCharArray()) {
            if (c == 'm') {
                sb.append("rn");
            } else {
                sb.append(String.valueOf(c));
            }
        }
        
        return sb.toString();
    }
}