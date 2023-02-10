import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {

    static boolean[] check = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1 ; i <= 10000 ; i++) {
            selfNumber(i);
        }

        for (int i = 1 ; i < check.length ; i++) {
            if (!check[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    private static void selfNumber(int i) {

        int[] arr = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();

        int total = 0;

        for (int j : arr) {
            total += j;
        }

        if (total + i <= 10000 && !check[total + i]) {
            check[total + i] = true;
            selfNumber(total + i);
        }
    }

}
