package solved;

import java.io.*;
import java.util.StringTokenizer;

public class boj_25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long totalMoney = Integer.parseInt(br.readLine());
        int productCnt = Integer.parseInt(br.readLine());

        long resultMoney = 0;

        for (int i = 0 ; i < productCnt ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            resultMoney += Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
        }

        if (resultMoney == totalMoney) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
