import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        bw.write(binomial(n,r) + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    static int binomial(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        }
        return binomial(n - 1, r) + binomial(n - 1, r - 1);
    }
}