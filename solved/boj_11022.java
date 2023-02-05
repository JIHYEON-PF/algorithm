package solved;

import java.io.*;
import java.util.Arrays;
public class boj_11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= N ; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            bw.write(String.format("Case #%d: %d + %d = %d", i, arr[0], arr[1], arr[0] + arr[1]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
