import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(String.valueOf((int) br.readLine().charAt(0)));
        bw.flush();
        bw.close();
        br.close();
    }
}