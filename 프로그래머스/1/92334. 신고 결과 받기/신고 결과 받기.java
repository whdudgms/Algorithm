import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportMap = new HashMap<>();
        Map<String, Integer>  answerMap = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            HashSet<String> reportingId = new HashSet<>();
            reportMap.put(id_list[i], reportingId);
            answerMap.put(id_list[i], 0);
        }
        
        for(String r : report){
            String[] reportStr = r.split(" ");
            reportMap.get(reportStr[1]).add(reportStr[0]);
        }
        
        for(String reportUser : reportMap.keySet()){
            HashSet<String>  user = reportMap.get(reportUser);
            if(user.size() >= k){
                for(String userId : user){
                    answerMap.put(userId, answerMap.get(userId) +1);
                }
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = answerMap.get(id_list[i]);
        }
        
        
        return answer;
    }
}