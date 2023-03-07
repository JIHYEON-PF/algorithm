class Solution {
    int[] radius;
    int[] answer;
    
    public int[] solution(String[] keyinput, int[] board) {
        answer = new int[2];
        radius = new int[]{board[0] / 2, board[1] / 2};
        
        for (String direction : keyinput) {
            move(direction);
        }
        
        return answer;
    }
    
    private void move(String direction) {
        switch (direction) {
            case "left":
                if (answer[0] > radius[0] * -1)
                    answer[0]--;
                break;
            case "right":
                if (answer[0] < radius[0])
                    answer[0]++;
                break;
            case "up":
                if (answer[1] < radius[1])
                    answer[1]++;
                break;
            case "down":
                if (answer[1] > radius[1] * -1)
                    answer[1]--;
                break;
            default:
                break;
        }
    }
}