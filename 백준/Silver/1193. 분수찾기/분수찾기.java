import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int elementCnt = 1;
        int crossCnt = 1;

        int child = 1;
        int parent = 1;

        while (true) {
            if (N <= elementCnt) {
                if (crossCnt % 2 == 0) {
                    parent = elementCnt - N + 1;
                    child = crossCnt + 1 - parent;
                    break;
                } else {
                    child = elementCnt - N + 1;
                    parent = crossCnt + 1 - child;
                    break;
                }
            } else {
                elementCnt += ++crossCnt;
            }
        }
        bw.write(child + "/" + parent);
        bw.flush();
        bw.close();
        br.close();
    }
}