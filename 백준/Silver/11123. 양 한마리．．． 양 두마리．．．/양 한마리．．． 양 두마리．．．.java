import java.util.*;
import java.io.*;

public class Main{
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int count;
    static int Y,X;
    static char[][] field;
    static boolean[][] visited;
    
    public static void main(String[] args) throws IOException {
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int num = Integer.parseInt(br.readLine());
        
        for(int k = 0;k < num; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Y = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            
            field = new char[Y][X];
            visited = new boolean[Y][X];
            
            
            
            for(int i = 0; i < Y; i++){
                String s = br.readLine();
                for(int j = 0; j < X; j++){
                    field[i][j] = s.charAt(j);
                    if('.' ==s.charAt(j))
                        visited[i][j] = true;
                }
            }
           
            count = 0;
            
           for(int i = 0; i < Y; i++){
                for(int j = 0; j < X; j++){
if (!visited[i][j]) {
    dfs(i, j);
    count++;
}

                }
            }
            System.out.println(count);
            count = 0;
        }
    }
    
    static void dfs(int y, int x){
        visited[y][x] = true;
        
        for(int i = 0;i < 4;i++){
        int yy = y + dy[i];
        int xx = x + dx[i];
            
        if(yy >= 0 && xx >= 0 && Y > yy && X > xx && visited[yy][xx] == false)
            dfs(yy,xx);
        }
    }
}