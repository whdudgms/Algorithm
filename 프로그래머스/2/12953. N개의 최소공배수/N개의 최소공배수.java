class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int cnt = 0;
        while(true){
            cnt++;
            
            int num = 0;
            for(int i = 0; i < arr.length; i++){
                
                if(cnt % arr[i] == 0){
                    num++;
                }
            }
            
            if(num == arr.length){
                answer = cnt;
                break;
            }
        }
        
        return answer;
    }
}