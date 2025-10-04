class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int max = b >= a ? b : a;
        int min = b >= a ? a : b;
        
        for(int i = min; i <= max; i++){
            answer += i;
        }
        return answer;
    }
}