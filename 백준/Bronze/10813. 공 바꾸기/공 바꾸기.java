import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] result = new int[N];
        
        for (int i = 0 ; i < result.length ; i++) {
            result[i] = i + 1;
        }
        
        for (int x = 0 ; x < M ; x++) {
            st = new StringTokenizer(br.readLine());
            
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }
        
        for (int i : result) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}