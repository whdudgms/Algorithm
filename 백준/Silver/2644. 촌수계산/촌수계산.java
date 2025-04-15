import java.util.*;
import java.io.*;

class Main {
    // 인접 리스트로 표현한 그래프
    static ArrayList<ArrayList<Integer>> graph;
    
    // 방문 여부를 체크하는 배열
    static boolean[] visited;
    
    // 결과값(촌수), 초기값 -1 (연결이 안 되어 있을 경우를 의미)
    static int cnt = -1;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 전체 사람 수 (노드 개수)
        int n = Integer.parseInt(br.readLine());
        
        // 촌수 계산할 두 사람 (시작 노드 a, 목표 노드 b)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        // 부모-자식 관계 수 (간선 개수)
        int m = Integer.parseInt(br.readLine());
        
        // 그래프 초기화 (0번 인덱스는 사용하지 않음)
        graph = new ArrayList<>(n + 1);
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // 관계 정보를 그래프에 저장 (양방향 그래프)
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // 부모
            int y = Integer.parseInt(st.nextToken()); // 자식
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        br.close();
        
        // 방문 여부 배열 초기화
        visited = new boolean[n + 1];
        
        // DFS 실행 (a에서 b까지, 초기 촌수는 0)
        dfs(a, b, 0);
        
        // 결과 출력
        System.out.println(cnt);
    }
    
    // DFS 함수: 현재 노드 → 목표 노드까지 탐색하며 촌수 계산
    static void dfs(int node, int target, int connection) {
        visited[node] = true; // 현재 노드 방문 처리
        
        // 목표 노드에 도달한 경우, 현재 촌수를 결과로 저장하고 종료
        if(node == target) {
            cnt = connection;
            return;
        }
        
        // 인접한 노드들 중 방문하지 않은 노드에 대해 재귀 DFS
        for(int nextNode : graph.get(node)) {
            if(!visited[nextNode]) {
                dfs(nextNode, target, connection + 1); // 촌수 1 증가
            }
        }
    }
}
