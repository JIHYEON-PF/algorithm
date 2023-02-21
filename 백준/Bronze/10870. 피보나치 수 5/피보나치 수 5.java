import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        bw.write(fibo(N) + "");
        bw.flush();
        bw.close();
        br.close();
    }
    
    static int fibo(int N) {
        if (N <= 1) {
            return N;
        }
        
        return fibo(N - 1) + fibo(N - 2);
    }
}