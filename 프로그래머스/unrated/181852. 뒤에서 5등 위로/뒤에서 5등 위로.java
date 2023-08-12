import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> numList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        Collections.sort(numList);
        
        return numList.subList(5, numList.size()).stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}