import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] result = new int[N];

        for (int i = 0 ; i < N ; i ++) {
            result[i] = i + 1;
        }

        for (int i = 0 ; i < M ; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());

            int[] temp = Arrays.copyOfRange(result, start, end);

            for (int j = 0; j < temp.length; j++) {
                result[start + j] = temp[(mid - start + j - 1) % temp.length];
            }

        }

        for (int i : result) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}