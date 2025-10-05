import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length == 1){
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(min != arr[i]){
                arrList.add(arr[i]);
            }
        }
        
       return arrList.stream()
    .mapToInt(Integer::intValue)
    .toArray();

        
    }
}