import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int row = 1;
        int col = 1;
        
        UPPER : for (int i = 1 ; i < 10 ; i++) {
            int[] X = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            for (int j = 1 ; j < 10 ; j++) {
                if (max < X[j - 1]) {
                    max = X[j - 1];
                    row = i;
                    col = j;
                }
                
                if (max == 100) {
                    break UPPER;
                }
            }
        }
        
        bw.write(max + "\n" + row + " " + col);
        bw.flush();
        bw.close();
        br.close();
    }
}