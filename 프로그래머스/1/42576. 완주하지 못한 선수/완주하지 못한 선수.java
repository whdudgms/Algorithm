import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 참가자 이름과 등장 횟수를 저장할 HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 배열 순회 → 이름이 있으면 +1, 없으면 1로 초기화
        for(String player :  participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        

        // 완주자 배열 순회 → 해당 이름의 횟수를 -1
        for(String player : completion)
            map.put(player, map.get(player) -1);

        // HashMap 순회 → 값이 0이 아닌 사람(= 완주하지 못한 사람) 찾기
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}
