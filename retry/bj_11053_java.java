package retry;

import java.io.*;
import java.util.Arrays;

class bj_11053_java {

    static int[] arr;
    static int[] sequence;
    static int max = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sequence = new int[N];

        bw.write(String.valueOf(checkSequence()));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int checkSequence() {
        int result = 0;
        for (int i = 1 ; i <= arr.length; i++) {
            sequence[i-1] = 1;
            for (int j = i - 1 ; j > 0 ; j--) {
                if (arr[i-1] > arr[j-1]) {
                    sequence[i-1] = Math.max(sequence[i-1], sequence[j-1] + 1);
                }
            }
            result = Math.max(result, sequence[i-1]);
        }
        return result;
    }
}
