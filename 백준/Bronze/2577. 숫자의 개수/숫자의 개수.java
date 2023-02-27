import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long total = 1;

        for (int i = 0 ; i < 3 ; i++) {
            total *= Integer.parseInt(br.readLine());
        }

        String strArr = String.valueOf(total);

        for (int i = 0 ; i < 10 ; i++) {
            int finalI = i;
            bw.write(Arrays.stream(strArr.split("")).filter(s -> s.equals(String.valueOf(finalI))).count() + "\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}