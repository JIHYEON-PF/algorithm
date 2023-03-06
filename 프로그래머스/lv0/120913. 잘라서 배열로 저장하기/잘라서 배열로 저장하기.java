class Solution {
    public String[] solution(String my_str, int n) {
        StringBuffer sb = new StringBuffer();
        
        int arrayLength = my_str.length() % n == 0
            ? my_str.length() / n
            : my_str.length() / n + 1;
        
        String[] result = new String[arrayLength];
        
        int k = 0;
        
        for (int i = 0 ; i < my_str.length() ; i++) {
            sb.append(my_str.charAt(i));
            
            if ((i + 1) % n == 0 || i == my_str.length() - 1) {
                result[k++] = sb.toString();
                sb = new StringBuffer();
            }
        }
        
        return result;
    }
}