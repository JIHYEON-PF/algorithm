import java.io.*;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];
        
        for (int i = 0 ; i < N ; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        
        Arrays.sort(arr, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
        
        for (int[] i : arr) {
            bw.write(i[0] + " " + i[1] + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}