import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int arrCount = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int min = 1000000;
        int max = -1000000;
        
        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}