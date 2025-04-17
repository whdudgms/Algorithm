import java.io.*;
import java.util.*;

public class Main{
    
    static ArrayList<ArrayList<Integer>> arr;
    static boolean[] visit;
    static int[] cnt;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        arr = new ArrayList<>();
        visit = new boolean[n + 1];
        cnt = new int[n+1];
                      
        int max = -1;
        
        for(int i = 0; i <= n; i++){
            arr.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < m; i++){
            str = br.readLine().split(" ");
            
            int s = Integer.parseInt(str[0]);
            int e = Integer.parseInt(str[1]);
            
            arr.get(s).add(e);
        }
        
       for (int i = 1; i <= n; i++) {
			visit = new boolean[n + 1];
      // 매 번 방문 초기화
			dfs(i); // 해당 정점을 시작으로 dfs
		}
        
        for(int i = 1; i <= n; i++){
            if(max < cnt[i])
                max = cnt[i];
        }
        
        for(int i = 1; i <= n; i++){
            if(max == cnt[i])
                bw.write(i + " ");
        }
        
        bw.flush();
        bw.close();
    }
    
    public static void dfs(int n){
        visit[n] = true;
        
        for(int next :  arr.get(n)){
            
            if(visit[next])
                continue;
            
            cnt[next]++;
            dfs(next);
        }
    }
    
}