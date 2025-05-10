

import java.util.*;
import java.io.*;

public class Main{

    static int N;
    static char[][] color;
    static boolean[][] visited;
    static boolean[][] visited2;

    static int result1, result2;

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        color = new char[N][N];
        visited = new boolean[N][N];
        visited2 = new boolean[N][N];


        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                color[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j]){
                    dfs1(color[i][j],i, j);
                    result1++;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited2[i][j]){
                    dfs2(color[i][j],i, j);
                    result2++;
                }
            }
        }

        System.out.print(result1 + " "+result2);
    }



    static void dfs1(char a, int y, int x){
        visited[y][x] = true;

        for(int i = 0; i < 4; i++){
            int yy = y + dy[i];
            int xx = x + dx[i];

            if(xx >= 0 && yy >= 0 && xx < N && yy < N && visited[yy][xx] == false
                    && color[yy][xx] == a){
                dfs1(a,yy,xx);
            }
        }

    }

    //적록색약
    static void dfs2(char a, int y, int x){
        visited2[y][x] = true;

        for(int i = 0; i < 4; i++){
            int yy = y + dy[i];
            int xx = x + dx[i];

            if(xx >= 0 && yy >= 0 && xx < N && yy < N && visited2[yy][xx] == false
                    && (color[yy][xx] == a ||
                    (a == 'R' &&  color[yy][xx] == 'G') ||
                    (a == 'G' &&  color[yy][xx] == 'R')  )){
                dfs2(a,yy,xx);
            }
        }

    }


}