import java.util.*;
import java.io.*;

public class Main{
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static char[][] field;
    static boolean[][] visited;
    static int X,Y;
    static int totalV,totalK;
    static int v,k;
    
    public static void main(String[] agrs) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        
        String s  = br.readLine();
        
        StringTokenizer st = new StringTokenizer(s);
        
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        
        field = new char[Y][X];
        visited = new boolean[Y][X];
        
        
        for (int i = 0; i < Y; i++) {
            String line = br.readLine();
            for (int j = 0; j < X; j++) {
                field[i][j] = line.charAt(j);
                if (field[i][j] == '#') {
                    visited[i][j] = true;
                }
            }
        }

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (!visited[i][j]) {
                    v = 0;
                    k = 0;
                            
        
        if (field[i][j] == 'v') v++;
        else if (field[i][j] == 'k') k++;
                    dfs(i, j);  // 이 안에서 v, k 계산

                    if (k > v) totalK += k;
                    else totalV += v;
                }
            }
        }

        System.out.println(totalK + " " + totalV);
    }

                   
    public static void dfs(int y, int x){
        visited[y][x] = true;
        
        
        for(int i = 0; i < 4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(0 <= xx && 0 <= yy && xx < X && yy < Y && visited[yy][xx] == false){
                
                if(field[yy][xx] == 'v'){
                    v++;
                }else if(field[yy][xx] == 'k'){
                    k++;
                }
               
                
                dfs(yy,xx);
            }
        }
        
    }                   
                   
}