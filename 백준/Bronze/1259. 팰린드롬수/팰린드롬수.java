import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            int N = Integer.parseInt(br.readLine());
            
            if (N == 0) {
                break;
            }
            
            bw.write(isPalendrom(N) + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    static String isPalendrom(int N) {
        String[] strArr = String.valueOf(N).split("");
        
        for (int i = 0 ; i < strArr.length / 2 ; i++) {
            if (!strArr[i].equals(strArr[strArr.length - 1 - i])) {
                return "no";
            }
        }
        return "yes";
    }
}