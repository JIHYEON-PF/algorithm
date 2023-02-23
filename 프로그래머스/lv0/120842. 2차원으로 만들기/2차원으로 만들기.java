class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int row = 0;
        int col = 0;
        
        for (int i : num_list) {
            answer[row][col] = i;
            if (col++ == n - 1) {
                col = 0;
                row++;
            }
        }
        
        return answer;
    }
}