import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            Stack<String> stack = new Stack<>();
            
            int cnt = i;
            
            for(int j = 0; j < s.length(); j++){
                
                if(cnt >= s.length()){
                    cnt = 0;
                }
                
                
                               //만약 괄호가 완성되면 그 괄호는 삭제
                if ((s.charAt(cnt) == (')') || s.charAt(cnt) == ('}') || s.charAt(cnt) == (']')) && !stack.empty()) {
                        if (stack.peek().equals("(") && s.charAt(cnt) == (')')) {
                            stack.pop();
                        } else if (stack.peek().equals("{") && s.charAt(cnt) == ('}')) {
                            stack.pop();
                        } else if (stack.peek().equals("[") && s.charAt(cnt) == (']')) {
                            stack.pop();
                        }
                } else {
                    stack.add(String.valueOf(s.charAt(cnt)));
                }

                //매번 한 칸씩 밀린 스택을 만들기 위해 추가
                cnt++;
            }
            
                        //한 번 다 돌았을 때 스택이 비어있으면 answer에 1씩 더하기
            if (stack.empty()) {
                answer++;
            }
            
            
        }
        return answer;
    }
}