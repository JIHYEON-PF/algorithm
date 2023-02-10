import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        
        int total = 0;
        
        for (int i : arr) {
            total += i;
        }
        
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}