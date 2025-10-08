import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        
        Arrays.sort(score);
        
        int index = score.length;
        while(index >= 0){
            if(index - m >= 0){                
                index -= m;
                answer+= score[index] * m;
            }else{
                break;
            }
        }
        
        
        
        return answer;
    }
}