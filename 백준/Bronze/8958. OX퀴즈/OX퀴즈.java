import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0 ; i < N ; i++) {
            int totalScore = 0;
            int score = 0;
            
            String[] str = br.readLine().split("");
            
            for (String s : str) {
                if (s.equals("O")) {
                    totalScore += ++score;
                } else {
                    score = 0;
                }
            }
            
            bw.write(String.valueOf(totalScore));
            
            if (i < N - 1) {
                bw.write("\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}