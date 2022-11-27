package solved;

import java.io.*;

public class boj_2775_java {

    /*
    3층 1 5 15
    2층 1 4 10 20  35  46  74 110 155 210 276 354 445
    1층 1 3 6  10  15  21  28  36  45  55  66  78  91  105
    0층 1 2 3   4   5   6   7   8   9  10  11  12  13   14
     */

    /*
    T : 테스트 케이스
    k : 층수
    n : 호수
     */

    static int[][] dp = new int[15][14];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T ; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            if (dp[k][n - 1] != 0) {
                bw.write(dp[k][n - 1] + "\n");
            } else {
                bw.write(dp(k, n) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int dp(int k, int n) {
        for (int i = 0 ; i <= k ; i++) {
            dp[i][0] = 1;
            for (int j = 1 ; j < n ; j++) {
                if (i == 0) {
                    dp[i][j] = j + 1;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[k][n-1];
    }
}
