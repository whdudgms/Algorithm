class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int hab = 0;
        
        hab += x / 10000;
        hab += (x / 1000) % 10;
        hab += (x / 100) % 10;
        hab += (x / 10 ) % 10;
        hab += x % 10;
        
        
        answer = (x % hab == 0);
        
        
        return answer;
    }
}