import java.io.*;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int total = 0;
        
        while (st.hasMoreTokens()) {
            total += Math.pow(Integer.parseInt(st.nextToken()),2);
        }
        
        bw.write((total % 10) + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}