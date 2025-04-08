import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        // 작은값 정렬 
        Arrays.sort(people); // 오름차순 정렬
        int i = 0; // 가장 가벼운 사람
        int j = people.length - 1; // 가장 무거운 사람
        int count = 0;
        
          while(i <= j){
            if(people[i] + people[j] <= limit){
                i++; // 가벼운 사람도 태움
            }
            j--; // 무거운 사람은 무조건 태움
            count++; // 보트 사용
        }

        return count;
    }
}