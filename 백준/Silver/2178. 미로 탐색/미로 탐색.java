import java.util.*;
import java.io.*;

public class Main{
    
    static int[][] graph;
    static int n, m;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        graph = new int[n][m];
        
        for(int i = 0; i < n; i++){
            String s =  br.readLine();
            for(int j = 0; j < m; j++){
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        visited = new boolean[n][m];

        visited[0][0] = true;
        bfs(0,0);
        System.out.println(graph[n - 1][m - 1]);
    }
    
    
    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            
            for(int i = 0; i < 4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                
                
                     if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
                
                if(visited[nextX][nextY] || graph[nextX][nextY]  == 0) continue;
                
                q.add(new int[]{nextX, nextY});
                graph[nextX][nextY] = graph[nowX][nowY] +1;
                visited[nextX][nextY]= true;
            }
            
        }
    }
    
}