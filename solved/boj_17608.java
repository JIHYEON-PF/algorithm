package solved;

import java.io.*;
import java.util.Stack;
public class boj_17608 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int cnt = 1;
        int peek = stack.pop();

        while(!stack.isEmpty()) {
            if (stack.peek() > peek) {
                cnt++;
                peek = stack.peek();
            }
            stack.pop();
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}
