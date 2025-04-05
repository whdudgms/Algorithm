import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int comN = commands.length;
        int[] answer = new int[comN];
        
        for(int i = 0; i < comN; i++){
            int intlen = commands[i][1] - commands[i][0] + 1;
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            
            int[] arAr = new int[intlen];
            
            for(int j = start; j <= end; j++){
                arAr[j - start] = array[j];
            }
            Arrays.sort(arAr);
            answer[i] = arAr[commands[i][2]-1];
            
        }
    
        
        return answer;
    }
}