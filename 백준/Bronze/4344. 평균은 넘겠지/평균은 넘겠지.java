import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(br.readLine());
        
        for (int i = 0 ; i < testCase ; i++) {
            
            int[] testArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            int studentCnt = testArr[0];
            
            int totalScore = 0;
            
            for (int j = 1 ; j < testArr.length ; j++) {
                totalScore += testArr[j];
            }
            
            double averageScore = (double) totalScore / studentCnt;
            
            int overAverage = 0;
            
            for (int j = 1 ; j < testArr.length ; j++) {
                if (testArr[j] > averageScore) {
                    ++overAverage;
                }
            }
            
            bw.write(String.format("%.3f", overAverage / (double) studentCnt * 100) + "%\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}