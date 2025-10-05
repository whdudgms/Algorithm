class Solution {
    public int solution(int left, int right) {
        int answer = 0; // 결과값을 저장할 변수

        // left부터 right까지 모든 수를 하나씩 검사
        for (int i = left; i <= right; i++) {

            int cnt = 1; // 약수 개수 (항상 자기 자신 i는 약수이므로 1부터 시작)

            // 1부터 i/2까지 반복하면서 약수를 찾음
            // (i의 절반보다 큰 수는 자기 자신 외에는 나눠떨어질 수 없기 때문)
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) cnt++; // j가 i의 약수라면 개수를 증가
            }

            // 약수 개수가 짝수면 더하고, 홀수면 빼기
            if (cnt % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer; // 계산된 결과 반환
    }
}
