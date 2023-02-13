import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = 10000;
        List<Integer> list = new ArrayList<>();

        for (int i = M ; i <= N ; i++) {
            if (i == 1) continue;
            
            boolean flag = true;

            for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                list.add(i);
                min = Math.min(min, i);
            }
        }

        int result = 0;

        if (!list.isEmpty()) {
            for(int i : list) {
                result += i;
            }

            bw.write(result + "\n");
            bw.write(min +"");
        } else {
            result = -1;
            bw.write(result + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}