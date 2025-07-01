import java.util.*;
import java.io.*;

public class Main {

    static int M, N;
    static int[][] graph;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로

        graph = new int[N][M];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }

        // BFS 실행
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int y = pos[0];
            int x = pos[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= 0 && nx >= 0 && ny < N && nx < M && graph[ny][nx] == 0) {
                    graph[ny][nx] = graph[y][x] + 1;
                    q.add(new int[]{ny, nx});
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, graph[i][j]);
            }
        }

        System.out.println(max - 1); // 1부터 시작했으니 -1 해줘야 함
    }
}
