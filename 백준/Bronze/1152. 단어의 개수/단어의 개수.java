import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = 0;
        
        String[] str = br.readLine().trim().split(" ");
        
        for (String s : str) {
            if (s.equals("")) {
                continue;
            }
            ++cnt;
        }
        
        bw.write(String.valueOf(cnt));
        
        bw.flush();
        bw.close();
        br.close();
    }
}