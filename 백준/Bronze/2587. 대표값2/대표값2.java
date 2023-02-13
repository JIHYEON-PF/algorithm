import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int result = 0;
        int[] X = new int[5];
        
        for (int i = 0 ; i < 5 ; i++) {
            X[i] = Integer.parseInt(br.readLine());
            result += X[i];
        }
        
        int average = result / 5;
        
        Arrays.sort(X);
        
        bw.write(average + "\n" + X[2]);
        bw.flush();
        bw.close();
        br.close();
    }
}