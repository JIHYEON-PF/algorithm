class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        
        for (char c : my_string.toCharArray()) {
            sb.append(
                (int) c >= 97 
                    ? (char) (c-32)
                    : (char) (c+32)
            );
        }
        
        return sb.toString();
    }
}