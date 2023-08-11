class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];
        int index = 0;
        
        for (int i = 0 ; i < num_list.length ; i += n) {
            result[index++] = num_list[i];
        }
        
        return result;
    }
}