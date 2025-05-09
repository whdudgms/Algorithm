import java.util.*;
import java.io.*;

import java.util.*;
import java.io.*;

// 현재 위치에서 사과를 3번 이하 이동으로 2개 먹을수 있음 1 아님 0

import java.util.*;
import java.io.*;


public class Main{

    static int r,c;
    static int[][] graph = new int[5][5];
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static boolean success = false; // 정답 여부만 전역으로

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());


        dfs(r, c, 0, 0);

        System.out.println(success ? "1" : "0");

    }


    public static void dfs(int r, int c, int depth, int appleCount) {
        if (depth > 3 || success) return;

        int original = graph[r][c];
        if (original == 1) appleCount++;

        if (appleCount >= 2) {
            success = true;
            return;
        }

        graph[r][c] = -1; // 방문 처리

        for (int i = 0; i < 4; i++) {
            int xx = r + dx[i];
            int yy = c + dy[i];
            if (xx >= 0 && yy >= 0 && xx < 5 && yy < 5 && graph[xx][yy] != -1) {
                dfs(xx, yy, depth + 1, appleCount);
            }
        }

        graph[r][c] = original; // 백트래킹
    }
}

