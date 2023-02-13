import java.io.*;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int blackCnt = Integer.parseInt(br.readLine());
        int[][] white = new int[101][101];
        
        for(int i = 0 ; i < blackCnt ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            for (int a = X ; a < X + 10 ; a++) {
                for (int b = Y ; b < Y + 10 ; b++) {
                    white[a][b]++;
                }
            }
        }
        
        int result = blackCnt * 100;
        
        for (int[] a : white) {
            for (int b : a) {
                if (b > 1) {
                    result -= b - 1;
                }
            }
        }
        
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}