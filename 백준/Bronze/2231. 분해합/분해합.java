import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numStr = br.readLine();

        int result = 0;

        int len = numStr.length();
        int num = Integer.parseInt(numStr);

        UP:
        for (int i = num - (9 * len); i < num; i++) {
            if (i > 0) {
                if (num == i + Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum()) {
                    result = i;
                    break;
                }
            } else {
                for (int j = 10; j <= num; j++) {
                    if (num == j + Arrays.stream(String.valueOf(j).split("")).mapToInt(Integer::parseInt).sum()) {
                        result = j;
                        break UP;
                    }
                    if (num < j + Arrays.stream(String.valueOf(j).split("")).mapToInt(Integer::parseInt).sum()) {
                        break UP;
                    }
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}