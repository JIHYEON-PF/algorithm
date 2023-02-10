import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[31];

        for (int i = 1 ; i <= 28 ; i++) {
            int submitStudent = Integer.parseInt(br.readLine());

            students[submitStudent] = 1;
        }

        int addCnt = 0;

        for (int i = 1 ; i <= 30 ; i++) {
            if (students[i] == 0) {
                bw.write(String.valueOf(i));
                if (++addCnt == 2) {
                    break;
                }
                bw.write("\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}