package solved;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class boj_2480 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> diceNums = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        HashSet<Integer> set = new HashSet<>(diceNums);

        if (set.size() == 1) {
            bw.write(String.valueOf(10000 + diceNums.get(0) * 1000));
        }

        if (set.size() == 2) {
            int num = (diceNums.get(0) == diceNums.get(1))
                    ? diceNums.get(0)
                    : diceNums.get(2);
            bw.write(String.valueOf(1000 + num * 100));
        }

        if (set.size() == 3) {
            int max = diceNums.get(0);
            for (int i = 1 ; i < diceNums.size() ; i++) {
                max = Math.max(max, diceNums.get(i));
            }

            bw.write(String.valueOf(max * 100));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
