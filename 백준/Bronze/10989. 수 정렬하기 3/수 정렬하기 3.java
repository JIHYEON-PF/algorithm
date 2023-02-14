import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = 0;
        
        for (int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        
        int[] check = new int[max + 1];
        for (int i : arr) {
            check[i]++;
        }
        
        for (int i = 1 ; i < check.length ; i++) {
            check[i] += check[i-1];
        }
        
        int[] result = new int[N];
        for (int i = 0 ; i < N ; i++) {
            result[check[arr[i]] - 1] = arr[i];
            check[arr[i]]--;
        }
        
        for (int i : result) {
            bw.write(i + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}