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
        
        for (int x = 0 ; x < result.length ; x++) {
            result[x] = x + 1;
        }
        
        for (int x = 0 ; x < M ; x++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            for (int y = 0 ; y <= (j - i - 1) / 2 ; y++) {
                int temp = result[i + y - 1];
                result[i + y - 1] = result[j - y - 1];
                result[j - y - 1] = temp;
            }
        }
        
        for (int i : result) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}