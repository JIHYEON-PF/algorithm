package retry;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

class bj_11053_java {
    static HashSet<Integer> set = new HashSet<>();
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.stream(arr).forEach(set::add);

        // 정리된 수열의 길이가 최대 N인것 부터 정렬하여 가능한지 여부부터 확인하여 Top - down 방식으로 확인
        for (int i = N; i > 0; i--) {
            if (checkLength(i)) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean checkLength(int N) {
        if (N > set.size()) {
            return false;
        }
        for (int i = 0 ; i <= arr.length - N ; i++) {
            ArrayList<Integer> intList = new ArrayList<>();
            for (int j = i ; j < arr.length ; j++) {
                if (intList.isEmpty()) {
                    intList.add(arr[j]);
                } else if (arr[j] > intList.get(intList.size() - 1)) {
                    intList.add(arr[j]);
                }
            }
            if (N == intList.size()) {
                return true;
            }
        }
        return false;
    }
}
