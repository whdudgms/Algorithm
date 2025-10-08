class Solution {
    public String solution(int a, int b) {
        
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int answer = 0;
        
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
        
        for(int i = 0; i < a - 1; i++){
            answer += month[i];
        }
        
        answer += b - 1;
        
        
        
        return day[answer % 7];
    }
}