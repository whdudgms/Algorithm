import java.util.*;

class Main{
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;
    
    public static void dfs(int idx){
        visited[idx] = true;
        answer++;
        for(int i = 1; i <= N; i++){
            if(visited[i] == false && graph[idx][i])
                dfs(i);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];
        
        int x, y;
        for(int i = 0; i < M; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            
            graph[x][y] = graph[y][x] = true;
        }
        
        dfs(1);
        
        System.out.println(answer -1);
        sc.close();
    }
}