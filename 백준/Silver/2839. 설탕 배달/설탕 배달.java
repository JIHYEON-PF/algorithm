import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int totalWeight = Integer.parseInt(br.readLine());
        int fiveCnt = totalWeight / 5;

        while (true) {
            int temp = totalWeight - fiveCnt * 5;

            if (temp == 0) {
                bw.write(fiveCnt + "");
                break;
            }

            if (temp % 3 == 0) {
                bw.write((fiveCnt + temp / 3) + "");
                break;
            } else {
                if (--fiveCnt < 0) {
                    bw.write("-1");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}