import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    
    static int[] dirY = {-1, 0, 1, 0};
    static int[] dirX = {0, -1, 0, 1};

    static char[][] map;
    static boolean[][] visited;

    static int solved(int N, int M) {
        Node start = new Node(0, 0);

        Queue<Node> q = new LinkedList<>();
        q.add(start);
        visited[0][0] = true;

        int length = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                Node now = q.poll();

                if (now.y == N - 1 && now.x == M - 1) {
                    return length + 1;
                }
                for (int dir = 0 ; dir < 4 ; dir++) {
                    int ny = now.y + dirY[dir];
                    int nx = now.x + dirX[dir];

                    if (ny < 0 || nx < 0 || N <= ny || M <= nx || visited[ny][nx] || map[ny][nx] == '0') {
                        continue;
                    }

                    q.add(new Node(ny, nx));
                    visited[ny][nx] = true;
                }
            }
            length++;
        }

        return length;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0 ; i < N ; i++) {
            map[i] = br.readLine().toCharArray();
        }

        bw.write(solved(N, M) + "");
        bw.flush();
        bw.close();
        br.close();
    }
    
    static class Node {
        int y, x;
        
        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}