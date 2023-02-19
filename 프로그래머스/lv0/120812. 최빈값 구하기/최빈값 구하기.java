import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int max = 0;
        
        for (int i : array) {
            max = Math.max(max, i);
        }
        
        int check[] = new int[max + 1];
        
        for (int i = 0 ; i < array.length ; i++) {
            check[array[i]]++;
        }
        
        int mode = 0; // 최빈값
        int modeCnt = 0; // 최빈값 개수
        
        boolean flag = false;
        
        if (check.length == 1) {
            return -1;
        }
        
        for (int i = 0 ; i < check.length ; i++) {
            if (modeCnt == check[i]) {
                flag = true;
            }
            
            if (modeCnt < check[i]) {
                mode = i;
                modeCnt = check[i];
                flag = false;
            }
        }
        
        if (flag) {
            return -1;
        }
        
        return mode;
    }
}