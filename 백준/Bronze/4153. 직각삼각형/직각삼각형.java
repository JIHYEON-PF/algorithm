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
            int num3 = Integer.parseInt(st.nextToken());
            
            if (num1 == 0 && num2 == 0 && num3 == 0) {
                break;
            }
            
            int maxValue = Math.max(Math.max(num1, num2), num3);
            
            if (Math.pow(num1,2) + Math.pow(num2,2) + Math.pow(num3,2) - Math.pow(maxValue,2)
               == Math.pow(maxValue,2)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}