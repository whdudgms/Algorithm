class Solution {
    public int solution(int num) {
        int answer = 0;
        
        int i = num;
        while(true){
            if(i == 1 || answer == 500){
                break;
            }
            if(i % 2 == 1){
                i = i * 3 + 1;
            }else{
                i /= 2;
            }
            answer++;   
        }
        
        if(answer >= 500){
            return -1;
        }
        return answer;
    }
}