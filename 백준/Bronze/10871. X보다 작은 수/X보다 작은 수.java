import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int arrLength = Integer.parseInt(st.nextToken());
        int keyValue = Integer.parseInt(st.nextToken());
        
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for (int i : arr) {
            if (i < keyValue) {
                bw.write(i + " ");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}