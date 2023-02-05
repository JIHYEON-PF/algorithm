package solved;

import java.io.*;
import java.util.StringTokenizer;
public class boj_10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        while (true) {
            str = br.readLine();

            if (str == null)
                break;

            StringTokenizer st = new StringTokenizer(str);

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write(num1 + num2 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
