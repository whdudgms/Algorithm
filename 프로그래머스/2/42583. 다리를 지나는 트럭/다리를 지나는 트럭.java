import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            bridge.offer(0);
        }
        
        if(bridge_length == 1) return truck_weights.length+1;
        if(truck_weights.length == 1) return bridge_length+1;
        
        int idx = 0;
        
        int curWeight = 0;
        
        while(idx < truck_weights.length) {
            // 현재 다리에 존재하는 맨 앞 트럭의 무게를 빼준다
            curWeight -= bridge.poll();
            answer++;  // 새로운 트럭 넣기
            
            // 현재 다리에 있는 트럭 무게와 들어올 트럭 무게 합과 weight 비교
            if(curWeight + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                curWeight += truck_weights[idx++];
            }
            // 견딜 수 있는 무게보다 커지면 0을 넣는다
            else bridge.offer(0);
        }

        
        return answer + bridge_length;
    }
}