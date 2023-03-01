import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        
        List<String> sl = Arrays.stream(s.split("")).collect(Collectors.toList());
        
        Collections.sort(sl);
        
        while (!sl.isEmpty()) {
            String temp = sl.remove(0);
            if (sl.contains(temp)) {
                sl.removeAll(List.of(temp));
            } else {
                sb.append(temp);
            }
        }
        
        return sb.toString();
    }
}