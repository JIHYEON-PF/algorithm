package solved;

import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class boj_1260 {

    /*
     * 문제
     * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
     * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
     *
     * 입력
     * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
     * 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
     *
     * 출력
     * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
     *
     * 예제 1                 예제 2                    예제 3
     * 입력       출력         입력       출력            입력            출력
     * 4 5 1     1 2 4 3      5 5 3     3 1 2 5 4      1000 1 1000    1000 999
     * 1 2       1 2 3 4      5 4       3 1 4 2 5      999 1000
     * 1 3                    5 2
     * 1 4                    1 2
     * 2 4                    3 4
     * 3 4                    3 1
     */

    static int nodeCnt, loopCnt, startNode;

    static int[][] branchs;
    static boolean[] visited;

    static Queue<Integer> q = new LinkedList<>();

    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        nodeCnt = Integer.parseInt(st.nextToken());
        loopCnt = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());

        branchs = new int[nodeCnt + 1][nodeCnt + 1];

        for (int i = 0 ; i < loopCnt ; i++) {
            st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            branchs[num1][num2] = branchs[num2][num1] = 1;
        }

        visited = new boolean[nodeCnt + 1];
        DFS(startNode);

        bw.write("\n");

        visited = new boolean[nodeCnt + 1];
        BFS(startNode);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void DFS(int startNode) throws IOException {
        visited[startNode] = true;
        bw.write(startNode + " ");

        for (int i = 0 ; i <= nodeCnt ; i++) {
            if (branchs[startNode][i] == 1 && !visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int startNode) throws IOException {
        visited[startNode] = true;
        q.add(startNode);

        while (!q.isEmpty()) {
            startNode = q.poll();
            bw.write(startNode + " ");

            for (int i = 1 ; i <= nodeCnt ; i++) {
                if (branchs[startNode][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
