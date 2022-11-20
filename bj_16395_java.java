import java.io.*;

public class bj_16395_java {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[][] arr = new int[n][n];

        int result = 0;

        upto:for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }

                if (i == n-1 && j == k-1) {
                    result = arr[i][j];
                    break upto;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

}
