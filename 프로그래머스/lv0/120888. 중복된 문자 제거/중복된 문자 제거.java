import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String my_string) {
        Queue<String> q = new LinkedList<>();
        
        for (String s : my_string.split("")) {
            if (!q.contains(s)) {
                q.add(s);
            }
        }
        
        StringBuffer sb = new StringBuffer();
        
        while (!q.isEmpty()) {
            sb.append(q.poll());
        }
        
        return sb.toString();
    }
}