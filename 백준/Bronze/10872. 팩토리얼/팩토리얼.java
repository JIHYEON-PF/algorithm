import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        bw.write(solved(N) + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    static int solved(int M) {
        if (M == 0) return 1;
        return M * solved(M - 1);
    }
}