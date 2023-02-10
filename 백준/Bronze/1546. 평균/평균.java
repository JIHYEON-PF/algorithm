import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double N = Integer.parseInt(br.readLine());

        double[] scores = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        double max = 0;

        for (double i : scores) {
            max = Math.max(i, max);
        }

        double totalScore = 0;

        for (double i : scores) {
            totalScore += (i / max) * 100;
        }

        bw.write(String.valueOf(totalScore / N));
        bw.flush();
        bw.close();
        br.close();
    }
}