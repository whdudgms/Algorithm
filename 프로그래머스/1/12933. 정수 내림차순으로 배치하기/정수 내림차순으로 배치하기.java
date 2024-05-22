class Solution {
    public long solution(long n) {
        String num = n + "";
        int[] a = new int[10];
        
        for(int i = 0; i < num.length(); i++){
            a[num.charAt(i) - 48]++;
        }
        
        long answer = 0;
        
        for(int i = 9; i >= 0; i--){
           for(int j = 0; j < a[i]; j++){
               answer *= 10;
               answer += i;
            }
        }
        
        return answer;
    }
}