import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        int k = 1;
        int value = 666;

        while (k < N) {
            if (String.valueOf(++value).contains("666")) {
                k++;
            }
        }

        bw.write(value + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}