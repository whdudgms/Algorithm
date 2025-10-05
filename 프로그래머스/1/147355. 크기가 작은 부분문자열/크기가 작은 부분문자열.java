class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        
        for(int i = 0; i <= t.length() - len; i++){
            long part = Long.parseLong(p);
            long all = Long.parseLong(t.substring(i, i + len));
            
            
            if(part >= all){
                answer++;
            }
                    
        }
        
        
        return answer;
    }
}