import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 1 ; i <= N ; i++) {
            q.add(i);
        }
        bw.write("<");
        
        while (!q.isEmpty()) {
            for (int i = 0 ; i < K - 1 ; i++) {
                q.add(q.poll());
            }
            bw.write(q.poll()+ "");
            if (!q.isEmpty()) {
                bw.write(", ");
            }
        }
        
        bw.write(">");
            
        bw.flush();
        bw.close();
        br.close();
    }
}