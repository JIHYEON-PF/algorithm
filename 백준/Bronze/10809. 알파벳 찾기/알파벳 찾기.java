import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] answer = new int[26];
        Arrays.fill(answer, -1);
        
        char[] chr = br.readLine().toCharArray();
        
        for (int i = 0 ; i < chr.length ; i++) {
            if (answer[chr[i] - 97] == -1)
                answer[chr[i] - 97] = i;
        }
        
        for (int i : answer) {
            bw.write(i + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}