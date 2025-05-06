import java.util.*;
import java.io.*;

public class Main{
    static int xy;
    static int[][] field;
    static boolean[][] visited;
    static boolean success;
    
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        xy = Integer.parseInt(br.readLine());
        field = new int[xy][xy];
        visited = new boolean[xy][xy]; // ✅ 방문 체크 배열 추가
        
        StringTokenizer st;
        for(int i = 0; i < xy; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < xy; j++){
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
dfs(0, 0);
       
       if(success){
           System.out.println("HaruHaru");

       } else{
           System.out.println("Hing");

       }
        
    }
    
    public static void dfs(int x, int y){
        if (x < 0 || y < 0 || x >= xy || y >= xy) return;
        if (visited[x][y]) return; // ✅ 중복 방문 방지

        visited[x][y] = true; // ✅ 방문 처리

        int num = field[x][y];
        if (num == -1){
            success = true;
            return;
        }

        if (!success) {
            dfs(x + num, y); // 아래
            dfs(x, y + num); // 오른쪽
        }
    }
}