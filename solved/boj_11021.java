package solved;

import java.io.*;
import java.util.StringTokenizer;
public class boj_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write(String.format("Case #%d: %d", i, Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
