import java.util.Scanner;

class Main {

    static int n, m;
    static int[][] graph;
    static boolean[][] visited;

    static int num = 0;   // 그림 개수
    static int max = 0;   // 가장 넓은 그림 넓이

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    num++;
                    int area = dfs(i, j);
                    max = Math.max(max, area);
                }
            }
        }

        System.out.println(num);
        System.out.println(max);
    }

    public static int dfs(int x, int y) {
        visited[x][y] = true;
        int size = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

            if (!visited[nx][ny] && graph[nx][ny] == 1) {
                size += dfs(nx, ny);
            }
        }

        return size;
    }
}
