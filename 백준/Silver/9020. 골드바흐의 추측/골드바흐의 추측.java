import java.io.*;

class Main {
    static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0 ; t < testCase ; t++) {
            int num = Integer.parseInt(br.readLine());

            int dis = num;
            int prime = 0;
            int another = 0;

            for (int i = 2 ; i <= num ; i++) {
                if (isPrime(i) && isPrime(num - i)) {
                    if (dis > Math.abs(i - (num - i))) {
                        prime = i;
                        another = num - i;
                        dis = Math.abs(prime - another);
                    }
                }
            }
            bw.write(Math.min(prime, another) + " " + Math.max(prime, another) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}