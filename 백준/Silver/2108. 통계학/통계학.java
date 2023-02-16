import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            total += arr[i];

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int modValue = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == modValue) {
                list.add(m.getKey());
            }
        }

        int mod = 0;
        if (list.size() > 1) {
            Collections.sort(list);
            mod = list.get(1);
        } else {
            mod = list.get(0);
        }

        Arrays.sort(arr);

        bw.write((int) Math.round((double) total / N) + "\n");
        bw.write(arr[N / 2] + "\n");
        bw.write(mod + "\n");
        bw.write(max - min + "");

        bw.flush();
        bw.close();
        br.close();
    }
}