import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] cntArr = arr.clone();
        Arrays.sort(cntArr);

        Map<Integer, Integer> map = new HashMap<>();

        int rank = 0;

        for (int i : cntArr) {
            if (!map.containsKey(i)) {
                map.put(i, rank++);
            }
        }


        for (int i : arr) {
            bw.write(map.get(i) + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}