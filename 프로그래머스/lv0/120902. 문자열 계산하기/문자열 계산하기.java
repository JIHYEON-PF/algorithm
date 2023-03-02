class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        int answer = 0;
        String oper = "+";
        
        for (String s : arr) {
            if (s.equals("+") || s.equals("-")) {
                oper = s;
                continue;
            }
            if (oper.equals("+")) {
                answer += Integer.parseInt(s);
            }
            if (oper.equals("-")) {
                answer -= Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}