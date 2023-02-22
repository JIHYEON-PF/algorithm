import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    static int[] arr, temp;
    static int value = -1;
    static int cnt = 0;
    static int K;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        temp = new int[N];
        
        merge_sort(0, arr.length - 1);
        bw.write(value + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    static void merge_sort(int start, int end) {
        if (cnt > K) return;
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(start, mid);
            merge_sort(mid + 1, end);
            merge(start, mid, end);
        }
    }
    
    static void merge(int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int t = 0;
        
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        
        while (j <= end) {
            temp[t++] = arr[j++];
        }
        
        i = start;
        t = 0;
        
        while (i <= end) {
            if (K == ++cnt) {
                value = temp[t];
                return;
            }
            arr[i++] = temp[t++];
        }
    }
}