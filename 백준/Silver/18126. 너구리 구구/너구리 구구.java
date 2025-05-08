import java.util.*;
import java.io.*;





public class Main{
    static int N;
    static int[][] arr;
    static boolean[] visited;
    static long max;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        
        arr = new int[N +1][N +1];
        visited = new boolean[N + 1];
        
        for(int i = 0; i < N -1; i++){
            String[] sArr = br.readLine().split(" ");
            int v1 = Integer.parseInt(sArr[0]);
            int v2 = Integer.parseInt(sArr[1]);
            int dis = Integer.parseInt(sArr[2]);
            
            arr[v1][v2] = dis;
            arr[v2][v1] = dis;
        }
        
        
        long max = dfs(1,0);
        System.out.print(max);
    }
    
    
    static long dfs(int v, long dis){
        visited[v] = true;
        
        for(int i = 1; i <= N; i++){
            if(arr[v][i] != 0 && !visited[i]){
                max = Math.max(max, dis + arr[v][i]);
                dfs(i, dis +  arr[v][i]);
            }
        }
        return max;
    }
}