package solved;

import java.io.*;
import java.util.Arrays;

public class boj_1978_java {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;

        for (int i = 0; i < N; i++) {
            boolean flag = false;
            if (arr[i] == 1) {
                continue;
            }
            for (int j = 2 ; j < arr[i] ; j++) {
                if (arr[i] % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result++;
            }
        }


        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
