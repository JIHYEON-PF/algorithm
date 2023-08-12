import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length
                ? 1
                : -1;
        }
        
        return compareArrays(arr1, arr2);
    }
    
    private int compareArrays(int[] arr1, int[] arr2) {
        int arr1Total = Arrays.stream(arr1).sum();
        int arr2Total = Arrays.stream(arr2).sum();
        
        if (arr1Total > arr2Total) {
            return 1;
        }
        if (arr1Total < arr2Total) {
            return -1;
        }
        return 0;
    }
}