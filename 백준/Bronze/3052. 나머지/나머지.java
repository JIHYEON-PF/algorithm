import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[42];
        int result = 0;
        
        for (int i = 0 ; i < 10 ; i++) {
            int remainder = Integer.parseInt(br.readLine()) % 42;
            arr[remainder] = 1;
        }
        
        for (int i : arr) {
            if (i == 1) {
                ++result;
            }
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}