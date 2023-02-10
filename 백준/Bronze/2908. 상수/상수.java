import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        bw.write(String.valueOf(Math.max(reverseIntValue(num1), reverseIntValue(num2))));
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static int reverseIntValue(int num) {
        int[] numArr = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        
        int result = 0;
        for (int i = 0 ; i < numArr.length ; i++) {
            result += Math.pow(10, i) * numArr[i];
        }
        
        return result;
    }
}