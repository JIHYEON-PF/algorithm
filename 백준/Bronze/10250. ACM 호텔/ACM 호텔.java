import java.io.*;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < testCase ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int visitCnt = Integer.parseInt(st.nextToken());

            int height = visitCnt % H;
            int ho = (height == 0) ? visitCnt / H : visitCnt / H + 1;

            bw.write((height == 0 ? H : height) + "" + (ho < 10 ? "0" + ho : ho) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}