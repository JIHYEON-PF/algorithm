import java.io.*;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(br.readLine());
        
        for (int i = 0 ; i < testCase ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int loopCnt = Integer.parseInt(st.nextToken());
            String[] strArr = st.nextToken().split("");
            
            for (String s : strArr) {
                for (int j = 0 ; j < loopCnt ; j++) {
                    bw.write(s);
                }
            }
            
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}