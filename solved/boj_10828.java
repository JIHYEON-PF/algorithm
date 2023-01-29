package solved;

import java.io.*;
import java.util.Stack;

public class boj_10828 {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] commands = br.readLine().split(" ");
            String command = commands[0];
            int X = commands.length > 1
                    ? Integer.parseInt(commands[1])
                    : 0;

            switch(command) {
                case "push":
                    push(X);
                    break;
                case "pop":
                    bw.write(pop() + "\n");
                    break;
                case "size":
                    bw.write(size() + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                case "top":
                    bw.write(top() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static void push (int X) {
        stack.push(X);
    }

    private static String pop() {
        return String.valueOf(stack.isEmpty() ? -1 : stack.pop());
    }

    private static String size() {
        return String.valueOf(stack.size());
    }

    private static String empty() {
        return String.valueOf(stack.isEmpty() ? 1 : 0);
    }

    private static String top() {
        return String.valueOf(stack.isEmpty() ? -1 : stack.peek());
    }
}
