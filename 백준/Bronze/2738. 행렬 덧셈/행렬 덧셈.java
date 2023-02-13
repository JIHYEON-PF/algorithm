import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] X = new int[N][M];
        int[][] Y = new int[N][M];
        int[][] result = new int[N][M];
        
        for (int i = 0 ; i < N ; i++) {
            X[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        
        for (int i = 0 ; i < N ; i++) {
            Y[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                result[i][j] = X[i][j] + Y[i][j];
            }
        }
        
        for (int[] i : result) {
            for (int j : i) {
                bw.write(j + " ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}