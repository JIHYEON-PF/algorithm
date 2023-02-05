package solved;

import java.io.*;

public class boj_1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = N;
        int cnt = 0;

        while (true) {
            int num1 = M / 10;
            int num2 = M % 10;

            int plusResult = num1 + num2;

            M = num2 * 10 + plusResult % 10;

            ++cnt;

            if (N == M) {
                break;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
