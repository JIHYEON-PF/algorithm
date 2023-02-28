import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int result = 0;

        int N = Integer.parseInt(br.readLine());
        char[] chr = br.readLine().toCharArray();

        for (int i = 0 ; i < chr.length ; i++) {
            result += (int) (chr[i]-96) * Math.pow(31,i);
        }

        bw.write(result + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}