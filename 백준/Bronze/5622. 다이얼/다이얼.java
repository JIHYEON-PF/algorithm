import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] chr = br.readLine().toCharArray();
        
        int result = 0;
        
        for (char c : chr) {
            int N = (int) c - 65;
            if (N <= 2) result += 3;
            else if (N <= 5) result += 4;
            else if (N <= 8) result += 5;
            else if (N <= 11) result += 6;
            else if (N <= 14) result += 7;
            else if (N <= 18) result += 8;
            else if (N <= 21) result += 9;
            else if (N <= 25) result += 10;
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}