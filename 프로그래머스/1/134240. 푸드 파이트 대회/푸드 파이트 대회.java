class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        String fi = "";
        String end = "";
        for(int i = 1; i < food.length; i++){
            int count = food[i];
            for(int j = 0; j < count / 2; j++){
                fi = fi + i;
                end = i+ end;
            }
            
        }
        
        answer =  (fi + answer + end);
        return answer;
    }
}