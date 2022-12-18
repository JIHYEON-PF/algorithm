package solved;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class boj_11723_java {

    static Set<Integer> S = new HashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] commands = br.readLine().split(" ");

            String commandFunc = commands[0];

            int commandNum = 0;

            if (!commandFunc.equals("all") && !commandFunc.equals("empty")) {
                commandNum = Integer.parseInt(commands[1]);
            }

            switch (commandFunc) {
                case "add" -> add(commandNum);
                case "remove" -> remove(commandNum);
                case "check" -> bw.write(String.valueOf(check(commandNum)) + '\n');
                case "toggle" -> toggle(commandNum);
                case "all" -> all();
                case "empty" -> empty();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }


    private static void add(int commandNum) {
        S.add(commandNum);
    }
    private static void remove(int commandNum) {
        S.remove(commandNum);
    }
    private static Integer check(int commandNum) {
        return S.contains(commandNum)
                ? 1
                : 0;
    }
    private static void toggle(int commandNum) {
        if (S.contains(commandNum)) {
            S.remove(commandNum);
        } else {
            S.add(commandNum);
        }
    }
    private static void all() {
        S.clear();
        for (int i = 1 ; i <= 20 ; i++) {
            S.add(i);
        }
    }
    private static void empty() {
        S.clear();
    }

}
