package solved;

import java.io.*;
import java.util.StringTokenizer;

public class boj_2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if (min < 45) {
            hour = hour == 0
                    ? hour = 23
                    : --hour;
            min = 60 - (45 - min);
        } else {
            min = min - 45;
        }
        bw.write(hour + " " + min);

        bw.flush();
        bw.close();
        br.close();
    }
}
