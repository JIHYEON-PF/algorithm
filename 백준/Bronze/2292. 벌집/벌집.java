import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int cnt = 1;
        int value = 1;
        
        while (true) {
            if (N == 1) {
                break;
            }
            
            value = value + 6 * cnt++;
            
            if (value >= N) {
                break;
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}