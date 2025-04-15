import java.util.*;
import java.io.*;

class Main{
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int cnt = -1;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        
        graph = new ArrayList<>(n + 1);
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        br.close();
        
        visited = new boolean[n + 1];
        
        dfs(a,b,0);
        
        System.out.println(cnt);
    }
    
    static void dfs(int node, int target, int connection){
        visited[node] = true;
        if(node == target){
            cnt = connection;
            return;
        }
        
        for(int nextNode : graph.get(node)){
            if(!visited[nextNode]){
                dfs(nextNode, target, connection +1);
            }
        }
    }
    
}