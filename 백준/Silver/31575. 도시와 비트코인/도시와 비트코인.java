import java.util.*;
import java.io.*;

public class Main{

    static int[][] graph;
    static int N,M;
        static boolean[][] visited;

    static int[] dx = {0,1};
    static int[] dy = {1,0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        if(N == 1 && M == 1){
            System.out.println("Yes");
            return;
        }

        graph = new int[M][N];
        visited = new boolean[M][N];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println("No");

    }

 static void dfs(int x, int y){
        visited[y][x] = true;

        if(x == N - 1 && y == M - 1){
            System.out.println("Yes");
            System.exit(0);
        }

        for(int i = 0; i < 2; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];

            if(xx >= 0 && yy >= 0 && xx < N && yy < M
               && graph[yy][xx] == 1 && !visited[yy][xx]){
                dfs(xx, yy);
            }
        }
    }
}

