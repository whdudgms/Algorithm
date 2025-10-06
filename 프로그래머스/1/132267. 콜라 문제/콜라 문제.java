class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        
        // n 개 처음 주어진 콜라병 
        // a 개를 가져다 준다면 
        // b병을 받을 수 있다. 
        while(n > 0 &&  n >= a){
           int d = n / a; // 
            System.out.println("d : "+d);
            n = (d * b) + (n % a);
            System.out.println(" n : "+n);
            answer += d * b;
        }
        
        
        return answer;
    }
}