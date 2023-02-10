import java.io.*;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int cnt = 1;
        long fixedFee = Integer.parseInt(st.nextToken());
        long variableFee = Integer.parseInt(st.nextToken());
        long unitcost = Integer.parseInt(st.nextToken());
        
        if (variableFee >= unitcost) {
            cnt = -1;
        }
        
        while (true) {
            if (fixedFee + variableFee * cnt < unitcost * cnt || cnt == -1) 
                break;
            ++cnt;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}