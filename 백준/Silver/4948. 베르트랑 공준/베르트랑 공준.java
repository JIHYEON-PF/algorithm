import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == 0) break;;
            
            int cnt = 0;
            
            for (int i = num + 1 ; i <= num * 2 ; i++) {
                if (i == 1) continue;
                
                boolean flag = true;
                for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                
                if (flag) {
                    cnt++;
                }
            }
            
            bw.write(cnt + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}