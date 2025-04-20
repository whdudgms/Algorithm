class Solution {
    
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, computers, visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int node, int[][] computers, boolean[] visited){
        visited[node] = true;
        
        for (int i=0; i<computers[node].length; i++){
            if (computers[node][i] == 1 && !visited[i]){
                dfs(i, computers, visited); // 재귀적으로 dfs 탐색
            }
        }
    }
}