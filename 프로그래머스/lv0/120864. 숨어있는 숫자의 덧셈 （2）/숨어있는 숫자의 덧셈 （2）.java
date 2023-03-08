class Solution {
    public int solution(String my_string) {
        my_string = " " + my_string;
        
        int start = 0;
        int end = 0;

        int answer = 0;

        String[] s = my_string.split("");

        for (int i = 0 ; i < s.length ; i++) {
            if (s[i].matches("^[0-9]+$")) {
                if (start == 0) {
                    start = i;
                }
            } else if (start > 0) {
                end = i;
            }
            if (start > 0 && i == s.length - 1 && end == 0)
                end = i + 1;
            if (start < end) {

                answer += Integer.parseInt(my_string.substring(start, end));
                start = 0;
                end = 0;
            }
        }
        
        return answer;
    }
}