import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        
        int result = 0;
        
        for (int i : arr) {
            if (i == M)
                ++result;
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}