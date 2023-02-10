import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int maxValue = 0;
        int valueIndex = 1;
        
        for (int i = 1 ; i <= 9 ; i++) {
            int checkValue = Integer.parseInt(br.readLine());
            if (maxValue < checkValue) {
                maxValue = checkValue;
                valueIndex = i;
            }
        }
        bw.write(maxValue+"\n"+valueIndex);
        bw.flush();
        bw.close();
        br.close();
    }
}