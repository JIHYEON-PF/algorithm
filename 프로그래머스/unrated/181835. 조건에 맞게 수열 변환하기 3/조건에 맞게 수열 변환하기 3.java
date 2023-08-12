import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            return addAllElement(arr, k);
        } else 
            return multipleAllElement(arr, k);
    }
    
    private int[] addAllElement(int[] arr, int k) {
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] += k;
        }
        
        return arr;
    }
    
    private int[] multipleAllElement(int[] arr, int k) {
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] *= k;
        }
        
        return arr;
    }
}