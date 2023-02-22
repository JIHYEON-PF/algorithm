import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] chr = new char[5][15];
        
        for (int i = 0 ; i < 5 ; i++) {
            chr[i] = br.readLine().toCharArray();
        }
        
        for (int j = 0 ; j < 15 ; j++) {
            for (char[] chars : chr) {
                if (chars.length < j + 1) continue;
                if (chars[j] != '\u0000')
                    bw.write(chars[j]);
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}