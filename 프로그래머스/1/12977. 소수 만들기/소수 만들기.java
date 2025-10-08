class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j < nums.length; j++){
                for(int q = j + 1; q < nums.length; q++){
                    int sum = nums[i] + nums[j] + nums[q];
                    boolean flag = true;
                    for(int t = 2; t < sum; t++){
                        if(sum % t == 0){
                            flag = false;
                            break;
                        }
                    }
                    
                    if(flag == true){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}