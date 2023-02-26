class Solution {
    public int solution(String s) {
        int answer = 0;
        int value = 0;
        
        String[] strArr = s.split(" ");
        
        for (String str : strArr) {
            if (str.equals("Z")) {
                answer -= value;
            } else {
                value = Integer.parseInt(str);
                answer += value;
            }
        }
        
        return answer;
    }
}