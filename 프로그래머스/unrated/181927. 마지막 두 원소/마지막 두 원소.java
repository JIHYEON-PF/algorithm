class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length + 1];
        
        for (int i = 0 ; i < num_list.length ; i++) {
            if (i == num_list.length - 1) {
                result[i+1] = num_list[i] > num_list[i - 1]
                    ? num_list[i] - num_list[i - 1]
                    : num_list[i] * 2;
            }
            
            result[i] = num_list[i];
        }
        
        return result;
    }
}