package solved;

import java.io.*;

public class boj_2748_java {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] fibo = new long[n + 1];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2 ; i <= n ; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        bw.write(String.valueOf(fibo[n]));
        bw.flush();
        bw.close();
        br.close();
    }

}
