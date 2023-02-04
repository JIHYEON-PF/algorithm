package solved;

import java.io.*;
import java.util.StringTokenizer;
public class boj_2525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int occurMin = Integer.parseInt(br.readLine());

        int nowHour = Integer.parseInt(st.nextToken());
        int nowMin = Integer.parseInt(st.nextToken());

        if (occurMin >= 60) {
            int occurHour = occurMin / 60;
            nowHour += occurHour;
            occurMin = occurMin - (occurHour * 60);
        }

        nowMin += occurMin;

        if (nowMin >= 60) {
            ++nowHour;
            nowMin -= 60;
        }

        nowHour = nowHour >= 24
                ? nowHour - 24
                : nowHour;


        bw.write(nowHour + " " + nowMin);
        bw.flush();
        bw.close();
        br.close();
    }
}
