import java.io.*;
import java.util.Set;
import java.util.HashSet;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Set<Integer> result = new HashSet<>();
        
        for (int i = 0 ; i < 10 ; i++) {
            result.add(Integer.parseInt(br.readLine()) % 42);
        }
        
        bw.write(String.valueOf(result.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}