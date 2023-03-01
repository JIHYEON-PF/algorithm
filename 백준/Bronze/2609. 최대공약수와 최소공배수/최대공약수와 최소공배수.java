import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        int gcd = gcd(num1, num2);
        
        bw.write(gcd + "\n" + (num1 * num2 / gcd));
        bw.flush();
        bw.close();
        br.close();
    }
    
    static int gcd(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        
        if (min == 0) {
            return max;
        }
        
        return gcd(min, max % min);
    }
}