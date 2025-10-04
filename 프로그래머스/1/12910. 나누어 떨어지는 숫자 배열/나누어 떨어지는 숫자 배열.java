import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }
        }
        
        if (arrList.isEmpty()) {
            arrList.add(-1);
        }
                
         // 오름차순 정렬
        Collections.sort(arrList);

        // List<Integer> → int[] 변환
        return arrList.stream()
                      .mapToInt(Integer::intValue)
                      .toArray();
    }
}