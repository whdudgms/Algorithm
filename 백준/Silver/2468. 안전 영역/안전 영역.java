import java.util.*;
import java.io.*;

public class Main{
    static int N;
    static int[][] map;
    static boolean[][] checked;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        map = new int[N][N];
        int maxHeight = 0; 
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] > maxHeight) maxHeight = map[i][j];
            }
        }
        
        int maxArea = 0;
        
        for(int h = 0; h < maxHeight+1; h++){
            checked = new boolean[N][N];
            int areaCnt = 0;
            
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(!checked[i][j] && map[i][j] > h) areaCnt += dfs(i,j,h);
                }
            }
            
            maxArea = Math.max(maxArea, areaCnt);
        }
        System.out.println(maxArea);
    }
    
    static int dfs(int r, int c, int h){
        checked[r][c] = true;
        
        for(int i = 0; i < 4; i++){
            int nr = r + dx[i];
            int nc = c + dy[i];
            
    		if(nr < 0 || nr >= N || nc < 0 || nc >= N) continue; // 범위 벗어나거나
            if(checked[nr][nc]) continue;
             if(map[nr][nc] > h) dfs(nr, nc, h); 
        }
        return 1;
    }
    
    
}