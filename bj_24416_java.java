import java.io.*;

public class bj_24416_java {

}

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(fib(n).toString() + " " + fibonacci(n));

        bw.flush();
        bw.close();
        br.close();
    }

    private static Integer fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    private static Integer fibonacci(int n) {
        int cnt = 0;
        for (int i = 2 ; i < n ; i++) {
            cnt++;
        }
        return cnt;
    }
}
