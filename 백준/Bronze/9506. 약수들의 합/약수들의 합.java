import java.io.*;
import java.util.stream.IntStream;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            }

            int[] arr = IntStream.rangeClosed(1, num).filter(i -> num % i == 0).toArray();

            bw.write(num + "");
            if (num == Arrays.stream(arr).filter(i ->i != num).sum()) {
                bw.write(" = ");
                for (int i = 0 ; i < arr.length - 1 ; i++) {
                    if (i != 0) {
                        bw.write(" + ");
                    }
                    bw.write(arr[i] + "");
                }
            } else {
                bw.write(" is NOT perfect.");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}