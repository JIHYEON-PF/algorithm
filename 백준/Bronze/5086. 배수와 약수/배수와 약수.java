import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            if (num1 == 0 && num2 == 0) 
                break;
            
            if (num1 % num2 == 0) {
                bw.write("multiple");
            } else if (num2 % num1 == 0) {
                bw.write("factor");
            } else {
                bw.write("neither");
            }
            
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}