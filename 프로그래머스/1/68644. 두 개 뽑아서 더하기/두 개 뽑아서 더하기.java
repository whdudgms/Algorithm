import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length -1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                ar.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = ar.stream()
            .distinct()
            .mapToInt(Integer::valueOf)
            .toArray();
            
            
            
        Arrays.sort(answer);
        
        return answer;
    }
}