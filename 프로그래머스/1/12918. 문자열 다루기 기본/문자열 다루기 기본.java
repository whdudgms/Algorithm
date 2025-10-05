class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            int a = s.charAt(i) - 48;
            
            if(a < 0 || a > 9){
                return false;
            }
        }
        
        
        return answer;
    }
}