import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        
        answer = Math.min(map.size(), nums.length / 2);
        
        
        // 최대한 많은 종류의 번호 개수를 return하면 된다.
        return answer;
    }
}