class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        //limi을 초과하면 그놈은 power에서 지정된 무기를 들게 된다. 
        
        // 넘버를 돌면서 약수를 구하는데 limit을 초과하면 power로 치환한다. 
        
        // 약수의 갯수를 구하는 알고리즘은 무엇인가요? 
        
        for(int i = 1; i <= number; i++){
            int count = 0; 
            
            for(int j = 1; j * j <= i; j++){
                if(j * j == i) count++;
                else if(i % j == 0) count += 2;
            }
            
            if(count > limit) count = power;
            
            answer += count;
        }
        
        return answer;
    }
}