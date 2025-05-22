import java.util.*;
import java.io.*;


public class Main{
    static int N;
    static int K;
    static int[] check = new int[100001];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
        
    }
    
    
    public static void bfs(int num){
        
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        check[num] = 1;
        
        
        while(!q.isEmpty()){
            int temp = q.poll();
            
            for(int i = 0; i < 3; i++){
                int next;
                
                
                if(i == 0){
                    next = temp +1;
                }else if(i == 1){
                    next = temp -1;
                } else{
                    next = temp * 2;
                }
                
                if(next == K){
                    System.out.println(check[temp]);
                    return;
                }
                
                if(next >= 0  && next < check.length && check[next] == 0){
                    q.add(next);
                    check[next] = check[temp] +1;
                }
            }
        }           
    }
    
}