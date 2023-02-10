import java.io.*;
import java.util.Arrays;

class Main {
    
    static int count = 0;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1 ; i <= N ; i++) {
            if (i < 100) {
                ++count;
                continue;
            }
            
            checkValue(i);
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static void checkValue(int i) {
        int[] arr = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
        
        int gap = 0;
        boolean isHansoo = true;
        
        for (int j = 0 ; j < arr.length - 1 ; j++) {
            if (j == 0) {
                gap = arr[j] - arr[j+1];
            } else {        
                if (gap != arr[j] - arr[j+1]) {
                    isHansoo = false;
                    break;
                }
            }
        }
        if (isHansoo) {
            ++count;
        }
    }
}