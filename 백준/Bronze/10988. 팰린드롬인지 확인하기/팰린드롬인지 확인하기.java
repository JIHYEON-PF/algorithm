import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] chr = br.readLine().toCharArray();
        
        int answer = 1;
        
        for (int i = 0 ; i < chr.length / 2 ; i++) {
            if (chr[i] != chr[chr.length - 1 - i]) {
                answer = 0;
                break;
            }
        }
        
        bw.write(answer +"");
        
        bw.flush();
        bw.close();
        br.close();
    }
}