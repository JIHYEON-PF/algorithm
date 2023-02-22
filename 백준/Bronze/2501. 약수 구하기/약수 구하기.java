import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1 ; i <= num1 ; i++) {
            if (num1 % i == 0) {
                list.add(i);
            }
        }
        
        if (list.size() < num2) {
            bw.write("0");
        } else {
            bw.write(list.get(num2 - 1) + "");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}