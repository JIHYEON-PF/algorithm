import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int result = 0;
        
        THIS:for (int i = 0 ; i < N ; i++) {
            
            boolean[] alphabet = new boolean[26];
            char[] chr = br.readLine().toCharArray();
            
            for (int j = 0 ; j < chr.length ; j++) {
                if (j > 0 && chr[j] == chr[j-1]) {
                    continue;
                }
                
                if (alphabet[chr[j] - 97]) {
                    continue THIS;
                }
                
                alphabet[chr[j] - 97] = true;
            }
            
            ++result;
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}