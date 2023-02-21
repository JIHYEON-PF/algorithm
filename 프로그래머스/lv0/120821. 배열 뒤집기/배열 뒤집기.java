import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = IntStream.rangeClosed(1, num_list.length)
            .boxed().mapToInt(i -> num_list[num_list.length - i])
            .toArray();
        
        return answer;
    }
}