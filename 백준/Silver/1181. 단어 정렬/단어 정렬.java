import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0 ; i < N ; i++) {
            String str = br.readLine();

            if (map.containsKey(str)) {
                continue;
            }

            map.put(str, str.length());
        }

        int maxLengths = Collections.max(map.values());

        for (int i = 1 ; i <= maxLengths ; i++) {
            int length = i;
            List<String> tempList = map.keySet().stream()
                    .filter(key -> key.length() == length).sorted().collect(Collectors.toList());

            Collections.sort(tempList);

            for (String s : tempList) {
                bw.write(s + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}