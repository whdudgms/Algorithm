import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        
        Arrays.sort(participant);
        Arrays.sort(completion);

        
        int i = 0;
        
        while(i < participant.length - 1){
            
            answer = participant[i];
            
            if(!participant[i].equals(completion[i])){
                return answer;
            }
            i++;
        }
        
        
        answer = participant[i];
        return answer;
    }
}